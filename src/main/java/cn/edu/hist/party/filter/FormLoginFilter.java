package cn.edu.hist.party.filter;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.web.filter.PathMatchingFilter;
import org.apache.shiro.web.util.WebUtils;

/**
 *基于from表单的过滤器 
 *防止非法用户登录
 */
public class FormLoginFilter extends PathMatchingFilter {
	
	Logger log = Logger.getLogger(FormLoginFilter.class);
	
	/**
	 * 如果用户每没有登录会默认定位到登录页面
	 * 你也可以在配置文件进行修改
	 */
	private String loginUrl = "/login";
	private String successUrl = "";//登录成功后跳转的页面 可自定义
	

	/**
	 * 他俩是默认的请求参数
	 * 你也可以在配置文件中修改
	 */
	private String usernameParam="username";
	private String passwordParam="password";
	






	@Override
	protected boolean onPreHandle(
			ServletRequest request,
			ServletResponse response,
			Object mappedValue
			) throws Exception{
		
		
		if(SecurityUtils.getSubject().isAuthenticated()){
			return true; //该用户已经登录 放行
		}
		
		/**
		 * 如果用户没有登录那么有两种可能
		 * 一是他是非法用户
		 * 二是他正登录
		 */
		HttpServletRequest  req = (HttpServletRequest)request;
		HttpServletResponse  resp = (HttpServletResponse)response;
		
		
		//如果是登录请求的路径
		if(isLoginRequest(req)){
			//是否是post请求
			if("post".equalsIgnoreCase(req.getMethod())){
				if(login(req)){
					return redirectToSuccessUrl(req, resp);
				}
			}
			
			return true;
		}else{
			saveRequestAndRedirectToLogin(req, resp);
		}
			return false;
	}

	
	
	
	private boolean login(HttpServletRequest req){
		String username = req.getParameter(usernameParam);
		String password = req.getParameter(passwordParam);
		
		try{
			SecurityUtils.getSubject().login(new UsernamePasswordToken(username, password));
		}catch(Exception e){
			log.debug(e.getClass());
			req.setAttribute("shiroLoginFailure", e.getClass());
			return false;
		}
		return true;
	}
	
	/**
	 * 重定向到登录成功的页面
	 * @param req
	 * @param resp
	 * @return
	 * @throws IOException
	 * @throws ServletException 
	 */
	private boolean redirectToSuccessUrl(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		log.info("登录成功后转向的页面=="+successUrl);
		//req.getRequestDispatcher(successUrl).forward(req, resp);
		WebUtils.redirectToSavedRequest(req, resp, successUrl);
		return false;
	}

	/*
	 *重定向到登录页面并保存当前请求
	 * 
	 */
    private void saveRequestAndRedirectToLogin(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        WebUtils.saveRequest(req);
        WebUtils.issueRedirect(req, resp, loginUrl);
    }
	
	private boolean isLoginRequest(HttpServletRequest req){
		log.info("当前请求路径===="+req.getRequestURI());
		log.info("=====处理过请求路径为====="+WebUtils.getPathWithinApplication(req));
		return pathsMatch(loginUrl , WebUtils.getPathWithinApplication(req));
	}
	
	
	public void setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
	}
	public void setSuccessUrl(String successUrl) {
		this.successUrl = successUrl;
	}
	public void setUsernameParam(String usernameParam) {
		this.usernameParam = usernameParam;
	}
	public void setPasswordParam(String passwordParam) {
		this.passwordParam = passwordParam;
	}

       
}

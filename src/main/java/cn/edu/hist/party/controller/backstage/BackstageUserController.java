package cn.edu.hist.party.controller.backstage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.hist.party.base.BaseController;
import cn.edu.hist.party.entity.TbUser;
import cn.edu.hist.party.util.PasswordHelper;
import net.sf.json.JSONObject;

/**
 * 
 * @author 丁赵雷
 *
 */
@Controller
@RequestMapping("/backstage/user/")
public class BackstageUserController extends BaseController{

	private String basePath = "backstage/user/";
	

	
	/**
	 * 
	 * @param user
	 */
	@RequestMapping(value="addDo" , method=RequestMethod.POST)
	public ModelAndView addDo(
			@RequestParam(name="user" ,defaultValue="") String user1
			){
		
		TbUser user = (TbUser) JSONObject.toBean(JSONObject.fromObject(user1) , TbUser.class); 
		//给用户的密码进行加密
		PasswordHelper.encryptPassword(user);
		int num = userService.insert(user);
		
		String message = "";//响应信息
		if(num > 0){
		    message = "用户添加成功  ";	
		}else{
			message = "用户添加失败  ";
		}
		log.info("受影响的行数 =  "+num);
		log.info(message+user.toString());
		
		ModelAndView mv = getMV();
		mv.addObject("notice", message);
		mv.setViewName(basePath+"addUser");
		
		return mv; 
	}
	
	//查看个人信息
	@RequestMapping(value="/info" , method=RequestMethod.GET)
	public ModelAndView info(){
		
		String account = String.valueOf(getSubject().getPrincipal());
		
		TbUser user = userService.getUserByAccount(account);
		
		ModelAndView mv = getMV();
		if(user != null){
			mv.addObject("user", user);
		}else{
			mv.addObject("message", "无法获取您的信息");
		}
		
		log.info("user="+user);
		mv.setViewName(basePath+"userInfo");
		
		return mv;
		
	}
}

package cn.edu.hist.party.realm;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.stereotype.Component;

import com.alibaba.druid.sql.parser.Token;



public class UserRealm extends AuthorizingRealm {
	
	/*@Resource
	private UserService userService;
	Logger log = Logger.getLogger(this.getClass());
	
	@Override//授权
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		log.info("===============================我是来进行授权的=============================");
		String username = (String)principals.getPrimaryPrincipal();
		SimpleAuthorizationInfo authorization = new SimpleAuthorizationInfo();
		authorization.setRoles(userService.findRoles(username));
		authorization.setStringPermissions(userService.findPermissions(username));
		return authorization;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override//身份验证
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		log.info("===============================我是来进行身份验证的=============================");
		String username = (String)token.getPrincipal();
		
		User user = userService.findByUsername(username);
		
		if(user == null){
			log.error("账户不存在");
		}
		if(Boolean.TRUE.equals(user.getLocked())){
			log.info("该账户被锁定");
		}
		
		SimpleAuthenticationInfo  authentication = new SimpleAuthenticationInfo(
				user.getUsername(),
				user.getPassword(),
				ByteSource.Util.bytes(user.getCredentialsSalt()),
				getName());
		log.info("=====================getName()="+getName()+"=================================");
		return authentication;
	}
*/
	  @Override
	    public void clearCachedAuthorizationInfo(PrincipalCollection principals) {
	        super.clearCachedAuthorizationInfo(principals);
	    }

	    @Override
	    public void clearCachedAuthenticationInfo(PrincipalCollection principals) {
	        super.clearCachedAuthenticationInfo(principals);
	    }

	    @Override
	    public void clearCache(PrincipalCollection principals) {
	        super.clearCache(principals);
	    }

	    public void clearAllCachedAuthorizationInfo() {
	        getAuthorizationCache().clear();
	    }

	    public void clearAllCachedAuthenticationInfo() {
	        getAuthenticationCache().clear();
	    }

	    public void clearAllCache() {
	        clearAllCachedAuthenticationInfo();
	        clearAllCachedAuthorizationInfo();
	    }

		@Override
		protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
			// TODO Auto-generated method stub
			return null;
		}

}

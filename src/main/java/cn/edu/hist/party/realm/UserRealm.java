package cn.edu.hist.party.realm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import org.apache.log4j.Logger;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import cn.edu.hist.party.entity.TbRoles;
import cn.edu.hist.party.entity.TbUser;
import cn.edu.hist.party.service.TbRolePermissionService;
import cn.edu.hist.party.service.TbUserRoleService;
import cn.edu.hist.party.service.TbUserService;


/**
 * 该类继承 AuthorizingRealm 以便扩展
 * @author 丁赵雷
 *
 */
public class UserRealm extends AuthorizingRealm {
	

	TbUserService userService ;
	TbUserRoleService userRoleService;
	TbRolePermissionService rolePermissionService;
	
	
	Logger log = Logger.getLogger(this.getClass());
	/**
	 * 授予用户权限
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		
		String account = String.valueOf(principals.getPrimaryPrincipal());
		log.info("账号为"+account+"的用户开始进行授权");
		TbUser user = userService.getUserByAccount(account);
		
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		
		//保存用户所拥有可利用的角色名称
		Set<String> roles = new HashSet<String>();
		//保存用户所拥有可利用的角色的id
		List<Integer> role_ids = new ArrayList<Integer>();
		for(TbRoles role : userRoleService.findRoles(user.getId())){
			if(role.getAvailable()){//如果该角色可用
				roles.add(role.getName());
				role_ids.add(role.getId());
			}
		}
		
		//为用户分配角色
		authorizationInfo.setRoles(roles);
		
		//为用户分配权限
		Integer[] temp = new Integer[role_ids.size()];
		Integer[] _id = role_ids.toArray(temp);
		authorizationInfo.setStringPermissions(
				rolePermissionService.findPermissions(_id));
		
		log.info("账号为"+account+"的用户开始授权完成");
		return authorizationInfo;
	}

	
	/**
	 * 验证用户信息
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		
		
		String account = String.valueOf(token.getPrincipal());
		
		log.info("账号为"+account+"的用户开始进行验证");
		TbUser user = userService.getUserByAccount(account);
		
		if(user == null){
			throw new UnknownAccountException();
		}
		if(user.getLocked()){
			throw new LockedAccountException();
		}
		
		SimpleAuthenticationInfo authentication = new SimpleAuthenticationInfo(
				account,
				user.getPassword(),
				ByteSource.Util.bytes(user.getCredentialsSalt()),
				getName()
				);
				
		
		log.info("账号为"+account+"的用户验证成功");
		return authentication;
	}
	
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
	
	
	/*
	 *方便注入 
	 * 
	 */
	public void setUserService(TbUserService userService) {
		this.userService = userService;
	}


	public void setUserRoleService(TbUserRoleService userRoleService) {
		this.userRoleService = userRoleService;
	}


	public void setRolePermissionService(TbRolePermissionService rolePermissionService) {
		this.rolePermissionService = rolePermissionService;
	}

}

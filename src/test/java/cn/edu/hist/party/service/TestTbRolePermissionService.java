package cn.edu.hist.party.service;

import org.junit.Test;

import cn.edu.hist.party.base.TestBase;

public class TestTbRolePermissionService  extends TestBase{
	
	@Test
	public void findPermissions() {
		
		for(String s : rolePermissionService.findPermissions(1,2,3)){
			getLog().info(" 该用户所拥有的权限 "+s);
		}
		
	}
	
}

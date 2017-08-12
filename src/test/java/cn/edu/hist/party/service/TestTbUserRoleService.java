package cn.edu.hist.party.service;

import org.junit.Test;

import cn.edu.hist.party.base.TestBase;
import cn.edu.hist.party.entity.TbRoles;

public class TestTbUserRoleService extends TestBase{
	
	@Test
	public void TestFindZRoles(){
		for(TbRoles role : userRoleService.findRoles(1)){
			getLog().info(role);
		}
	}

}

package cn.edu.hist.party.service;

import org.junit.Test;

import cn.edu.hist.party.base.TestBase;
import cn.edu.hist.party.entity.TbRoles;

public class TestTbUserRoleService extends TestBase{
	
	@Test
	public void testFindZRoles(){
		for(TbRoles role : userRoleService.findRoles(1)){
			getLog().info(role);
		}
	}
	
	@Test
	public void testCorrelationRoles(){
		Long[] l = {1L,2L,3L,4L,5L};
		getLog().info("受影响的行数"+userRoleService.correlationRoles(1L, l));
	}
	
	
	

}

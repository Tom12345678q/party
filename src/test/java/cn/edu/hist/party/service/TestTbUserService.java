package cn.edu.hist.party.service;

import java.util.List;

import org.junit.Test;

import cn.edu.hist.party.base.TestBase;
import cn.edu.hist.party.entity.TbUser;

public class TestTbUserService extends TestBase{
	
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(TbUser record) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Test
	public void testSelectByPrimaryKey() {
		getLog().info(userService.selectByPrimaryKey(1));
	}
	
	@Test
	public void testGetUserByAccount(){
		getLog().info("user = "+userService.getUserByAccount("18238658703"));
	}

	public List<TbUser> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByPrimaryKey(TbUser record) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}

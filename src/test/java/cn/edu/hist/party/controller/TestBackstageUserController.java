package cn.edu.hist.party.controller;

import org.junit.Test;
import org.junit.Assert;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import javax.management.relation.Role;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.realm.Realm;

import cn.edu.hist.party.base.TestBase;
import cn.edu.hist.party.entity.TbUser;
import net.sf.json.JSONObject;

public class TestBackstageUserController extends TestBase{
	String basePath = "/backstage/user/manage/";

	@Test
	public void testAddDo() throws Exception{
		
		TbUser user = new TbUser();
		
		user.setEmail("1524334009@qq.com");
		user.setPhone("18238658704");
		user.setPassword("123456");
		user.setName("归海一刀");
		
		MvcResult result= mockMvc.perform(
				MockMvcRequestBuilders.post(basePath+"addDo").param("user",
						JSONObject.fromObject(user).toString()))
				.andExpect(status().isOk())
				.andDo(MockMvcResultHandlers.print())
				.andReturn();
		getLog().info(result.toString());
	}
	
	public void testView() throws Exception {
		
	}  
}

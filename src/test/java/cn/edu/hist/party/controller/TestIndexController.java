package cn.edu.hist.party.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import org.aspectj.weaver.patterns.PerFromSuper;
import org.junit.Test;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import cn.edu.hist.party.base.TestBase;

public class TestIndexController extends TestBase{
	
	@Test
	public void testLogin() throws Exception{
		mockMvc.perform(post("/login").param("username", "18238658704")
		.param("password", "123456"))
		.andExpect(status().isOk())
		.andDo(MockMvcResultHandlers.print());
		
		
	}

}

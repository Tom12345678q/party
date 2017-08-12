package cn.edu.hist.party.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.edu.hist.party.base.BaseController;
import cn.edu.hist.party.entity.TbUser;

@Controller
@RequestMapping(path="/")
public class IndexController extends BaseController{
	
	@RequestMapping(value="toIndex" , method=RequestMethod.GET)
	public String toIndex(){
		log.info("=====================toindex===========================");
		return "index";
	}
	
	
	@RequestMapping(value="toFront" , method=RequestMethod.GET)
	public String tofront(){
		log.info("=====================进入前台页面===========================");
		return "front/front-index";
	}
	
	

}

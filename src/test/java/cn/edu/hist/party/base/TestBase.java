package cn.edu.hist.party.base;

/**
 * 导入这个类里的静态方法  "classpath:spring-shiro-web.xml" ,
 */




import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;



import cn.edu.hist.party.service.TbArticleService;
import cn.edu.hist.party.service.TbDepartmentService;
import cn.edu.hist.party.service.TbIndexImageService;
import cn.edu.hist.party.service.TbInformService;
import cn.edu.hist.party.service.TbPayLogService;
import cn.edu.hist.party.service.TbQuestionService;
import cn.edu.hist.party.service.TbRolePermissionService;
import cn.edu.hist.party.service.TbRolesService;
import cn.edu.hist.party.service.TbTypeService;
import cn.edu.hist.party.service.TbUserRoleService;
import cn.edu.hist.party.service.TbUserService;
import cn.edu.hist.party.service.TbVideoService;
import cn.edu.hist.party.service.TbWatchVideoLogService;

//这是为了指定这是个web项目"classpath:spring-shiro-web.xml" ,
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)	//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {

		"classpath:test-spring-mybatis.xml" , 
		"classpath:spring-mvc.xml"})
public class TestBase {
	/**
	 * 统一在这里注册服务接口
	 */
	@Resource
	protected TbArticleService articleService;
	@Resource
	protected TbDepartmentService departmentService;
	@Resource
	protected TbIndexImageService indexImageService;
	@Resource
	protected TbInformService informService;
	@Resource
	protected TbPayLogService payLogService;
	@Resource
	protected TbQuestionService questionService;
	@Resource
	protected TbRolePermissionService rolePermissionService;
	@Resource
	protected TbRolesService rolesService;
	@Resource
	protected TbTypeService typeService;
	@Resource
	protected TbUserRoleService userRoleService;
	@Resource
	protected TbUserService userService;
	@Resource
	protected TbVideoService videoService;
	@Resource
	protected TbWatchVideoLogService watchVideoLogService;

	
	public Logger getLog() {
		return Logger.getLogger(this.getClass());
	}
	
   @Autowired  
   private WebApplicationContext wac; 
   protected MockMvc mockMvc;  
 
   @Before  
   public void setUp() {  
       mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();  
   }  

}


/**
 *  1、@WebAppConfiguration：测试环境使用，用来表示测试环境使用的ApplicationContext
 *        将是WebApplicationContext类型的；value指定web应用的根；

    2、@ContextHierarchy：指定容器层次，即spring-config.xml是父容器，而spring-mvc.xml是子容器

    3、通过@Autowired WebApplicationContext wac：注入web环境的ApplicationContext容器；

   4、然后通过MockMvcBuilders.webAppContextSetup(wac).build()创建一个MockMvc进行测试；
 */
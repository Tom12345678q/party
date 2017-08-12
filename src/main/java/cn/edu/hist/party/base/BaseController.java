package cn.edu.hist.party.base;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;

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

/**
 * 暂定为抽象类以便于扩展
 * @author 丁赵雷
 *
 */
public abstract class BaseController {
	
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
	
	
	/**
	 * 返回一个 ModelAndView 实例
	 * @return
	 */
	protected ModelAndView getMV(){
		return new ModelAndView();
	}

	protected Logger log;

	public BaseController() {
		if(log == null){
			log = Logger.getLogger(this.getClass());
		}
		log.info("log对象创建成功");
	}
}

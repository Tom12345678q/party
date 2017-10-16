package cn.edu.hist.party.service.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.edu.hist.party.base.BaseDao;
import cn.edu.hist.party.dao.TbUserRoleMapper;
import cn.edu.hist.party.entity.TbRoles;
import cn.edu.hist.party.entity.TbUserRole;
import cn.edu.hist.party.service.TbUserRoleService;

@Service("userRoleService")
public class TbUserRoleServiceImpl extends BaseDao<TbUserRole, Serializable> implements TbUserRoleService{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Resource
	public TbUserRoleMapper userRoleDao;
	

	public Set<TbRoles> findRoles(Integer userId) {
		return userRoleDao.findRoles(userId);
	}


	public int deleteByPrimaryKey(Integer id) {
		return this.deleteEntity(id);
	}


	public int insert(TbUserRole record) {
		return this.insertEntity(record);
	}


	public TbUserRole selectByPrimaryKey(Integer id) {
		return this.selectOneEntity(id);
	}


	public List<TbUserRole> selectAll() {
		return this.selectAllEntity();
	}


	public int updateByPrimaryKey(TbUserRole record) {
		return this.updateEntity(record);
	}


	@Override
	public int correlationRoles(Long userId, Long... roleIds) {
		Map<String,Object> map = new HashMap<String,Object>();
		
		map.put("userId", userId);
		map.put("roleIds", roleIds);
		
		return userRoleDao.correlationRoles(map);
	}



}
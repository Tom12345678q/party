package cn.edu.hist.party.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.edu.hist.party.dao.TbRolePermissionMapper;
import cn.edu.hist.party.entity.TbRolePermission;
import cn.edu.hist.party.service.TbRolePermissionService;

@Service("rolePermissionService")
public class TbRolePermissionServiceImpl implements TbRolePermissionService {

	@Resource
	TbRolePermissionMapper RolePermissionDao;
	
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(TbRolePermission record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public TbRolePermission selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TbRolePermission> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByPrimaryKey(TbRolePermission record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Set<String> findPermissions(Integer... roleId) {
		
		if(roleId.length>0){
			return RolePermissionDao.findPermissions(roleId);
		}else{
			return new HashSet<String>(); 
		}
	}
}
package cn.edu.hist.party.service.impl;

import cn.edu.hist.party.base.BaseDao;
import cn.edu.hist.party.dao.TbUserMapper;
import cn.edu.hist.party.entity.TbUser;
import cn.edu.hist.party.service.TbUserService;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("userService")
public class TbUserServiceImpl extends BaseDao<TbUser , Serializable> implements TbUserService {
    

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Resource
	public TbUserMapper userDao;
	
	
	public int deleteByPrimaryKey(Integer id) {
		return this.deleteEntity(id);
	}
	
	
	public int insert(TbUser record) {
		return this.insertEntity(record);
	}

	
	public TbUser selectByPrimaryKey(Integer id) {
		return this.selectOneEntity(id);
	}
	
	
	public List<TbUser> selectAll() {
		return this.selectAllEntity();
	}
	
	
	public int updateByPrimaryKey(TbUser record) {
		return this.updateEntity(record);
	}


	public TbUser getUserByAccount(String account) {
		return userDao.getUserByAccount(account);
	}

}
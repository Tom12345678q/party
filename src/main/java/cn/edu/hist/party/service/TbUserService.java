package cn.edu.hist.party.service;

import cn.edu.hist.party.entity.TbUser;
import java.util.List;

public interface TbUserService {
    int deleteByPrimaryKey(Integer id);

    int insert(TbUser record);

    TbUser selectByPrimaryKey(Integer id);

    List<TbUser> selectAll();

    int updateByPrimaryKey(TbUser record);
    
	/**
	 * 根据用户的账号来获取用户信息
	 * @param account 如用户的手机号，邮箱号
	 * @return 对象实例
	 */
	TbUser getUserByAccount(String account);
}
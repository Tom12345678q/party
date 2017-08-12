package cn.edu.hist.party.dao;

import cn.edu.hist.party.entity.TbUser;
import java.util.List;

public interface TbUserMapper {
	
	/**
	 * 根据用户的账号来获取用户信息
	 * @param account 如用户的手机号，邮箱号
	 * @return 对象实例
	 */
	TbUser getUserByAccount(String account);
     
}
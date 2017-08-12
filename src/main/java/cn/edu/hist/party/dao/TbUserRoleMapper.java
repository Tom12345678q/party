package cn.edu.hist.party.dao;

import java.util.List;
import java.util.Set;

import cn.edu.hist.party.entity.TbRoles;
import cn.edu.hist.party.entity.TbUserRole;

public interface TbUserRoleMapper {

    
    /**
     * 通过用户的id获取该用户所有的角色
     * @param userId 用户的id
     * @return 返回角色对象的集合
     */
    Set<TbRoles> findRoles(Integer userId);
    
    
}
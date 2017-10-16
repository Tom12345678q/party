package cn.edu.hist.party.dao;

import java.util.Map;
import java.util.Set;

import cn.edu.hist.party.entity.TbRoles;

public interface TbUserRoleMapper {

    
    /**
     * 通过用户的id获取该用户所有的角色
     * @param userId 用户的id
     * @return 返回角色对象的集合
     */
    Set<TbRoles> findRoles(Integer userId);
    
    /**
     * 用户与角色进行关联(角色可为多个)
     * @param map 
     * @return
     */
    public int correlationRoles(Map<String,Object> map);
    
    
    /**
     * 
     * @param map
     */
    public void uncorrelationRoles(Map<String,Object> map);
    
    
}
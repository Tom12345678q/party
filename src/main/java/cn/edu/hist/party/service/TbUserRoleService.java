package cn.edu.hist.party.service;

import java.util.List;
import java.util.Set;

import cn.edu.hist.party.entity.TbRoles;
import cn.edu.hist.party.entity.TbUserRole;

public interface TbUserRoleService {
    int deleteByPrimaryKey(Integer id);

    int insert(TbUserRole record);

    TbUserRole selectByPrimaryKey(Integer id);

    List<TbUserRole> selectAll();

    int updateByPrimaryKey(TbUserRole record);
    
    
    /**
     * 根据用户的id获取他所拥有的角色的集合
     * @param userId 用户的id
     * @return
     */
    Set<TbRoles> findRoles(Integer userId);
    
    /**
     * 将用户与角色关联起来
     * @param userId 用户id
     * @param roleIds 角色id(多个)
     * @return 受影响的行数
     */
    int correlationRoles(Long userId, Long... roleIds);
    
    

}
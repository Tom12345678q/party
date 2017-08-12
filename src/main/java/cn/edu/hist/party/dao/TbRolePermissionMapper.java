package cn.edu.hist.party.dao;

import cn.edu.hist.party.entity.TbRolePermission;
import java.util.List;
import java.util.Set;

public interface TbRolePermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbRolePermission record);

    TbRolePermission selectByPrimaryKey(Integer id);

    List<TbRolePermission> selectAll();

    int updateByPrimaryKey(TbRolePermission record);
    
    /**
     * 根据角色的id获取权限(以Set集合的形式)
     * @param roleId 可一次接受多个id
     * @return
     */
    Set<String> findPermissions(Integer... roleId);
}
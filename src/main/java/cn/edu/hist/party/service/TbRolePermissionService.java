package cn.edu.hist.party.service;

import cn.edu.hist.party.entity.TbRolePermission;
import java.util.List;

public interface TbRolePermissionService {
    int deleteByPrimaryKey(Integer id);

    int insert(TbRolePermission record);

    TbRolePermission selectByPrimaryKey(Integer id);

    List<TbRolePermission> selectAll();

    int updateByPrimaryKey(TbRolePermission record);
}
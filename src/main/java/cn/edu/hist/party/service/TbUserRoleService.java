package cn.edu.hist.party.service;

import cn.edu.hist.party.entity.TbUserRole;
import java.util.List;

public interface TbUserRoleService {
    int deleteByPrimaryKey(Integer id);

    int insert(TbUserRole record);

    TbUserRole selectByPrimaryKey(Integer id);

    List<TbUserRole> selectAll();

    int updateByPrimaryKey(TbUserRole record);
}
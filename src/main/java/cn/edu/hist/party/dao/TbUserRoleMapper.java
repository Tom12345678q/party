package cn.edu.hist.party.dao;

import cn.edu.hist.party.entity.TbUserRole;
import java.util.List;

public interface TbUserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbUserRole record);

    TbUserRole selectByPrimaryKey(Integer id);

    List<TbUserRole> selectAll();

    int updateByPrimaryKey(TbUserRole record);
}
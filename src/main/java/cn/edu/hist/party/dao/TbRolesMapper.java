package cn.edu.hist.party.dao;

import cn.edu.hist.party.entity.TbRoles;
import java.util.List;

public interface TbRolesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbRoles record);

    TbRoles selectByPrimaryKey(Integer id);

    List<TbRoles> selectAll();

    int updateByPrimaryKey(TbRoles record);
}
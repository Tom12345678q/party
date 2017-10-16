package cn.edu.hist.party.service;

import cn.edu.hist.party.entity.TbRoles;
import java.util.List;

public interface TbRolesService {
    int deleteByPrimaryKey(Integer id);

    int insert(TbRoles record);

    TbRoles selectByPrimaryKey(Integer id);

    List<TbRoles> selectAll();

    int updateByPrimaryKey(TbRoles record);
    

}
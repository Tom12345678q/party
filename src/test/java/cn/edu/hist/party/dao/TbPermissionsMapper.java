package cn.edu.hist.party.dao;

import cn.edu.hist.party.entity.TbPermissions;
import java.util.List;

public interface TbPermissionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbPermissions record);

    TbPermissions selectByPrimaryKey(Integer id);

    List<TbPermissions> selectAll();

    int updateByPrimaryKey(TbPermissions record);
}
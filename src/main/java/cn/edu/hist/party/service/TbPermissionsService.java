package cn.edu.hist.party.service;

import cn.edu.hist.party.entity.TbPermissions;
import java.util.List;

public interface TbPermissionsService {
    int deleteByPrimaryKey(Integer id);

    int insert(TbPermissions record);

    TbPermissions selectByPrimaryKey(Integer id);

    List<TbPermissions> selectAll();

    int updateByPrimaryKey(TbPermissions record);
}
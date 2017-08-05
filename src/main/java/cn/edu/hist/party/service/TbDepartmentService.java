package cn.edu.hist.party.service;

import cn.edu.hist.party.entity.TbDepartment;
import java.util.List;

public interface TbDepartmentService {
    int deleteByPrimaryKey(Integer id);

    int insert(TbDepartment record);

    TbDepartment selectByPrimaryKey(Integer id);

    List<TbDepartment> selectAll();

    int updateByPrimaryKey(TbDepartment record);
}
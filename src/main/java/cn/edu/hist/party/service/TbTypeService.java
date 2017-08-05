package cn.edu.hist.party.service;

import cn.edu.hist.party.entity.TbType;
import java.util.List;

public interface TbTypeService {
    int deleteByPrimaryKey(Integer id);

    int insert(TbType record);

    TbType selectByPrimaryKey(Integer id);

    List<TbType> selectAll();

    int updateByPrimaryKey(TbType record);
}
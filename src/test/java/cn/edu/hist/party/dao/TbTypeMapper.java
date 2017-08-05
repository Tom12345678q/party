package cn.edu.hist.party.dao;

import cn.edu.hist.party.entity.TbType;
import java.util.List;

public interface TbTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbType record);

    TbType selectByPrimaryKey(Integer id);

    List<TbType> selectAll();

    int updateByPrimaryKey(TbType record);
}
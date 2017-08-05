package cn.edu.hist.party.dao;

import cn.edu.hist.party.entity.TbPaylog;
import java.util.List;

public interface TbPaylogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbPaylog record);

    TbPaylog selectByPrimaryKey(Integer id);

    List<TbPaylog> selectAll();

    int updateByPrimaryKey(TbPaylog record);
}
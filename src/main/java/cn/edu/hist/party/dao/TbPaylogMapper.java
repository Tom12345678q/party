package cn.edu.hist.party.dao;

import cn.edu.hist.party.entity.TbPayLog;
import java.util.List;

public interface TbPayLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbPayLog record);

    TbPayLog selectByPrimaryKey(Integer id);

    List<TbPayLog> selectAll();

    int updateByPrimaryKey(TbPayLog record);
}
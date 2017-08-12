package cn.edu.hist.party.dao;

import cn.edu.hist.party.entity.TbWatchVideoLog;
import java.util.List;

public interface TbWatchVideoLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbWatchVideoLog record);

    TbWatchVideoLog selectByPrimaryKey(Integer id);

    List<TbWatchVideoLog> selectAll();

    int updateByPrimaryKey(TbWatchVideoLog record);
}
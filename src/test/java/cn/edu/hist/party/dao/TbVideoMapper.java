package cn.edu.hist.party.dao;

import cn.edu.hist.party.entity.TbVideo;
import java.util.List;

public interface TbVideoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbVideo record);

    TbVideo selectByPrimaryKey(Integer id);

    List<TbVideo> selectAll();

    int updateByPrimaryKey(TbVideo record);
}
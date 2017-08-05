package cn.edu.hist.party.dao;

import cn.edu.hist.party.entity.TbWatchvideolog;
import java.util.List;

public interface TbWatchvideologMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbWatchvideolog record);

    TbWatchvideolog selectByPrimaryKey(Integer id);

    List<TbWatchvideolog> selectAll();

    int updateByPrimaryKey(TbWatchvideolog record);
}
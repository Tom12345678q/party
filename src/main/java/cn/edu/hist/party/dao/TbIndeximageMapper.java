package cn.edu.hist.party.dao;

import cn.edu.hist.party.entity.TbIndexImage;
import java.util.List;

public interface TbIndexImageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbIndexImage record);

    TbIndexImage selectByPrimaryKey(Integer id);

    List<TbIndexImage> selectAll();

    int updateByPrimaryKey(TbIndexImage record);
}
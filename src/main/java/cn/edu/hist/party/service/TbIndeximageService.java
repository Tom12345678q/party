package cn.edu.hist.party.service;

import cn.edu.hist.party.entity.TbIndeximage;
import java.util.List;

public interface TbIndeximageService {
    int deleteByPrimaryKey(Integer id);

    int insert(TbIndeximage record);

    TbIndeximage selectByPrimaryKey(Integer id);

    List<TbIndeximage> selectAll();

    int updateByPrimaryKey(TbIndeximage record);
}
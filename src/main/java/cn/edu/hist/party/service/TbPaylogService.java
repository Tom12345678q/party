package cn.edu.hist.party.service;

import cn.edu.hist.party.entity.TbPaylog;
import java.util.List;

public interface TbPaylogService {
    int deleteByPrimaryKey(Integer id);

    int insert(TbPaylog record);

    TbPaylog selectByPrimaryKey(Integer id);

    List<TbPaylog> selectAll();

    int updateByPrimaryKey(TbPaylog record);
}
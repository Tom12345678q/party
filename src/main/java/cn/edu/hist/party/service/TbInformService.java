package cn.edu.hist.party.service;

import cn.edu.hist.party.entity.TbInform;
import java.util.List;

public interface TbInformService {
    int deleteByPrimaryKey(Integer id);

    int insert(TbInform record);

    TbInform selectByPrimaryKey(Integer id);

    List<TbInform> selectAll();

    int updateByPrimaryKey(TbInform record);
}
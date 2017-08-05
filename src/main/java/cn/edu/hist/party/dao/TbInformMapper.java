package cn.edu.hist.party.dao;

import cn.edu.hist.party.entity.TbInform;
import java.util.List;

public interface TbInformMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbInform record);

    TbInform selectByPrimaryKey(Integer id);

    List<TbInform> selectAll();

    int updateByPrimaryKey(TbInform record);
}
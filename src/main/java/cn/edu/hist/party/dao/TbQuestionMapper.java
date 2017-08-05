package cn.edu.hist.party.dao;

import cn.edu.hist.party.entity.TbQuestion;
import java.util.List;

public interface TbQuestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbQuestion record);

    TbQuestion selectByPrimaryKey(Integer id);

    List<TbQuestion> selectAll();

    int updateByPrimaryKey(TbQuestion record);
}
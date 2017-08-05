package cn.edu.hist.party.service;

import cn.edu.hist.party.entity.TbQuestion;
import java.util.List;

public interface TbQuestionService {
    int deleteByPrimaryKey(Integer id);

    int insert(TbQuestion record);

    TbQuestion selectByPrimaryKey(Integer id);

    List<TbQuestion> selectAll();

    int updateByPrimaryKey(TbQuestion record);
}
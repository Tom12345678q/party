package cn.edu.hist.party.dao;

import cn.edu.hist.party.entity.TbArticle;
import java.util.List;

public interface TbArticleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbArticle record);

    TbArticle selectByPrimaryKey(Integer id);

    List<TbArticle> selectAll();

    int updateByPrimaryKey(TbArticle record);
}
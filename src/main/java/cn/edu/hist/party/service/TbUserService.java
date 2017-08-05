package cn.edu.hist.party.service;

import cn.edu.hist.party.entity.TbUser;
import java.util.List;

public interface TbUserService {
    int deleteByPrimaryKey(Integer id);

    int insert(TbUser record);

    TbUser selectByPrimaryKey(Integer id);

    List<TbUser> selectAll();

    int updateByPrimaryKey(TbUser record);
}
package com.zx.ssm.mapper;

import com.zx.ssm.annotation.MyBatisDao;
import com.zx.ssm.entity.User;
import com.zx.ssm.entity.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
@MyBatisDao
public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
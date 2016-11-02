package com.zx.ssm.service;

import com.zx.ssm.entity.User;
import com.zx.ssm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/11/1.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> findUser() {
        return userMapper.selectByExample(null);
    }
}

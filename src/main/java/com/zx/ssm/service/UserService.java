package com.zx.ssm.service;

import com.zx.ssm.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2016/11/1.
 */
public interface UserService {
    List<User> findUser();
    User findOne();
}

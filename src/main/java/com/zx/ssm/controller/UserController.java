package com.zx.ssm.controller;

import com.zx.ssm.entity.User;
import com.zx.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Administrator on 2016/11/1.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 查找所用用户控制器方法
     *
     * @return
     * @throws Exception
     */
    @RequestMapping("/findUser")
    public ModelAndView findUser() throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        User u = userService.findOne();
        //调用service方法得到用户列表
        List<User> users = userService.findUser();
        //将得到的用户列表内容添加到ModelAndView中
        modelAndView.addObject("users", users);
        //设置响应的jsp视图
        modelAndView.setViewName("findUser");

        return modelAndView;
    }
}

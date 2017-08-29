package com.bingley.spring.mmall.controler.backend;

import com.bingley.spring.mmall.common.ServerResponse;
import com.bingley.spring.mmall.service.IUserService;
import com.bingley.spring.topic.mybatisdemo.po.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by SAM on 2017/8/19.
 */

@Controller
@RequestMapping("/manage/user")
public class UserManageController {


    private IUserService mIUserService;

    public ServerResponse<User> login(String username, String password, HttpSession session) {
        ServerResponse<User> response = mIUserService.login(username, password);

        if (response.isSuccess()) {
            User user = response.getData();
        }
        return null;
    }
}

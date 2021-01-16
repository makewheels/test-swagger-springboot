package com.eg.testswaggerspringboot.controller;

import com.eg.testswaggerspringboot.UserRequest;
import com.eg.testswaggerspringboot.UserResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @Author makewheels
 * @Time 2021.01.16 14:19:50
 */
@RestController
@RequestMapping("user")
@Api(tags = "用户接口")
public class UserController {

    @PostMapping(value = "getUserById")
    @ApiOperation(value = "通过用户id查询用户", notes = "作用是用来查询一个用户")
    @ResponseBody
    public UserResponse getUserById(@RequestBody UserRequest userRequest) {
        System.out.println(userRequest);
        UserResponse userResponse = new UserResponse();
        userResponse.setUsername(System.currentTimeMillis() + "");
        return userResponse;
    }

}


package com.sky.controller;

import com.sky.domain.User;
import com.sky.service.IUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户相关请求处理控制器
 *
 * @author zhuyong
 * @version V1.0.0
 * @date 2018/11/1 20:23
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService userService;

    /**
     * 根据用户名获取用户
     *
     * @param   name    用户名称
     * @return  {User}  用户实体
     */
    @ApiOperation(value = "根据名称获取用户", notes = "根据名称获取用户")
    @GetMapping("/user/{name}")
    @ResponseStatus(HttpStatus.OK)
    public List<User> getUserByName(@PathVariable("name")String name){
        return userService.getUserByName(name);
    }

}

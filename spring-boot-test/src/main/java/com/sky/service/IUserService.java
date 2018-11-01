package com.sky.service;

import com.sky.domain.User;

import java.util.List;

/**
 * 用户逻辑操作定义接口
 *
 * @author zhuyong
 * @version V1.0.0
 * @date 2018/11/1 20:28
 */
public interface IUserService {
    /**
     * 根据用户名获取用户
     *
     * @param   name    用户名称
     * @return  {User}  用户实体
     */
    List<User> getUserByName(String name);
}

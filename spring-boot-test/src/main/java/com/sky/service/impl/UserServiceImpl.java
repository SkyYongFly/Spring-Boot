package com.sky.service.impl;

import com.sky.domain.User;
import com.sky.repository.UserRepository;
import com.sky.service.IUserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * 用户逻辑操作定义接口
 *
 * @author zhuyong
 * @version V1.0.0
 * @date 2018/11/1 20:28
 */
@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> getUserByName(String name) {
        if(StringUtils.isBlank(name)){
            return Collections.EMPTY_LIST;
        }

        return this.userRepository.findUserByName(name);
    }
}

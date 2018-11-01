package com.sky.service.impl;

import com.sky.domain.User;
import com.sky.service.IUserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {
    @Autowired
    private IUserService userService;

    @Test
    public void testGetUserByName() throws Exception {
        List<User> users = userService.getUserByName("小明");

        assertNotNull(users);
        assertThat(users.size(), greaterThan(0));
    }
}
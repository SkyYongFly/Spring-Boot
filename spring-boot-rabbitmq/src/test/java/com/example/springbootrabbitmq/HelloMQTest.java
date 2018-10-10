package com.example.springbootrabbitmq;

import com.example.springbootrabbitmq.sender.MqSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试MQ发送接收消息
 *
 * @author zhuyong
 * @version V1.0.0
 * @date 2018/10/9 10:21
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloMQTest {
    @Autowired
    private MqSender mqSender;

    @Test
    public void hello(){
        mqSender.sendMessage();
    }
}

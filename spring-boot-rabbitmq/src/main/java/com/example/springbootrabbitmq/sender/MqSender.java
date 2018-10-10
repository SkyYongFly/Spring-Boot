package com.example.springbootrabbitmq.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 发送消息到MQ
 *
 * @author zhuyong
 * @version V1.0.0
 * @date 2018/10/9 10:08
 */
@Component
public class MqSender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    /**
     * 发送消息
     */
    public void sendMessage(){
        String message = "Hello RabbitMQ !";
        System.out.println("Sender发送消息到MQ：" + message);
        //第一个参数指定要发送到的队列
        //第二个参数指定要发送的消息
        this.amqpTemplate.convertAndSend("hello", message);
    }
}

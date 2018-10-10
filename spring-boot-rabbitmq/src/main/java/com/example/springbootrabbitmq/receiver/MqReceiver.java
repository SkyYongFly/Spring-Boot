package com.example.springbootrabbitmq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 队列消息消费者,@RabbitListener 指定要监听的队列
 *
 * @author zhuyong
 * @version V1.0.0
 * @date 2018/10/9 10:15
 */
@Component
@RabbitListener(queues = "hello")
public class MqReceiver {

    /**
     * 接收MQ消息
     *
     * @param message   队列传输的消息
     */
    @RabbitHandler
    public void receiveMessage(String message){
        System.out.println("Receiver接收到MQ消息：" + message);
    }
}

package com.example.springbootrabbitmq.queue;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RabbitMQ配置类，配置队列、交换器、路由等
 *
 * @author zhuyong
 * @version V1.0.0
 * @date 2018/10/9 10:18
 */
@Configuration
public class RabbitConfig {

    /**
     * 创建一个名为“hello”的队列
     *
     * @return
     */
    @Bean
    public Queue helloQueue(){
        return new Queue("hello");
    }
}

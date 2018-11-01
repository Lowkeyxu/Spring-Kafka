/*
 * @(#) KafkaProducer.java 2018/11/1
 *
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.lowkey.kafka.producer;

import com.google.gson.GsonBuilder;
import com.lowkey.kafka.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Date;

/**
 * Kafka消息生产者
 * @author xuwc
 * @version 1.0
 * @since 2018/11/1
 */
@RestController
@RequestMapping("/kafka")
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${kafka.topic.order}")
    private String topicOrder;

    /**
     * 发送订单消息
     */
    @RequestMapping("/send")
    public void sendOrderMessage() {
        OrderVo orderVo = new OrderVo();
        orderVo.setOrderId("xasdasdasda");
        orderVo.setDate(new Date());
        orderVo.setOrderNumber("12138");
        orderVo.setDesc(Arrays.asList("测试数据"));
        try {
            GsonBuilder builder = new GsonBuilder();
            builder.setPrettyPrinting();
            builder.setDateFormat("yyyy-MM-dd HH:mm:ss");
            String message = builder.create().toJson(orderVo);
            kafkaTemplate.send(topicOrder,"key", message);
            System.out.println("kafka 消息发送成功！");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

/*
 * @(#) KafkaConsumer.java 2018/11/1
 *
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.lowkey.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * Kafka 消费者
 * @author xuwc
 * @version 1.0
 * @since 2018/11/1
 */
public class KafkaConsumer {

    @KafkaListener(topics = "${kafka.topic.order}")
    public void listen(ConsumerRecord<?, ?> record) {
        System.out.println("kafka的key: " + record.key());
        System.out.println("kafka的value: " + record.value().toString());
    }
}

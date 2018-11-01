package com.lowkey.kafka;

import com.lowkey.kafka.producer.KafkaProducer;
import com.lowkey.kafka.vo.OrderVo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class KafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaApplication.class, args);
    }
}

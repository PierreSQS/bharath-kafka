package com.bharath.kafka.userconsumer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserConsumerService {

    @KafkaListener(topics = {"user-data-topic"})
    public void consumeData(String name, int age) {
        log.info("received data from Kafka: name-{},age-{}",name,age);
    }
}

package com.bharath.kafka.userproducer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserProducerService {
    private final KafkaTemplate<String,Integer> kafkaTemplate;

    public UserProducerService(KafkaTemplate<String,Integer> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendUserData(String name, int age) {
        log.info("Sending Data to Kafka Topic..");
        kafkaTemplate.send("user-data-topic", name,age);
    }

}

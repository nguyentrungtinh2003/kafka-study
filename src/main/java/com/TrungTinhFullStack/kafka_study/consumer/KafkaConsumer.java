package com.TrungTinhFullStack.kafka_study.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "Tinh",groupId = "myGroup")
    public void consumerMessage(String message) {
        log.info("Consumer the message from Tinh Topic {}",message);

    }
}

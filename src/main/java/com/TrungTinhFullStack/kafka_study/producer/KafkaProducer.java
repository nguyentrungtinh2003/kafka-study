package com.TrungTinhFullStack.kafka_study.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {

    private final KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(String message) {
        log.info("Message send to producer {}",message);
        kafkaTemplate.send("Tinh",message);
    }
}

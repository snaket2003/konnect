package com.snaket2003.konnect.backend.consumer;

import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@EnableKafka
public class KafkaConsumer {

    @KafkaListener(topics = "quickstart-offsets", groupId = "konnect-app")
    public void listen(final String message) {
        System.out.println("Received message: " + message);
    }
}

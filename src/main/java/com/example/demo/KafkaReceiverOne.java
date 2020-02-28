package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @Author: SaHongzhi
 * @Date: 2020-02-28 13:26
 */
@Component
@Slf4j
public class KafkaReceiverOne {
    @KafkaListener(topics = {"test-topic"},groupId = "group-one")
    public void listen(ConsumerRecord<?, ?> record) {
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {

            Object message = kafkaMessage.get();

            log.info("-record one=" + record);
            log.info("-message one=" + message);
        }

    }
}

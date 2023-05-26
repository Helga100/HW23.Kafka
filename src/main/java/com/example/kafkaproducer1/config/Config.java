package com.example.kafkaproducer1.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class Config {

    @Bean
    public NewTopic news1() {
        return TopicBuilder.name("news1")
                .build();
    }

    @Bean
    public NewTopic user1() {
        return TopicBuilder.name("user1")
                .build();
    }
}

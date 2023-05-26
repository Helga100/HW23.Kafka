package com.example.kafkaproducer1.web;

import com.example.kafkaproducer1.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/producer")
@RequiredArgsConstructor
public class ProducerController {

    private final ProducerService producerService;

    @PostMapping
    public void sendMsg(@RequestParam String topic, @RequestBody String message) {
        producerService.sendMessage(topic, message);
    }
}

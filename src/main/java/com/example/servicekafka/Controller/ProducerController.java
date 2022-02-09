package com.example.servicekafka.Controller;

import com.example.servicekafka.Books.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
public class ProducerController {
    @Autowired
    KafkaTemplate<String, Book> kafkaTemplate;

    private static final String TOPIC = "MenageService";

    @PostMapping("/publish")
    public String publishMessage(@RequestBody Book book) {
        kafkaTemplate.send(TOPIC, book);
        return "Published Successfully";
    }
}

package com.rajkumar.spring.boot.controller;

import com.rajkumar.spring.boot.domain.Topic;
import com.rajkumar.spring.boot.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/Topics")
public class TopicController {

    @Autowired
    private TopicRepository topicRepository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Topic> getTopic(@PathVariable(value = "id") Long id) {
        Topic topic = topicRepository.findById(id).get();
        return new ResponseEntity<>(topic, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Topic>> getAllTopics() {
        List<Topic> topic = topicRepository.findAll();
        return new ResponseEntity<>(topic, HttpStatus.OK);
    }
}

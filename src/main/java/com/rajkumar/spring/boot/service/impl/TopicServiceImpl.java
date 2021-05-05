package com.rajkumar.spring.boot.service.impl;

import com.rajkumar.spring.boot.domain.Topic;
import com.rajkumar.spring.boot.repository.TopicRepository;
import com.rajkumar.spring.boot.service.TopicService;
import com.rajkumar.spring.boot.service.exception.ObjectNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicServiceImpl implements TopicService {

    private final TopicRepository topicRepository;

    @Autowired
    public TopicServiceImpl(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    @Override
    public List<Topic> getTopics() {
        return topicRepository.findAll();
    }

    @Override
    public Topic getTopic(Long id) {
        // Note: use Optional.of(object) if you are sure that object is not null
        //       Use Optional.ofNullable(object) object can be null or not-null
        // Here, findById() returns the empty if object is not found in the databse that's why
        // I'm using Optional.of()
         return Optional
                .of(this.topicRepository.findById(id)).get()
                .orElseThrow(() -> new ObjectNotFound("Topic not found with this id " + id));



    }

    @Override
    public Topic addTopic(Topic topic) {
        return this.topicRepository.save(topic);
    }

    @Override
    public void deleteTopic(Long id) {

    }
}

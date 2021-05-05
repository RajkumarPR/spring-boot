package com.rajkumar.spring.boot.service;


import com.rajkumar.spring.boot.domain.Topic;

import java.util.List;
import java.util.Optional;

public interface TopicService {

    List<Topic> getTopics();

    Topic getTopic(Long id);

    Topic addTopic(Topic topic);

    void deleteTopic(Long id);
}

package com.springboottutorial.courseapi.services;

import java.util.Arrays;
import java.util.List;

import com.springboottutorial.courseapi.models.Topic;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

    List<Topic> topics = Arrays.asList(
            new Topic("spring", "Spring framework", "Spring framework"),
            new Topic("java", "Core java", "Core java descriptor"),
            new Topic("javascript", "JavaScript", "JavaScript descriptor")
        );

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
    
}

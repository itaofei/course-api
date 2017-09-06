package com.gmail.itaofei.springboot.course.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topics;
    }

    private List<Topic> topics=new ArrayList<Topic>();
    {
        topics.add(new Topic("spring","Spring Framework","Sptring Framework Desc"));
        topics.add(new Topic("java","Core Java","Core Java Desc"));
        topics.add(new Topic("javascript","JavaScript","JavaScript Desc"));
    }
}

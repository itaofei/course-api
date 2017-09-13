package com.gmail.itaofei.springboot.course;

import com.gmail.itaofei.springboot.course.domain.Topic;

import java.util.List;

public interface ITopicService {

    public List<Topic> getAllTopics();

    public Topic getTopic(String id);

    public void addTopic(Topic topic);

    public void updateTopic(Topic topic);

    public void deleteTopic(String id);

    public List<Topic> getTopics(String name, String description);
}

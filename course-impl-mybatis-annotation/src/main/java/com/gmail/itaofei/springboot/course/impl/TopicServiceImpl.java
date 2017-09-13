package com.gmail.itaofei.springboot.course.impl;

import com.gmail.itaofei.springboot.course.ITopicService;
import com.gmail.itaofei.springboot.course.domain.Topic;
import com.gmail.itaofei.springboot.course.mapper.TopicMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicServiceImpl implements ITopicService {

    @Autowired
    private TopicMapper topicMapper;

    @Override
    public List<Topic> getAllTopics() {

        return topicMapper.selectAllTopics();
    }

    @Override
    public Topic getTopic(String id) {

        return topicMapper.selectTopicById(id);
    }

    @Override
    public void addTopic(Topic topic) {

        topicMapper.insertTopic(topic);
    }

    @Override
    public void updateTopic(Topic topic) {

        topicMapper.updateTopic(topic);
    }


    @Override
    public void deleteTopic(String id) {

        topicMapper.deleteTopic(id);
    }

    @Override
    public List<Topic> searchTopics(String name, String description) {

        return topicMapper.search(name, description);
    }
}

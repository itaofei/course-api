package com.gmail.itaofei.springboot.course.impl;

import com.gmail.itaofei.springboot.course.ITopicService;
import com.gmail.itaofei.springboot.course.domain.Topic;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class DefaultTopicService implements ITopicService {

    private List<Topic> topics = new ArrayList<Topic>();

    {
        topics.add(new Topic("spring", "Spring Framework", "Sptring Framework Desc"));
        topics.add(new Topic("java", "Core Java", "Core Java Desc"));
        topics.add(new Topic("javascript", "JavaScript", "JavaScript Desc"));
    }

    @Override
    public List<Topic> getAllTopics() {

        return topics;
    }

    @Override
    public Topic getTopic(String id) {

        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    @Override
    public List<Topic> searchTopics(String name, String description) {

        if (true) {
            throw new UnsupportedOperationException();
        }
        return null;
    }

    @Override
    public void addTopic(Topic topic) {

        topics.add(topic);
    }

    @Override
    public void updateTopic(Topic topic) {

        for (int i = 0; i < topics.size(); i++) {
            if (topics.get(i).getId().equals(topic.getId())) {
                topics.set(i, topic);
                return;
            }
        }
    }

    @Override
    public void deleteTopic(String id) {

        topics.removeIf(t -> t.getId().equals(id));
    }

}

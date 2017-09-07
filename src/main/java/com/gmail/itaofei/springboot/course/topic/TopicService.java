package com.gmail.itaofei.springboot.course.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<Topic>();

    {
        topics.add(new Topic("spring", "Spring Framework", "Sptring Framework Desc"));
        topics.add(new Topic("java", "Core Java", "Core Java Desc"));
        topics.add(new Topic("javascript", "JavaScript", "JavaScript Desc"));
    }

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for (int i = 0; i < topics.size(); i++) {

            if (topics.get(i).getId().equals(id)) {
                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t->t.getId().equals(id));
    }
}

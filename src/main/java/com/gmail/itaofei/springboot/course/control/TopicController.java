package com.gmail.itaofei.springboot.course.control;

import com.gmail.itaofei.springboot.course.ITopicService;
import com.gmail.itaofei.springboot.course.domain.Topic;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TopicController {

    @Autowired
    private ITopicService topicService;

    /*
    * Get all topics.
    */
    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {

        return topicService.getAllTopics();
    }

    /*
    * Get topic by id.
    */
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable("id") String id) {

        return topicService.getTopic(id);
    }

    /*
    * Add topic.
    */
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic) {

        topicService.addTopic(topic);
    }

    /*
    * Update topic.
    */
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable("id") String id) {

        topicService.updateTopic(id, topic);
    }

    /*
    * Delete topic.
    */
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable("id") String id) {

        topicService.deleteTopic(id);
    }

}

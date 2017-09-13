package com.gmail.itaofei.springboot.course.control;

import com.gmail.itaofei.springboot.course.ITopicService;
import com.gmail.itaofei.springboot.course.domain.Topic;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.MatrixVariable;
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
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/topics")
    public List<Topic> getAllTopics() {

        return topicService.getAllTopics();
    }

    /*
    * Get topic by id.
    */
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/topics/{id}")
    public Topic getTopic(
            @PathVariable("id") String id) {

        return topicService.getTopic(id);
    }

    /*
    * Get topics by blur name or description.
    */
    @RequestMapping(
            method= RequestMethod.GET,
            value="/search/topic/{matrix}")
    public List<Topic> getTopics(@MatrixVariable Map<String,String> matrix) {

        String name = matrix.get("name");
        String description = matrix.get("description");
        return topicService.searchTopics(name, description);
    }

    /*
    * Add topic.
    */
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/topics")
    public void addTopic(
            @RequestBody Topic topic) {

        topicService.addTopic(topic);
    }

    /*
    * Update topic.
    */
    @RequestMapping(
            method = RequestMethod.PUT,
            value = "/topics")
    public void updateTopic(
            @RequestBody Topic topic) {

        topicService.updateTopic(topic);
    }

    /*
    * Delete topic.
    */
    @RequestMapping(
            method = RequestMethod.DELETE,
            value = "/topics/{id}")
    public void deleteTopic(
            @PathVariable("id") String id) {

        topicService.deleteTopic(id);
    }



}

package com.gmail.itaofei.springboot.course.mapper;

import com.gmail.itaofei.springboot.course.domain.Topic;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TopicMapper {

    @Select("select * from topic")
    List<Topic> selectAllTopics();

    @Select("select * from topic where id=#{id}")
    Topic selectTopicById(String id);

    @Insert("insert into topic(id,name,description) values(#{id},#{name},#{description})")
    void insertTopic(Topic topic);
}

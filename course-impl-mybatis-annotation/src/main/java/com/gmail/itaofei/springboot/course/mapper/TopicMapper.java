package com.gmail.itaofei.springboot.course.mapper;

import com.gmail.itaofei.springboot.course.domain.Topic;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface TopicMapper {

    @Select("select * from topic")
    List<Topic> selectAllTopics();

    @Select("select * from topic where id=#{id}")
    Topic selectTopicById(String id);

    @Insert("insert into topic(id,name,description) values(#{id},#{name},#{description})")
    void insertTopic(Topic topic);

    @Update("update topic set name=#{name},description=#{description} where id=#{id}")
    void updateTopic(Topic topic);

    @Delete("delete from topic where id=#{id}")
    void deleteTopic(String id);

    List<Topic> search(@Param("name") String name,
                       @Param("description") String description);

}

package com.grade.read.mapper;

import com.grade.read.po.ReadGrade;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ReadGradeMapper {
    @Insert("insert into read_grade values(null,#{read_id},#{read_var},#{read_name},#{read_content},#{read_date},#{read_rank},#{read_value})")
    int addGrade(ReadGrade readGrade);

    @Delete("delete from read_grade where id=#{id}")
    int delGrade(String id);

    @Update("update read_grade set readId=#{read_id}, readVar=#{read_var},readName=#{read_name},readContent=#{read_content},readDate=#{read_date},readRank=#{read_rank},readValue=#{read_value} where id=#{id}")
    int upGrade(ReadGrade readGrade);

    @Select("select * from  read_grade where id=#{id}")
    ReadGrade findOne(String id);

    @Select("select * from  read_grade")
    List<ReadGrade> findAll();


}
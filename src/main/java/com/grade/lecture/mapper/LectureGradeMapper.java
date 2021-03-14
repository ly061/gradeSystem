package com.grade.lecture.mapper;

import com.grade.lecture.po.LectureGrade;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface LectureGradeMapper{
    @Insert("insert into lec_grade values(null,#{lec_id},#{lec_var},#{lec_name},#{lec_content},#{lec_date},#{lec_rank},#{lec_value})")
    int addGrade(LectureGrade lectureGrade);

    @Delete("delete from lec_grade where id=#{id}")
    int delGrade(String id);

    @Update("update lec_grade set lecId=#{lec_id},lecVar=#{lec_var},lecName=#{lec_name},lecContent=#{lec_content},lecDate=#{lec_date},lecRank=#{lec_rank},lecValue=#{lec_value} where id=#{id}")
    int upGrade(LectureGrade lectureGrade);

    @Select("select * from lec_grade where id=#{id}")
    LectureGrade findOne(String id);

    @Select("select * from lec_grade")
    List<LectureGrade> findAll();
}
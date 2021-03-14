package com.grade.innovation.mapper;

import com.grade.innovation.po.InnoGrade;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface InnoGradeMapper {

    @Insert("insert into inno_grade values(null,#{inno_id},#{inno_var},#{inno_name},#{inno_content},#{inno_date},#{inno_rank},#{inno_level},#{inno_value})")
    int add(InnoGrade innoGrade);

    @Delete("delete from inno_grade where id=#{id}")
    int delete(String id);

    @Update("update inno_grade set  innoId=#{inno_id}, innoVar=#{inno_var},innoName=#{inno_name},innoContent=#{inno_content},innoDate=#{inno_date},innoRank=#{inno_rank},innoLevel=#{inno_level},innoValue=#{inno_value} where id=#{id}")
    int edit(InnoGrade innoGrade);

    @Select("select * from inno_grade where id=#{id}")
    InnoGrade findOne(String id);

    @Select("select * from inno_grade")
    List<InnoGrade> findAll();

}

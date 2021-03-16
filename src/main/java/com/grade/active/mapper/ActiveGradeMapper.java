package com.grade.active.mapper;

import com.grade.active.po.ActiveGradePo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ActiveGradeMapper {

    @Insert("insert into act_grade (id,act_id,act_var,act_name,act_content,act_date,act_rank,act_level,act_value) values (null,#{actId},#{actName},#{actVar},#{actContent},#{actDate},#{actRank},#{actLevel},#{actValue})")
    int addActGrade(ActiveGradePo activeGradePo);

    @Delete("delete from act_grade where id=#{id}")
    int delActGrade(String id);

    @Update("update act_grade set actId=#{act_id},actName=#{act_name},actVar=#{act_var},actContent=#{act_content},actDate=#{act_date},actRank=#{act_rank},actLevel=#{act_level},actValue=#{act_value} where id=#{id}")
    int editGrade(ActiveGradePo activeGradePo);

    @Select("select * from act_grade where id=#{id}")
    ActiveGradePo queryOne(String id);

    @Select("select * from act_grade")
    List<ActiveGradePo> queryAll();


}

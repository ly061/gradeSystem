package com.grade.total.mapper;

import com.grade.active.po.ActiveGradePo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TotalGradeMapper {

    //查询个人活动学分详情
    @Select("select * from act_grade where stuId=#{stu_id}")
    List<ActiveGradePo> querySingle(String stuId);

}

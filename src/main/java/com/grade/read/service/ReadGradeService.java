package com.grade.read.service;

import com.grade.read.po.ReadGrade;

import java.util.List;

public interface ReadGradeService {

    //增加
    int addGrade(ReadGrade readGrade);
    //删除
    int delGrade(String id);
    //修改
    int upGrade(ReadGrade readGrade);
    //查询
    ReadGrade findOne(String id);
    //查询全部
    List<ReadGrade> findAll();

}

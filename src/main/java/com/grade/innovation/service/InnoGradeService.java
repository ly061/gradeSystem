package com.grade.innovation.service;

import com.grade.innovation.po.InnoGrade;

import java.util.List;

public interface InnoGradeService {

    //增加
    int addGrade(InnoGrade innoGrade);
    //删除
    int delGrade(String id);
    //修改
    int upGrade(InnoGrade innoGrade);
    //查找
    InnoGrade findOne(String id);
    //查找全部
    List<InnoGrade> findAll();
}

package com.grade.lecture.service;

import com.grade.lecture.po.LectureGrade;

import java.util.List;

public interface LectureGradeService {

    //添加
    int addLecture(LectureGrade lectureGrade);
    //删除
    int delLecture(String id);
    //修改
    int editLecture(LectureGrade lectureGrade);
    //查询
    LectureGrade findOne(String id);
    //查询全部
    List<LectureGrade> findAll();

}

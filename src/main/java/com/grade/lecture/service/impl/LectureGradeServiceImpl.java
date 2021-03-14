package com.grade.lecture.service.impl;

import com.grade.lecture.po.LectureGrade;
import com.grade.lecture.mapper.LectureGradeMapper;
import com.grade.lecture.service.LectureGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LectureGradeServiceImpl implements LectureGradeService {
    @Autowired
    LectureGradeMapper lectureGradeMapper;

    @Override
    public int addLecture(LectureGrade lectureGrade) {
        return lectureGradeMapper.addGrade(lectureGrade);
    }

    @Override
    public int delLecture(String id) {
        return lectureGradeMapper.delGrade(id);
    }

    @Override
    public int editLecture(LectureGrade lectureGrade) {
        return lectureGradeMapper.upGrade(lectureGrade);
    }

    @Override
    public LectureGrade findOne(String id) {
        return lectureGradeMapper.findOne(id);
    }

    @Override
    public List<LectureGrade> findAll() {
        return lectureGradeMapper.findAll();
    }
}

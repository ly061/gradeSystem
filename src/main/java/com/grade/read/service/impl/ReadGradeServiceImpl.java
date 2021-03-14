package com.grade.read.service.impl;

import com.grade.read.po.ReadGrade;
import com.grade.read.mapper.ReadGradeMapper;
import com.grade.read.service.ReadGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReadGradeServiceImpl implements ReadGradeService {
    @Autowired
    ReadGradeMapper readGradeMapper;


    @Override
    public int addGrade(ReadGrade readGrade) {
        return readGradeMapper.addGrade(readGrade);
    }

    @Override
    public int delGrade(String id) {
        return readGradeMapper.delGrade(id);
    }

    @Override
    public int upGrade(ReadGrade readGrade) {
        return readGradeMapper.upGrade(readGrade);
    }

    @Override
    public ReadGrade findOne(String id) {
        return readGradeMapper.findOne(id);
    }

    @Override
    public List<ReadGrade> findAll() {
        return readGradeMapper.findAll();
    }
}

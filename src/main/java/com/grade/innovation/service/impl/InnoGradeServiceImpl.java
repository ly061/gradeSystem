package com.grade.innovation.service.impl;

import com.grade.innovation.po.InnoGrade;
import com.grade.innovation.mapper.InnoGradeMapper;
import com.grade.innovation.service.InnoGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InnoGradeServiceImpl  implements InnoGradeService {
    @Autowired
    InnoGradeMapper innoGradeMapper;

    @Override
    public int addGrade(InnoGrade innoGrade) {
        return innoGradeMapper.add(innoGrade);
    }

    @Override
    public int delGrade(String id) {
        return innoGradeMapper.delete(id);
    }

    @Override
    public int upGrade(InnoGrade innoGrade) {
        return innoGradeMapper.edit(innoGrade);
    }

    @Override
    public InnoGrade findOne(String id) {
        return innoGradeMapper.findOne(id);
    }

    @Override
    public List<InnoGrade> findAll() {
        return innoGradeMapper.findAll();
    }
}

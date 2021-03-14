package com.grade.active.service.impl;

import com.grade.active.po.ActiveGradePo;
import com.grade.active.mapper.ActiveGradeMapper;
import com.grade.active.service.ActiveGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ActiveGradeServiceImpl implements ActiveGradeService {
    @Autowired
    ActiveGradeMapper activeGradeMapper;


    @Override
    public int addActGrade(ActiveGradePo activeGradePo) {
        return activeGradeMapper.addActGrade(activeGradePo);
    }

    @Override
    public int delActGrade(String id) {
        return activeGradeMapper.delActGrade(id);
    }

    @Override
    public int editGrade(ActiveGradePo activeGradePo) {
        return activeGradeMapper.editGrade(activeGradePo);
    }

    @Override
    public ActiveGradePo queryOne(String id) {
        return activeGradeMapper.queryOne(id);
    }

    @Override
    public List<ActiveGradePo> queryAll() {
        return activeGradeMapper.queryAll();
    }


}

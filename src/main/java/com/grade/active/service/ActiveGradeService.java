package com.grade.active.service;

import com.grade.active.po.ActiveGradePo;

import java.util.List;

public interface ActiveGradeService {

    //添加
    int addActGrade(ActiveGradePo activeGradePo);
    //删除
    int delActGrade(String id);
    //修改
    int editGrade(ActiveGradePo activeGradePo);
    //通过id查询
    ActiveGradePo queryOne(String id);
    //查询全部
    List<ActiveGradePo> queryAll();

}

package com.grade.total.service.impl;

import com.grade.active.po.ActiveGradePo;
import com.grade.total.mapper.TotalGradeMapper;
import com.grade.total.service.TotalGradeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ProjectName: gradesystem
 * @Package: com.grade.total.service.impl
 * @ClassName: TotalGradeImpl
 * @Author: admin
 * @Description: TotalGradeService
 * @Date: 2021/3/14 18:17
 * @Version: 1.0
 */
public class TotalGradeImpl implements TotalGradeService {
    @Autowired
    TotalGradeMapper totalGradeMapper;


    //查询个人活动学分详情
    @Override
    public List<ActiveGradePo> querySingle(String stuId) {
        return totalGradeMapper.querySingle(stuId);
    }
}

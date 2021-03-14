package com.grade.total.service;

import com.grade.active.po.ActiveGradePo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: gradesystem
 * @Package: com.grade.total.service
 * @ClassName: TotalGradeService
 * @Author: admin
 * @Description: TotalGradeService
 * @Date: 2021/3/14 18:15
 * @Version: 1.0
 */
@Service
public interface TotalGradeService {

    //查询个人活动学分详情
    List<ActiveGradePo> querySingle(String stuId);
}

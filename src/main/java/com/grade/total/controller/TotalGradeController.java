package com.grade.total.controller;

import com.grade.total.service.TotalGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @ProjectName: gradesystem
 * @Package: com.grade.total.controller
 * @ClassName: TotalGradeController
 * @Author: admin
 * @Description: TotalGradeController
 * @Date: 2021/3/14 18:11
 * @Version: 1.0
 */
@Controller
public class TotalGradeController {
    @Autowired
    TotalGradeService totalGradeService;
    /*        //查看个人学分材料展示页面
    @RequestMapping("/showPersonalActive")
    String querySingle(Model model,@RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum){
        PageHelper.startPage(pageNum,3);

    }
    */

}

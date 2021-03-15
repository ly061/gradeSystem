package com.grade.lecture.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.grade.lecture.po.LectureGrade;
import com.grade.lecture.service.LectureGradeService;
import com.grade.utils.CommonUtil;
import com.grade.vo.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.smartcardio.CommandAPDU;
import java.util.List;


@Controller
@RequestMapping("/lec")
public class LecGradeController {
    @Autowired
    LectureGradeService lectureGradeService;

    @RequestMapping("/showAllLecture")
    String findAll(Model model, @RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum) {
        PageHelper.startPage(pageNum, 3);
        List<LectureGrade> lectureGrades = lectureGradeService.findAll();
        PageInfo<LectureGrade> lecPageInfo = new PageInfo<>(lectureGrades);
        model.addAttribute("PageInfo", lecPageInfo);
        return "aduc/lec_grade/lecture";
    }

    @RequestMapping("/addPage")
    String addPage() {
        return "aduc/lec_grade/addLecture";
    }

    @RequestMapping("/addLecture")
    ResultInfo addGrade(LectureGrade lectureGrade) {
        int num = lectureGradeService.addLecture(lectureGrade);
        if (num > 0)
            return new ResultInfo("200", "添加成功");
        return new ResultInfo("500", "添加失败");
    }

    @RequestMapping("/delGrade")
    @ResponseBody
    ResultInfo delGrade(String id) {
        int num = lectureGradeService.delLecture(id);
        if (num > 0)
            return new ResultInfo("200", "删除成功");
        return new ResultInfo("500", "删除失败");
    }

    //批量删除
    @RequestMapping("/delGrades")
    @ResponseBody
    ResultInfo delGrades(HttpServletRequest request) {
       return CommonUtil.delActives(request);
    }

    //先通过查询获取到之前的数据，查到之后存在lecture中，通过控制层跳转到editLecture页面，
    // 执行编辑操作，接着再重定向控制层的路径返回到页面上
    @RequestMapping("/editPage")
    String edit(@PathVariable String id, Model model) {
        model.addAttribute("lecture", lectureGradeService.findOne(id));
        return "aduc/lec_grade/editLecture";
    }

    @RequestMapping("/editLecture")
    ResultInfo editGrade(LectureGrade lectureGrade) {
        int num = lectureGradeService.editLecture(lectureGrade);
        if (num > 0)
            return new ResultInfo("200", "修改成功");
        return new ResultInfo("500", "修改失败");
    }

}


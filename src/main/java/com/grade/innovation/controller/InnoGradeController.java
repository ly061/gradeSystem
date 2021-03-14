package com.grade.innovation.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.grade.innovation.po.InnoGrade;
import com.grade.innovation.service.InnoGradeService;
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
import java.util.List;

@Controller
@RequestMapping("/inno")
public class InnoGradeController  {

    @Autowired
    InnoGradeService innoGradeService;

    @RequestMapping("/showAllInno")
    String findAll(Model model, @RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum) {
        PageHelper.startPage(pageNum, 2);
        List<InnoGrade> innoGrades = innoGradeService.findAll();
        PageInfo<InnoGrade> innoPageInfo = new PageInfo<>(innoGrades);
        model.addAttribute("PageInfo", innoPageInfo);
        return "aduc/inno_grade/innovation";
    }

    @RequestMapping("/addPage")
    String add() {
        return "aduc/inno_grade/addInno";
    }

    @RequestMapping("/addInno")
    ResultInfo addInno(InnoGrade innoGrade) {
        int count = innoGradeService.addGrade(innoGrade);
        if (count > 0) {
            return new ResultInfo("200", "添加成功");
        } else {
            return new ResultInfo("500", "添加失败");
        }
    }

    @RequestMapping("/delInno")
    @ResponseBody
    ResultInfo delGrade(String id) {
        int num = innoGradeService.delGrade(id);
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

    @RequestMapping("/editPage")
    String editPage(String id, Model model) {
        InnoGrade innoGrade = innoGradeService.findOne(id);
        model.addAttribute("inno", innoGrade);
        return "aduc/inno_grade/editInno";
    }

    @RequestMapping("/editInno")
    ResultInfo editInno(InnoGrade innoGrade) {
        int num = innoGradeService.upGrade(innoGrade);
        if (num > 0)
            return new ResultInfo("200", "修改成功");
        return new ResultInfo("500", "修改失败");
    }


}

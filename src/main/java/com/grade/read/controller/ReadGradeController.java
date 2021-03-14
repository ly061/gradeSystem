package com.grade.read.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.grade.read.po.ReadGrade;
import com.grade.read.service.ReadGradeService;
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
@RequestMapping("/read")
public class ReadGradeController {
    @Autowired
    ReadGradeService readGradeService;

    @RequestMapping("/showAllRead")
    String show(Model model, @RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum) {
        PageHelper.startPage(pageNum, 3);//每页显示3条记录
        List<ReadGrade> readGrades = readGradeService.findAll();
        PageInfo<ReadGrade> readPageInfo = new PageInfo<>(readGrades);
        model.addAttribute("PageInfo", readPageInfo);
        return "aduc/read_grade/read";
    }

    @RequestMapping("/addPage")
    String addPage() {
        return "aduc/read_grade/addRead";
    }

    @RequestMapping("/addRead")
    ResultInfo adddo(ReadGrade readGrade) {
        int num = readGradeService.addGrade(readGrade);
        if (num > 0)
            return new ResultInfo("200", "添加成功");
        return new ResultInfo("500", "添加失败");
    }

    @RequestMapping("/delGrade")
    @ResponseBody
    ResultInfo delGrade(String id) {
        int num = readGradeService.delGrade(id);
        if (num > 0)
            return new ResultInfo("200", "删除成功");
        return new ResultInfo("500", "删除失败");
    }

    @RequestMapping("/delGrades")
    @ResponseBody
    ResultInfo delGrades(HttpServletRequest req) {
    return CommonUtil.delActives(req);
    }

    @RequestMapping("/editPag")
    String edit(@PathVariable String id, Model model) {
        model.addAttribute("read", readGradeService.findOne(id));
        return "aduc/read_grade/editRead";
    }

    @RequestMapping("/editRead")
    ResultInfo editdo(ReadGrade readGrade) {
       int num = readGradeService.upGrade(readGrade);
        if (num > 0)
            return new ResultInfo("200", "修改成功");
        return new ResultInfo("500", "修改失败");
    }

}

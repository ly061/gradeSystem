package com.grade.active.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.grade.active.po.ActiveGradePo;
import com.grade.active.service.ActiveGradeService;
import com.grade.utils.CommonUtil;
import com.grade.vo.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/act")
public class ActGradeController {

    @Autowired
    ActiveGradeService activeGradeService;

    //查询并分页显示
    @RequestMapping("/showAllActive")
    String findAll(Model model, @RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum) {
        PageHelper.startPage(pageNum, 3);
        List<ActiveGradePo> activeGradePos = activeGradeService.queryAll();
        PageInfo<ActiveGradePo> asPageInfo = new PageInfo<>(activeGradePos);
        model.addAttribute("PageInfo", asPageInfo);
        return "aduc/active_score/active";
    }

    //增加  通过控制层跳页面
    @RequestMapping("/addPage")
    String addPage() {
        return "aduc/active_score/addActive";
    }

    //页面写的都是控制层的路径，不能页面跳页面
    //通过addPag跳到"aduc/addActive"页面执行添加方法，页面的表单携带数据根据addActive路径，
    // 执行路径下的添加方法，并重定向通过控制层路径回到页面展示
    @RequestMapping("/addActive")
    ResultInfo addAct(ActiveGradePo activeGradePo) {
        int count = activeGradeService.addActGrade(activeGradePo);
        if (count > 0) {
            return new ResultInfo("200", "添加成功");
        } else {
            return new ResultInfo("500", "添加失败");
        }
    }

    //删除
    @RequestMapping("/delGrade")
    @ResponseBody
    ResultInfo delGrade(String id) {
        int num = activeGradeService.delActGrade(id);
        if (num > 0)
            return new ResultInfo("200", "删除成功");
        return new ResultInfo("500", "删除失败");
    }

    //批量删除
    @RequestMapping("/delActives")
    @ResponseBody
    ResultInfo delGrades(HttpServletRequest request){
       return CommonUtil.delActives(request);
    }

    //修改
    @RequestMapping("/editPage")
    String editPage(@PathVariable String id,Model model) {
        model.addAttribute("active", activeGradeService.queryOne(id));
        return "aduc/active_score/editActive";
    }

    @RequestMapping("/editActive")
    ResultInfo editGrade(ActiveGradePo activeGradePo) {
        int count = activeGradeService.editGrade(activeGradePo);
        if (count > 0) {
            return new ResultInfo("200", "修改成功");
        } else {
            return new ResultInfo("500", "修改失败");
        }
    }

}
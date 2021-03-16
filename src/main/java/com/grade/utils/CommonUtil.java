package com.grade.utils;

import com.grade.active.service.ActiveGradeService;
import com.grade.innovation.service.InnoGradeService;
import com.grade.lecture.service.LectureGradeService;
import com.grade.read.service.ReadGradeService;
import com.grade.vo.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonUtil {
    @Autowired
    static ActiveGradeService activeGradeService;

    @Autowired
    InnoGradeService innoGradeService;

    @Autowired
    LectureGradeService lectureGradeService;
    @Autowired
    ReadGradeService readGradeService;

    //批量删除
    public static ResultInfo delActives(HttpServletRequest request) {
        String[] ids = request.getParameterValues("id[]");
        int num = 0;
        if (ids != null) {
            for (String id : ids) {
                num = activeGradeService.delActGrade(id);
            }
            if (num > 0)
                return new ResultInfo("200", "删除成功");
        }
        return new ResultInfo("500", "删除失败");
    }

    ResultInfo delInnos(HttpServletRequest request) {
        String[] ids = request.getParameterValues("id[]");
        int num = 0;
        if (ids != null) {
            for (String id : ids) {
                num = innoGradeService.delGrade(id);
            }
            if (num > 0)
                return new ResultInfo("200", "删除成功");
        }
        return new ResultInfo("500", "删除失败");
    }

    ResultInfo delLecs(HttpServletRequest request, FunctionalInterface func) {
        String[] ids = request.getParameterValues("id[]");
        int num = 0;
        if (ids != null) {
            for (String id : ids) {
                num = lectureGradeService.delLecture(id);
            }
            if (num > 0)
                return new ResultInfo("200", "删除成功");
        }
        return new ResultInfo("500", "删除失败");
    }

    ResultInfo delReads(HttpServletRequest request) {
        String[] ids = request.getParameterValues("id[]");
        int num = 0;
        if (ids != null) {
            for (String id : ids) {
                num = readGradeService.delGrade(id);
            }
            if (num > 0)
                return new ResultInfo("200", "删除成功");
        }
        return new ResultInfo("500", "删除失败");
    }
}

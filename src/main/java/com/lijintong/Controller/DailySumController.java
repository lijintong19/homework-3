package com.lijintong.Controller;

import com.lijintong.mapper.DailySumMapper;
import com.lijintong.model.DailySum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.Date;
import java.util.List;

@Controller
public class DailySumController {

    @Autowired
    DailySumMapper dailySumMapper;

    //查询所有的汇总信息
    @RequestMapping("/DailySum/getAll")
    public String getAll(Model model){
        List<DailySum> dailySums = dailySumMapper.queryAll();
        model.addAttribute("Dail",dailySums);
        return "Dailylist";
    }

    //跳转到添加页面
    @GetMapping("/Daily/add")
    public String toAddPage(){
        return "DailySum/DailyAdd.html";
    }

    //具体的添加操作
    @RequestMapping("/DailySum/add")
    public String AddDailySum(DailySum dailySum,Model model){
         dailySumMapper.addDailySum(dailySum);
         return "redirect:/DailySum/getAll";
    }

    //跳转到更新界面
    @GetMapping("/updateD/{id}")
    public String toUpdatePage(@PathVariable("id") Integer id,Model model){
        DailySum dailySum = dailySumMapper.queryDailySumById(id);
        model.addAttribute("dail",dailySum);
        return "DailySum/DailyUpdate.html";
    }

    //具体的修改操作
    @RequestMapping("Dailupdate")
    public String updatePage(DailySum dailySum){
        dailySumMapper.updateDailySum(dailySum);
        return "redirect:/DailySum/getAll";
    }

    //更新一个用户
    @GetMapping("/DailySum/update")
    public String updateDailySum(){
        dailySumMapper.updateDailySum(new DailySum(2,2,new Date(2000/01/01),new Date(2000/01/01),"小红",100000,50000,4,6,300000));
        return "修改成功";
    }

    //根据id查询一个用户
    @GetMapping("DailySum/getById")
    public DailySum getById(){
        DailySum dailySum = dailySumMapper.queryDailySumById(1);
        return dailySum;
    }

    //删除一个日汇总数据
    @GetMapping("/Daily/{id}")
    public String deleteDailySum(@PathVariable("id") Integer id){
        int i = dailySumMapper.deleteDailySum(id);
        return "redirect:/DailySum/getAll";
    }
}

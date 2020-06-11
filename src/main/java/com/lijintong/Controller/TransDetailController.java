package com.lijintong.Controller;

import com.lijintong.mapper.TransDetailMapper;
import com.lijintong.model.TransDetail;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.WebParam;
import java.util.Date;
import java.util.List;

@Controller
public class TransDetailController {
    @Autowired
    TransDetailMapper transDetailMapper;

    @RequestMapping("/TransDetail/getAll")
    public String  getAll(Model model){
        List<TransDetail> transDetails = transDetailMapper.queryTransDetail();
        model.addAttribute("tran",transDetails);
        return "Translist";
    }

    //跳转到添加页面
    @RequestMapping("/tadd")
    public String toaddpage(){
        return "TransDetail/TransAdd.html";
    }

    //具体的添加操作
    @RequestMapping("/tranadd")
    public String addpage(TransDetail transDetail){
        transDetailMapper.addTransDetail(transDetail);
        return "redirect:/TransDetail/getAll";
    }

    //删除
    @GetMapping("/tran/{id}")
    public String deleteTransDetail(@PathVariable("id") Integer id){
        transDetailMapper.deleteTransDetail(id);
        return "redirect:/TransDetail/getAll";
    }

    //跳转到更新页面
    @GetMapping("/updateT/{id}")
    public String toUpdatePage(@PathVariable("id")Integer id, Model model){
        TransDetail transDetail = transDetailMapper.queryTransDetailById(id);
        model.addAttribute("trans",transDetail);
        return "TransDetail/TransUpdate.html";
    }

    //将数据返回给列表
    @RequestMapping("Trans/update")
    public String update(TransDetail transDetail){
        transDetailMapper.updateTransDetail(transDetail);
        return "redirect:/TransDetail/getAll";
    }
}

package com.lijintong.Controller;

import com.lijintong.Service.CustomerServiceImpl;
import com.lijintong.mapper.CustomerMapper;
import com.lijintong.model.Customer;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private CustomerServiceImpl service;

    @Autowired
    private CustomerMapper customerMapper;

    //查询所有用户
    @RequestMapping("/cust")
    public String  queryCustomerList(Model model){
        List<Customer> customers = service.queryCustomerList();
        model.addAttribute("cust",customers);
        return "list";
    }

    //跳转到添加页面
    @GetMapping("/cust/add")
    public String toaddpage(){
        return "add";
    }

    //具体的添加一条数据
    @RequestMapping("/customer/add")
    public String addpage(Customer customer){
        customerMapper.addCustomer(customer);
        return "redirect:/cust";
    }

    //修改一个用户
    @GetMapping("/customer/updateCustomer")
    public String updateCustomer(){
        customerMapper.updateCustomer(new Customer(5, "赵六", "男", "已婚", "硕士", 215, "上海市静安区"));
        return "修改成功";
    }

    //删除一个用户
    @GetMapping("/cust/{id}")
    public String  queryCustomerById(@PathVariable("id")Integer id){
        customerMapper.deleteCustomer(id);
        return "redirect:/cust";
    }

    //跳转到修改
    @GetMapping("update/{id}")
    public String toUpdatePage(@PathVariable("id") Integer id,Model model){
        Customer customer = customerMapper.queryCustomerById(id);
        model.addAttribute("cto",customer);
        return "update";
    }

   //将数据返回给列表
    @RequestMapping("customer/update")
    public String update(Customer customer){
        customerMapper.updateCustomer(customer);
        return "redirect:/cust";
    }
}

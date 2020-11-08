package com.xm.controller;

import com.xm.entity.xmorder;
import com.xm.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("order")
public class OrderController {
      @Resource

    private OrderService orderService;

        @RequestMapping("find")
         @ResponseBody
    public List<xmorder>find(xmorder order){
          return orderService.find(order);
      }

    @RequestMapping("delete")
    @ResponseBody
    public void delete(Integer id) {
        orderService.delete(id);
    }
    @RequestMapping("add")
    @ResponseBody
    public void insert(xmorder po) {
        orderService.add(po);
    }
    @RequestMapping("huixian")
    @ResponseBody
    public xmorder selectId(Integer id){

        return orderService.select(id);
    }
    //导出
    @RequestMapping("exportBank")
    @ResponseBody
    public void exportBank(HttpServletResponse response){
        orderService.exportBank(response);
    }

    @RequestMapping("importstudent")
    public String excelImport(MultipartFile[] file, HttpSession session) {
        return orderService.excelImport(file,session);

    }

}

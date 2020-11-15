package com.xm.controller;

import com.xm.entity.Order;
import com.xm.entity.xmorder;
import com.xm.service.OrederService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController

public class OrderController {

    @Resource
    private OrederService orederService;

    @RequestMapping("findq")
    public List<Order> find() {
        return orederService.find();
    }

    @RequestMapping("deleteq")
    public void delete(@RequestParam Integer id) {
        orederService.delete(id);
    }

    @RequestMapping("addq")
    public void add(@RequestBody Order po) {
        orederService.add(po);

    }

    @RequestMapping("selectq")
    public Order select(@RequestParam Integer id) {

        return orederService.select(id);
    }

    //导出
    @RequestMapping("exportBank")
    @ResponseBody
    public void exportBank(HttpServletResponse response) {
        orederService.exportBank(response);
    }




}

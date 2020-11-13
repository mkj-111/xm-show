package com.xm.service;

import com.xm.entity.xmorder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@FeignClient(value = "xmprovider")
public interface OrderService {
    @RequestMapping("findq")
    public List<xmorder> find(@RequestBody xmorder order);

    @RequestMapping("deleteq")
    public void delete(@RequestParam Integer id);


    @RequestMapping("addq")
    public void add(@RequestBody xmorder po);


    @RequestMapping("selectq")
    public xmorder select(@RequestParam Integer id);

    //导出
    @RequestMapping("exportBank")
    @ResponseBody
    public void exportBank(HttpServletResponse response);

    @RequestMapping("/importstudent")
    @ResponseBody
    public String excelImport(@RequestParam MultipartFile[] file, HttpSession session);

}

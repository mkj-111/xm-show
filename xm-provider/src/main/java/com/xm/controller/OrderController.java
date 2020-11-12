package com.xm.controller;

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
    public List<xmorder> find(@RequestBody xmorder order) {
        return orederService.find(order);
    }

    @RequestMapping("deleteq")
    public void delete(@RequestParam Integer id) {
        orederService.delete(id);
    }

    @RequestMapping("addq")
    public void add(@RequestBody xmorder po) {
        orederService.add(po);

    }

    @RequestMapping("selectq")
    public xmorder select(@RequestParam Integer id) {

        return orederService.select(id);
    }

    //导出
    @RequestMapping("exportBank")
    @ResponseBody
    public void exportBank(HttpServletResponse response) {
        orederService.exportBank(response);
    }

    /**
     * 导入excel
     */
    @RequestMapping("/importstudent")

    public String excelImport(@RequestParam MultipartFile[] file, HttpSession session) {

        //String fileName = file.getOriginalFilename();

        int result = 0;

        try {
            //System.out.println(file.length);
            result = orederService.addStudent(file[0]);
            //System.out.println("aa");
        } catch (Exception e) {

            e.printStackTrace();
        }

        if (result > 0) {
            return "{\"result\":\"excel文件数据导入成功！\"}";
        } else {
            return "{\"result\":\"excel文件数据导入失败！\"}";
        }

    }


}

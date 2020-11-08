package com.xm.service;

import com.xm.entity.xmorder;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface OrederService {

    void add(xmorder po);

    xmorder select(Integer id);

    void delete(Integer id);

    List<xmorder> find(xmorder order);


    void exportBank(HttpServletResponse response);

    int addStudent(MultipartFile multipartFile) throws Exception;
}

package com.xm.service;

import com.xm.entity.Order;
import com.xm.entity.xmorder;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface OrederService {




    void exportBank(HttpServletResponse response);



    void delete(Integer id);

    void add(Order po);

    Order select(Integer id);

    List<Order> find();
}

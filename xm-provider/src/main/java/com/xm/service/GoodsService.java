package com.xm.service;

import com.xm.entity.xmgoods;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface GoodsService {

    void delete(Integer id);

    void add(xmgoods po);

    xmgoods select(Integer id);

    List<xmgoods> find(xmgoods goods);

    xmgoods status(Integer id);

    xmgoods xiajia(Integer id);
}

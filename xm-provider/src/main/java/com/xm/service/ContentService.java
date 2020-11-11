package com.xm.service;

import com.xm.entity.xmcontent;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ContentService {
    public List<xmcontent> findw();

    void delete(Integer id);

    void add(xmcontent po);

    xmcontent select(Integer id);

    void importExcel(MultipartFile filename);
}

package com.xm.service.Impl;

import com.xm.dao.xmcontentMapper;
import com.xm.entity.xmcontent;
import com.xm.service.ContentService;
import com.xm.utils.PoiUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ContentServiceImpl implements ContentService {
    @Resource
    private com.xm.dao.xmcontentMapper xmcontentMapper;

    @Override
    public List<xmcontent> findw() {
        return xmcontentMapper.findw();
    }

    @Override
    public void delete(Integer id) {
        xmcontentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void add(xmcontent po) {
        if (po.getId() != null) {
            xmcontentMapper.updateByPrimaryKey(po);
        } else {
            xmcontentMapper.insert(po);
        }
    }

    @Override
    public xmcontent select(Integer id) {
        return xmcontentMapper.select(id);
    }

    @Override
    public void importExcel(MultipartFile filename) {
        String[] fielarr = {"categoryId", "contentTitle", "contentUrl", "contentPic", "contentStatus", "sortOrder"};

        List<xmcontent> list = PoiUtils.importExcel(filename, fielarr, xmcontent.class);
        xmcontentMapper.add1(list);

    }
}

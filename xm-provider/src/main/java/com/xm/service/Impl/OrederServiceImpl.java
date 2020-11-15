package com.xm.service.Impl;

import com.alibaba.fastjson.JSONArray;
import com.xm.entity.Order;
import com.xm.entity.xmorder;
import com.xm.service.OrederService;
import com.xm.utils.PoiUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.util.*;

@Service
public class OrederServiceImpl implements OrederService {
    @Resource
    private com.xm.dao.OrderMapper xmorderMapper;

    @Override
    public List<Order> find() {
        return xmorderMapper.find();
    }

    @Override
    public void zhifu(Integer id) {
        xmorderMapper.zhifu(id);
    }

    @Override
    public void exportBank(HttpServletResponse response) {
        List<xmorder> list = xmorderMapper.finddoctorBean();
        for (xmorder sys : list) {
            if (sys.getOrderStatus() == 1) {
                sys.setOrderstatusname("锁定");
            } else {
                sys.setOrderstatusname("未锁定");
            }
        }
        String jsonString = JSONArray.toJSONString(list);
        JSONArray parseArray = JSONArray.parseArray(jsonString);
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("orderId", "订单编号");
        map.put("orderDate", "下单时间");
        map.put("goodsNum", "数量");
        map.put("orderPrice", "消费金额");
        map.put("Orderstatusname", "状态");
        map.put("deliverytime", "发货时间");
        map.put("orderInfo", "备注");
        PoiUtils.exportExcel(response, parseArray, map, "订单信息", "订单信息.xlsx");
    }





    @Override
    public void add(Order po) {
        if (po.getId()!= null) {
            xmorderMapper.updateByPrimaryKey(po);
        } else {
            xmorderMapper.insert(po);
        }
    }

    @Override
    public Order select(Integer id) {
        return xmorderMapper.select(id);
    }


    @Override
    public void delete(Integer id) {
        xmorderMapper.deleteByPrimaryKey(id);
    }
}

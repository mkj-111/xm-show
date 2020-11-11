package com.xm.service.Impl;

import com.alibaba.fastjson.JSONArray;
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
    private com.xm.dao.xmorderMapper xmorderMapper;

    @Override
    public List<xmorder> find(xmorder order) {
        return xmorderMapper.find(order);

    }

    @Override
    public void exportBank(HttpServletResponse response) {
        List<xmorder> list=xmorderMapper.finddoctorBean();
        for (xmorder sys : list) {
            if(sys.getOrderStatus()==1){
               sys.setOrderstatusname("锁定");
            }else{
                sys.setOrderstatusname("未锁定");
            }
        }
        String jsonString = JSONArray.toJSONString(list);
        JSONArray parseArray = JSONArray.parseArray(jsonString);
        Map<String, String> map=new LinkedHashMap<String, String>();
        map.put("orderId", "订单编号");
        map.put("orderDate", "下单时间");
        map.put("goodsNum", "数量");
        map.put("orderPrice", "消费金额");
        map.put("Orderstatusname", "状态");
        map.put("deliverytime", "发货时间");
        map.put("orderInfo", "备注");
        PoiUtils.exportExcel(response, parseArray, map, "订单信息","订单信息.xlsx");
    }

    @Override
    public int addStudent(MultipartFile file) throws Exception {
        int result = 0;
        //存放excel表中所有user数据
        List<xmorder> studentList = new ArrayList<>();

        //file.getOriginalFilename()方法 得到上传时的文件名
        String fileName = file.getOriginalFilename();
        //截取文件名的后缀
        String suffix = fileName.substring(fileName.lastIndexOf(".")+1);

        //file.getInputStream()方法  返回InputStream对象 读取文件的内容
        InputStream ins = file.getInputStream();

        Workbook wb = null;

        /*判断文件后缀
            XSSF － 提供读写Microsoft Excel OOXML XLSX格式档案的功能。
            HSSF － 提供读写Microsoft Excel XLS格式档案的功能。*/
        if(suffix.equals("xlsx")){
            wb = new XSSFWorkbook(ins);
        }else{
            wb = new HSSFWorkbook(ins);
        }

        //获取excel表单的sheet对象
        Sheet sheet = wb.getSheetAt(0);
        //如果sheet不为空，就开始遍历表中的数据
        if(null != sheet){
            //line = 2 :从表的第三行开始获取记录
            for(int line = 2; line <= sheet.getLastRowNum();line++){

                //excel表单的sheet的行对象
                Row row = sheet.getRow(line);

                //如果某行为空，跳出本行
                if(null == row){
                    continue;
                }

                //获取第一个单元格的内容
                row.getCell(0).setCellType(Cell.CELL_TYPE_STRING);
                Date sdate = row.getCell(0).getDateCellValue();

                //获取第二个单元格的内容
                Integer sum = row.getCell(1).getCellType();

                //获取第三个单元格的内容
                row.getCell(2).setCellType(Cell.CELL_TYPE_STRING);
                long price = row.getCell(2).getCellType();

                xmorder student = new xmorder();

                student.setOrderDate(sdate);
                student.setGoodsNum(sum);
                student.setOrderPrice(price);

                studentList.add(student);
            }
            for(xmorder userInfo:studentList){

                /**
                 * 判断数据库表中是否存在用户记录，若存在，则更新，不存在，则保存记录
                 */
                String name = userInfo.getGoodsName();

                int count = xmorderMapper.selectUser(name);

                if(0 == count){
                    result = xmorderMapper.addUser(userInfo);
                }else{
                    result = xmorderMapper.updateUser(userInfo);
                }



            }


        }
        return result;
    }

    @Override
    public void add(xmorder po) {
        if (po.getOrderId()!= null) {
            xmorderMapper.updateByPrimaryKey(po);
        } else {
            xmorderMapper.insert(po);
        }
    }

    @Override
    public xmorder select(Integer id) {
        return xmorderMapper.select(id);
    }


    @Override
    public void delete(Integer id) {
        xmorderMapper.deleteByPrimaryKey(id);
    }
}

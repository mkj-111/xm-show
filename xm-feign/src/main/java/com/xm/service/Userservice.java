package com.xm.service;

import com.xm.entity.SysUser;
import com.xm.entity.xmtree;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.util.List;

@FeignClient(value="xmprovider")
public interface Userservice {
    @RequestMapping("selectUserInfoByCode")
    public SysUser selectUserInfoByCode(@RequestParam String userCode);

    @RequestMapping("/selectTreeList")
    List<xmtree> selectTreeList(@RequestParam Integer userId);

    @RequestMapping("/selectPowerKeyList")
    public List<String> selectPowerKeyList(@RequestParam Integer userId);


}

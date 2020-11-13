package com.xm.service;

import com.xm.entity.Adver;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value="xmprovider")
public interface AdverService {

    @RequestMapping("findAdver")
    public List<Adver> findAdver(@RequestBody Adver adver);

    @RequestMapping("addAdver")
    public void addAdver(@RequestBody Adver adver);

    @RequestMapping("deleteAdver")
    public void deleteAdver(@RequestParam Integer id);

    @RequestMapping("findIdAdver")
    public Adver findIdAdver(@RequestParam Integer id);
}

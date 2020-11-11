package com.xm.service;

import com.xm.entity.After;

import java.util.List;

public interface AfterService {
    List<After> find();

    void getDelete(Integer id);
}

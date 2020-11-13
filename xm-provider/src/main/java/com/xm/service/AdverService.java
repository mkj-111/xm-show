package com.xm.service;

import com.xm.entity.Adver;

import java.util.List;

public interface AdverService {

    List<Adver> findAdver(Adver adver);

    void addAdver(Adver adver);

    void deleteAdver(Integer id);

    Adver findIdAdver(Integer id);
}

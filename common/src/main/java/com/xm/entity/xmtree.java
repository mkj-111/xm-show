package com.xm.entity;

import lombok.Data;

import java.util.List;

@Data
public class xmtree {
    private Integer id;

    private String text;

    private String href;

    private Integer pid;
    private boolean selectable;
    private boolean leaf;
    private List<xmtree> nodes;


}
package com.xm.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Rank {
    private Long id;

    private String name;

    private Double scale;

    private String address;

    private String email;

    private Integer gender;

    private String phone;

    private String username;

    private Integer areaId;

    private Integer memberrankId;

    private Integer status;

    private String addDate;

    private String rankName;
}
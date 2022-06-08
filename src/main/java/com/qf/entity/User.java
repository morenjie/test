package com.qf.entity;

import lombok.Data;

@Data
public class User {
    private static final long SerialVersionUID = 1L;
    private Long id;
    private String name;
    private int age;
}

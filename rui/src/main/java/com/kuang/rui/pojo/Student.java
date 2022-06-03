package com.kuang.rui.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private long sid;
    private String sname;
    private Integer gender;//0:女 1：男
    private String sclass;
    private Integer cid;

}

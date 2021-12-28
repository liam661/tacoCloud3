package com.liam.taco3.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description
 * @Author liam661
 * @Date 2021/12/26 14:58
 **/
@Data
@ToString
public class User implements Serializable {
    private Long id;
    private String username;
    private String password;
    private Date createTime;
}

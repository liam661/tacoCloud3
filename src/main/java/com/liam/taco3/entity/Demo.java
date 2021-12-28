package com.liam.taco3.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description
 * @Author liam661
 * @Date 2021/12/26 11:37
 **/
@Data
@Entity
@Table(name = "tb_demo")
public class Demo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Column(name = "create_time")
    private Date createTime;
}

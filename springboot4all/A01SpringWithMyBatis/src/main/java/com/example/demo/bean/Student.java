package com.example.demo.bean;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description:
 * @Author: Answer  2019/8/10 10:43
 */
@Setter
@Getter
@ToString
public class Student implements Serializable {

    private String sno;

    private String name;

    private String sex;
}

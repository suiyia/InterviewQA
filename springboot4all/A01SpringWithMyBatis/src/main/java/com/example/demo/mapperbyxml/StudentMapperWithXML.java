package com.example.demo.mapperbyxml;

import com.example.demo.bean.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description:
 * @Author: Answer  2019/8/10 11:00
 */
@Mapper
public interface StudentMapperWithXML {

    int add(Student student);

    int update(Student student);

    int deleteBySno(String sno);

    Student queryStudentBySno(String sno);

}

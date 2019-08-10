package com.example.demo.controller;

import com.example.demo.bean.Student;
import com.example.demo.mapperbyinject.StudentManagerWithInject;
import com.example.demo.mapperbyxml.StudentMapperWithXML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: Answer  2019/8/10 10:53
 */
@RestController
public class TestController {


    @Autowired
    private StudentManagerWithInject studentManagerWithInject;

    @Autowired
    private StudentMapperWithXML studentMapperWithXML;

    @RequestMapping(value = "/querystudent",method = RequestMethod.GET)
    public Student queryStudentBySno(
        @RequestParam String sno){
        return studentManagerWithInject.queryStudentBySno(sno);
    }

    @RequestMapping(value = "/querystudentwithxml",method = RequestMethod.GET)
    public Student queryStudentWithXMLBySno(
        @RequestParam String sno){
        return studentMapperWithXML.queryStudentBySno(sno);
    }
}

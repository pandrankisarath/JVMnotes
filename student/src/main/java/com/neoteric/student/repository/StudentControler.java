package com.neoteric.student.repository;

import com.neoteric.student.model.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentControler {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "/getStudent")
    public List<StudentEntity> getStudent(){
        return  studentService.getStudent();
    }
    @GetMapping(value = "/getTeachercount")
    public int getTeachercount(){
        SchoolService ss=new SchoolService();
        return ss.getTeachercount();
    }
    @GetMapping(value = "/getadd")
    public int getadd(){
        SchoolService ss=new SchoolService();
        return ss.getadd();
    }
    @GetMapping(value = "/getremove")
    public int getremove(){
        SchoolService ss=new SchoolService();
        return ss.getremove();
    }

}

package com.example.shenmi;

import com.example.shenmi.mapper.StudentMapper;
import com.example.shenmi.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Yang ShengYuan
 * @date 2019/5/18
 * @Description ${DESCRIBE}
 **/
@Controller
public class StudentController {
    @Autowired
    StudentMapper studentMapper;

    @RequestMapping("/listStudent")
    public String listStuednt(Model model){
        List<Student> students = studentMapper.findAll();
        model.addAttribute("student", students);
        return "listStudent";
    }

}

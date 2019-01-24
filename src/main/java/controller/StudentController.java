package controller;

import entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.StudentService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class StudentController {
@Resource

    private StudentService studentService;

@RequestMapping("/getAll")
    public  String getAll( Model model ){

    List<Student> list = studentService.getAll();


    model.addAttribute("list",list);

    return  "/list.jsp";
}
    @ResponseBody
    @RequestMapping("/add")
    public Map add( String name, String gender, Integer age, Integer telephone, String email, Integer classId){
        Map map = new HashMap();
        Student student = new Student(name,age,gender,telephone,email,classId);
        boolean flag = studentService.add(student);
        if (flag){
            map.put("code",200);
            map.put("msg","添加成功！");
        }
        if(!flag){
            map.put("code",500);
            map.put("msg","添加失败！");
        }
        return map;
    }

}

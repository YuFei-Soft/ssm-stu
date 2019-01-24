package controller;

import entity.Classes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.ClassesService;

import javax.annotation.Resource;
import java.util.List;
@Controller
public class ClassesController {
    @Resource
    private ClassesService service;
    @RequestMapping("/getClasses")
    public String getClasses( Model model){
        List<Classes> classes = service.getAllClasses();
        model.addAttribute("classes",classes);
        return "/add.jsp";
    }
}

package service.impl;

import entity.Classes;
import mapper.ClassesMapper;
import org.springframework.stereotype.Service;
import service.ClassesService;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ClassesServiceImpl implements ClassesService {
    @Resource
    ClassesMapper classesMapper;
    @Override
    public List<Classes> getAllClasses() {
        return classesMapper.getAllClasses();
    }
}

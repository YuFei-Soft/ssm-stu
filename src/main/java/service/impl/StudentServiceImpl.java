package service.impl;

import entity.Student;
import mapper.StudentMapper;
import org.springframework.stereotype.Service;
import service.StudentService;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
@Resource
private StudentMapper studentMapper;
    @Override
    public List<Student> getAll() {

        return studentMapper.getAll();
    }

    @Override
    public boolean add( Student student ) {

        return studentMapper.add(student)==1;
    }
}

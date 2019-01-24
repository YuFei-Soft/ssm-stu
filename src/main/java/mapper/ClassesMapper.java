package mapper;

import entity.Classes;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ClassesMapper {
    //C. 查询所有的班级信息
    @Select("select id classId,name className from classes")
    public List<Classes> getAllClasses();
}

package mapper;

import entity.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
    //查询所有学生的接口
    @Select("SELECT s.*,c.`name` className FROM student  s JOIN  classes c ON  s.`classId`=c.`id`")
    public List<Student> getAll();

    //添加学生
    @Insert("insert into student  values(default,#{name},#{age}," +
            "#{gender},#{telephone},#{email},#{classId})")
    public  int add(Student student);

}

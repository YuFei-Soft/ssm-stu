package entity;

public class Student {
    private  Integer id;
    private String name;
    private  Integer age;
    private  String gender;
    private  Integer telephone;
    private  String email;
    private  Integer classId;
    private  String className;

    public Student( String name, Integer age, String gender, Integer telephone, String email, Integer classId ) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.telephone = telephone;
        this.email = email;
        this.classId = classId;
    }


    public String getClassName() {
        return className;
    }

    public void setClassName( String className ) {
        this.className = className;
    }

    public Student( Integer id, String name, Integer age, String gender, Integer telephone, String email, Integer classId ) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.telephone = telephone;
        this.email = email;
        this.classId = classId;

    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", telephone=" + telephone +
                ", email='" + email + '\'' +
                ", classId=" + classId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge( Integer age ) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender( String gender ) {
        this.gender = gender;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone( Integer telephone ) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId( Integer classId ) {
        this.classId = classId;
    }
}

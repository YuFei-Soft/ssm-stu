<%--
  Created by IntelliJ IDEA.
  User: Thinkpad
  Date: 2019/1/21
  Time: 9:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>学员添加信息</h1>
<form id="f1">
    姓名：<input name="name" id="f2"><br>
    性别：<input name="gender" id="f3"><br>
    年龄：<input name="age" id="f4"><br>
    电话：<input name="telephone" id="f5"><br>
    email：<input name="email" id="f6"><br>
    班级：<select name="classId">
    <option value="-1">请选择</option>
    <c:forEach items="${classes}" var="classes">
        <option value="${classes.classId}">${classes.className}</option>
    </c:forEach>
</select><br>
    <input type="button" value="添加" id="save">
</form>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">
    $(function () {
        $("#save").click(function () {
            if ($("#f2").val()=="") {
                alert("姓名不能为空");
            }else if ($("#f3").val()==""){
                alert("性别不能为空")
            }
            else if ($("#f4").val()==""){
                alert("年龄不能为空")
            }
            else if ($("#f5").val()==""){
                alert("电话不能为空")
            }
            else if ($("#f6").val()==""){
                alert("email不能为空")
            }else {
                $.getJSON("/add",$("#f1").serialize(),function (data) {
                    if (data.code==200){
                        location="getAll";
                    } else if (data.code==500) {
                        alert(data.msg);
                    }
                })
            }
        });
        $("#back").click(function () {
            history.back();
        })
    });
</script>
</body>
</html>

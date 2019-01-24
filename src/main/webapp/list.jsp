<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 2019/1/21
  Time: 9:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>学生信息列表</h1>
<div>
    <a href="getClasses">添加学员</a>
</div>
<table border="1" width="600" id="list">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>性别</th>
        <th>电话</th>
        <th>邮箱</th>
        <th>班级名称</th>
    </tr>
    <c:forEach items="${list}" var="student">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.age}</td>
            <td>${student.gender}</td>
            <td>${student.telephone}</td>
            <td>${student.email}</td>
            <td>${student.className}</td>
        </tr>
    </c:forEach>

</table>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">
    $(function () {
        $("#list tr:not(:first):even").css("background-color","green");
    })
</script>

</body>
</html>

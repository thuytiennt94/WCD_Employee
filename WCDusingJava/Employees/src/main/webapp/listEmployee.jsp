<%--
  Created by IntelliJ IDEA.
  User: HP PC
  Date: 06/06/2023
  Time: 7:38 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Employee</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>

<h1>List User</h1>
<a href="employees?action=new" class="btn btn-primary">
    Add Employee
</a>
<table class="table ">
    <thead>
    <tr>
        <th scope="col">STT</th>
        <th scope="col">Name</th>
        <th scope="col">Birthday</th>
        <th scope="col">Address</th>
        <th scope="col">Position</th>
        <th scope="col">Department</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <c:choose>
        <c:when test="${not empty employees}">
            <c:forEach items="${employees}" var="employee" varStatus="loop">
                <tr>
                    <th class="text-center">${employee.id}</th>
                    <th class="text-center">${employee.name}</th>
                    <th class="text-center">${employee.birthday}</th>
                    <th class="text-center">${employee.address}</th>
                    <th class="text-center">${employee.position}</th>
                    <th class="text-center">${employee.department}</th>
                </tr>
            </c:forEach>
        </c:when>
        <c:otherwise>
            <tr>
                <td colspan="6">Danh sách nhân viên trống</td>
            </tr>
        </c:otherwise>
    </c:choose>
    </tbody>


    </tbody>
</table>

</body>
</html>

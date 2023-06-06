<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Employee</title>
</head>
<body>
    <form action="add_employee.jsp" method="post">
        <label for="full_name">Full Name:</label>
        <input type="text" id="full_name" name="full_name" required><br>

        <label for="birthday">Birthday:</label>
        <input type="date" id="birthday" name="birthday" required><br>

        <label for="address">Address:</label>
        <input type="text" id="address" name="address" required><br>

        <label for="position">Position:</label>
        <input type="text" id="position" name="position" required><br>

        <label for="department">Department:</label>
        <input type="text" id="department" name="department" required><br>

        <input type="submit" value="Submit">
        <input type="reset" value="Reset">
    </form>
</body>
</html>

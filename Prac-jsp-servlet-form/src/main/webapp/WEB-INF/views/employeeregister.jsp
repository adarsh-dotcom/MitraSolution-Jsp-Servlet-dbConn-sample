<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <form action= " <%= request.getContextPath() %>/employeeregister" method="post">
        <label for="employee_id">Employee ID:</label>
        <input type="text" id="employee_id" name="employee_id" required><br><br>
        
        <label for="first_name">First Name:</label>
        <input type="text" id="first_name" name="first_name" required><br><br>
        
        <label for="last_name">Last Name:</label>
        <input type="text" id="last_name" name="last_name" required><br><br>
        
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>
        
        <label for="salary">Salary:</label>
        <input type="number" id="salary" name="salary" required><br><br>
        
        <label for="city">City:</label>
        <input type="text" id="city" name="city" required><br><br>
        
        <button type="submit">Save</button>
    </form>

</body>
</html>
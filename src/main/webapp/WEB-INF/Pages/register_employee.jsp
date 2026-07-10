<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<h1 style="color:red;text-align:center">Register Employee</h1>

<frm:form action="register" method="post" modelAttribute="emp">
<table align="center" bgcolor="cyan">
<tr>
   <td>Employee Name</td>
   <td><frm:input path="ename"/></td>
</tr>

<tr>
   <td>Employee Job </td>
   <td><frm:input path="job"/></td>
</tr>

<tr>
   <td>Employee Salary</td>
   <td><frm:input path="salary"/></td>
</tr>

<tr>
   <td>Employee Deptno</td>
   <td><frm:input path="dno"/></td>
</tr>
<tr>
    <td colspan="2" align="center">
        <input type="submit" value="register">
    </td>
</tr>
    <h2 style="color:green;text-align:center">
    ${resultMsg}
</h2>
</table>
</frm:form>
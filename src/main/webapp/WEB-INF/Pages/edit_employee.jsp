<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<h1 align="center" style="color:red">Update Employee</h1>

<frm:form action="emp_edit" method="post" modelAttribute="emp">

<table align="center" bgcolor="cyan">

<tr>
<td>Employee Id</td>
<td>
<frm:input path="eid" readonly="true"/>
</td>
</tr>

<tr>
<td>Name</td>
<td>
<frm:input path="ename"/>
</td>
</tr>

<tr>
<td>Job</td>
<td>
<frm:input path="job"/>
</td>
</tr>

<tr>
<td>Salary</td>
<td>
<frm:input path="salary"/>
</td>
</tr>

<tr>
<td>Dept No</td>
<td>
<frm:input path="dno"/>
</td>
</tr>

<tr>
<td colspan="2" align="center">
<input type="submit" value="Update Employee">
</td>
</tr>

</table>

</frm:form>
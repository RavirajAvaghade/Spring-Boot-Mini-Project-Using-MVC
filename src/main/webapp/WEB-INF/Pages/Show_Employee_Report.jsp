<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Report</title>
</head>
<body>

<h1 style="color:red;text-align:center;">Employee Report</h1>

<c:if test="${!empty resultMsg}">
    <h2 style="color:green;text-align:center;">
        ${resultMsg}
    </h2>
</c:if>

<c:choose>

    <c:when test="${!empty empsList}">

        <table border="1" align="center" bgcolor="yellow">

            <tr style="color:red">
                <th>Employee ID</th>
                <th>Employee Name</th>
                <th>Job</th>
                <th>Salary</th>
                <th>Dept No</th>
                <th>Operations</th>
            </tr>

            <c:forEach var="emp" items="${empsList}">

                <tr style="color:blue">

                    <td>${emp.eid}</td>
                    <td>${emp.ename}</td>
                    <td>${emp.job}</td>
                    <td>${emp.salary}</td>
                    <td>${emp.dno}</td>

                    <td>

                        <a href="emp_edit?no=${emp.eid}">
                            <img src="images/edit.jpg" width="30" height="30"/>
                        </a>

                        &nbsp;&nbsp;

                        <a href="edit_delete?no=${emp.eid}"
                           onclick="return confirm('Are you sure you want to delete Employee ${emp.eid}?')">

                            <img src="images/delete.jpg" width="30" height="30"/>

                        </a>

                    </td>

                </tr>

            </c:forEach>

        </table>

    </c:when>

    <c:otherwise>

        <h2 style="color:red;text-align:center;">
            Employee Records Not Found
        </h2>

    </c:otherwise>

</c:choose>

<br><br>

<h3 style="text-align:center;">

    <a href="register">Register Employee</a>

    &nbsp;&nbsp;&nbsp;&nbsp;

    <a href="Home"> Home</a>

</h3>

</body>
</html>
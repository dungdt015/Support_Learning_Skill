<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Execution</title>
    </head>
    <body>
        <h2>My Execution</h2>
        <form action="execution" method="POST">
            Enter a String (str): <input type="text" name="string" required /><br/>
            Enter an integer (n): <input type="number" name="number" required /><br/>
            Result: <input type="text" name="result" value="${result}" readonly /><br/>
            <input type="submit" value="SUB FIRST" />
            <c:if test="${not empty error}">
                <p style="color:black;">${error}</p>
            </c:if>
        </form> 

        <h3>List of Executions:</h3>
        <table border="1">
            <tr>
                <th>String str</th>
                <th>Index n</th>
                <th>Result</th>
            </tr>

            <c:forEach var="exec" items="${executions}">
                <tr>
                    <td>${exec[0]}</td>
                    <td>${exec[1]}</td>
                    <td>${exec[2]}</td>
                </tr>
            </c:forEach>
        </table>


    </body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>View Test Page</title>
</head>
<body>
<h2>설정 테스트 ${name}</h2>
<div>JSP 뿌리기</div>
<c:forEach var="item" items="${list}" varStatus="idx">
    ${idx.index} : ${item} <br />
</c:forEach>


<%
    //mariaDB 준비
    Class.forName("org.mariadb.jdbc.Driver");
    System.out.println("mariadb 사용가능");

    // mariaDB 연결
    Connection conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/statistc", "root","aosldk12");
    System.out.println(conn + "<-- conn");

    // 쿼리
    PreparedStatement stmt = conn.prepareStatement("select * from requestInfo");
    System.out.println(stmt + "<-- stmt");

    // 쿼리 실행
    ResultSet rs = stmt.executeQuery();

%>
<table border="1">
    <tr>
        <td>requestid</td>
        <td>requestcode</td>
        <td>userid</td>
        <td>createdate</td>
    </tr>

    <%
        while(rs.next()){
    %>
    <tr>
        <td><%=rs.getString("requestID") %></td>
        <td><%=rs.getString("requestCode") %></td>
        <td><%=rs.getString("userID") %></td>
        <td><%=rs.getString("createDate") %></td>
    </tr>

    <%
        }
    %>
</table>

</body>
</html>
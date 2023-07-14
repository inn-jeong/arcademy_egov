<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
		table{
			width:400px;
			border-collapse: collapse;
		}
		th,td{
			border: 1px solid #ccc;
			padding: 5px;
		}
	</style>
</head>
<body>
	<table>
		<caption>사원목록</caption>
		<tr>
			<th>사원번호</th>
			<th>사원이름</th>
			<th>부서번호</th>
		</tr>
		<c:forEach var="result" items="${resultList}" varStatus="status">
  			<tr>
  				<td>${result.empno}</td>
  				<td>${result.ename}</td>
  				<td>${result.deptno}</td>
  			</tr>
		</c:forEach>
	</table>
</body>
</html>
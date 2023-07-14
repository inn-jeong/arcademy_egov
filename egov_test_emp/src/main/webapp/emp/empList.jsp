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
			width:800px;
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
			<th>직업</th>
			<th>매니저</th>
			<th>입사일자</th>
			<th>급여</th>
			<th>커미션</th>
			<th>부서번호</th>
		</tr>
		<c:forEach var="result" items="${resultList}" varStatus="status">
  			<tr>
  				<td>${result.empno}</td>
  				<td> <a href="./empDetail.do?empno=${result.empno}">${result.ename}</a></td>
  				<td>${result.job}</td>
  				<td>${result.mgr}</td>
  				<td>${result.hiredate}</td>
  				<td>${result.sal}</td>
  				<td>${result.comm}</td>
  				<td>${result.deptno}</td>
  			</tr>
		</c:forEach>
	</table>
</body>
</html>
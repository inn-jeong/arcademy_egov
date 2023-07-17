<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="empModifySave.do">
		<table>
			<tr>
				<th>사원번호</th>
				<td> <input type="text" name="empno" value="${empVO.empno}" readonly> </td>
			</tr>
			<tr>
				<th>사원이름</th>
				<td> <input type="text" name="ename" value="${empVO.ename}"> </td>
			</tr>
			<tr>
				<th>부서번호</th>
				<td> <input type="text" name="deptno" value="${empVO.deptno}"> </td>
			</tr>
			<tr>
				<td align="center" colspan="2">
					<button type="submit">저장</button>
					<a href="empList.do">
						<button type="button">취소</button>
					</a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
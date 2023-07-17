<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<caption>사원정보</caption>
		<tr>
			<th>사원번호</th>
			<td>${empVO.empno}</td>
		</tr>
		<tr>
			<th>사원이름</th>
			<td>${empVO.ename}</td>
		</tr>
		<tr>
			<th>직업</th>
			<td>${empVO.job}</td>
		</tr>
		<tr>
			<th>매니저</th>
			<td>${empVO.mgr}</td>
		</tr>
		<tr>
			<th>입사일자</th>
			<td>${empVO.hiredate}</td>
		</tr>
		<tr>			
			<th>급여</th>
			<td>${empVO.sal}</td>
		</tr>
		<tr>			
			<th>커미션</th>
			<td>${empVO.comm}</td>
		</tr>
		<tr>			
			<th>부서번호</th>
			<td>${empVO.deptno}</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<button onclick="location='empModify.do?empno=${empVO.empno}'">수정</button>
				<button onclick="location='empDelete.do?empno=${empVO.empno}'">삭제</button>
				<a href="empList.do">
					<button>목록보기</button>
				</a>
			</td>
		</tr>
	</table>
</body>
</html>
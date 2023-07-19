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
			width:700px;
			border-collapse: collapse;
		}
		th,td{
			border: 1px solid #ccc;
			padding: 5px;
		}
		#border-zero{
			border: 0;
		}
	</style>
	<script type="text/javascript">
		function fn_delete(code){
			if(confirm("정말 삭제하시겠습니까?")){
				location = "deleteCode.do?code="+code;
			}
		}
	</script>
</head>
<body>
	<table>
		<caption><b>게시판</b></caption>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>등록일</th>
			<th>조회수</th>
		</tr>
		<c:set var="count" value="1"/>
		<c:forEach var="result" items="${resultList}" varStatus="status">
  			<tr>
<%--   				<td align="center">${result.unq}</td> --%>
  				<td align="center">${count}</td>
  				<td align="center" width="200px">
  					<a href="boardDetail.do?unq=${result.unq}">${result.title}</a>
  				</td>
  				<td align="center" width="150px">${result.name}</td>
<%--   				<td align="center"> <button type="button" onclick="location='deleteCode.do?code=${result.code}'">삭제</button> </td> --%>
  				<td align="center" width="200px">${result.rdate1}</td>
  				<td align="center">${result.hits}</td>
  			</tr>
  			<c:set var="count" value="${count+1}"></c:set>
		</c:forEach>
		<tr>
			<td colspan="5" align="right" id="border-zero">
				<button type="button" onclick="location='boardWrite.do'">새로작성</button>
			</td>
		</tr>
	</table>
</body>
</html>
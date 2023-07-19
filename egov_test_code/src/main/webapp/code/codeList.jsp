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
	<script type="text/javascript">
		function fn_delete(code){
			if(confirm("정말 삭제하시겠습니까?")){
				location = "deleteCode.do?code="+code;
			}
		}
	</script>
</head>
<body>
	<p>Total: ${total} 개</p>
	<table>
		<caption><b>코드목록</b></caption>
		<tr>
			<th>번호</th>
			<th>그룹명</th>
			<th>코드명</th>
			<th>구분</th>
		</tr>
		<c:set var="count" value="1"/>
		<c:forEach var="result" items="${resultList}" varStatus="status">
  			<tr>
<%--   				<td align="center">${result.code}</td> --%>
				<td align="center">${count}</td>
  				<td align="center"> 
					<c:if test="${result.gid==1}">job</c:if>
					<c:if test="${result.gid==2}">hobby</c:if>
				</td>
  				<td align="center">${result.name}</td>
<%--   				<td align="center"> <button type="button" onclick="location='deleteCode.do?code=${result.code}'">삭제</button> </td> --%>
  				<td align="center"> 
  					<button type="button" onclick="location='updateCodeView.do?code=${result.code}'">수정</button> 
  					<button type="button" onclick="fn_delete('${result.code}')">삭제</button>
  				</td>
  			</tr>
			<c:set var="count" value="${count+1}"/>
  			
		</c:forEach>
		<tr>
			<td colspan="4" align="center"> <button type="button" onclick="location='codeWrite.do'">새로작성</button> </td>
		</tr>
	</table>
</body>
</html>
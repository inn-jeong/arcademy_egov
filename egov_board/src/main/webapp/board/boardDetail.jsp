<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
		table {
			width: 400px;
			border-collapse: collapse;
		}
		th, td{
			border: 1px solid #ccc;
			padding: 3px;
		}
		.textarea{
			width: 98%;
			height: 70px;
		}
	</style>
	<script src="/egov_board/script/jquery.js"></script>
	<script type="text/javascript">
		function check_pass(){
			var pass = $("#pass").val();
			var unq = $("#unq").val();
			if($.trim(pass)==""){
				alert("비밀번호를 입력해주세용.");
				return false;
			}
			$.ajax({
				type:"POST",
				data:{
					'unq':unq,
					'pass':pass
				},
				url:"checkPass.do",
				dataType:"text",
				success: function(data){
					if(data == "same"){
// 						alert("일치");	
						location.href='boardModify.do?unq='+unq;
					}else{
						alert("비밀번호 불일치");						
					}
				},
				error: function(){
					alert("오류발생");
				}
			});
		}
	</script>
</head>
<body>
	<input type="hidden" id="unq" value="${boardVO.unq}">
	<table>
		<caption>게시판 상세보기</caption>
		<tr>
			<th width="20%"> 제목</th>
			<td width="80%"> ${boardVO.title} </td>
		</tr>
		<tr>
			<th> 암호</th>
			<td> <input type="password" id="pass" name="pass"> </td>
		</tr>
		<tr>
			<th>글쓴이</th>
			<td> ${boardVO.name} </td>
		</tr>
		<tr>
			<th>내용</th>
			<td> <textarea name="content" class="textarea" disabled>${boardVO.content}</textarea> </td>
		</tr>
		<tr align="center">
			<td colspan="2">
				<button type="submit" onclick="check_pass(); return false;">수정하기</button>
				<button type="button" onclick="location='boardList.do'">목록보기</button>
			</td>
		</tr>
	</table>
</body>
</html>
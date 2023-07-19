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
		function fn_submit(){
// 			if(document.frm.title.value==""){
// 				alert("제목을 입력해 주세용!");
// 				document.frm.title.focus();
// 				return false;
// 			}
// 			if(document.frm.pass.value==""){
// 				alert("암호를 입력해 주세용!");
// 				document.frm.pass.focus();
// 				return false;
// 			}
// 			if($("#title").val()==""){
			//$.trim() 으로 공백 잡기
			if($.trim($("#title").val())==""){
				alert("제목을 입력해 주세용!");
				$("#title").focus();
				return false;
			}
			if($.trim($("#pass").val())==""){
				alert("암호를 입력해 주세용!");
				$("#pass").focus();
				return false;
			}
// 			document.frm.submit();
			var formData = $("#frm").serialize();
			$.ajax({
				type:"POST",
				data:formData,
				url:"boardModifySave.do",
				dataType:"text",
				success: function(data){
					if(data == "ok"){
						alert("수정완료");	
						location.href='boardList.do';
					}else{
						alert("수정실패");						
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
<!-- 	<form name="frm" method="post" action="boardWriteSave.do"> -->
	<form id="frm">
		<input type="hidden" name="unq" value="${boardVO.unq}">
		<table>
			<caption>게시판 수정</caption>
			<tr>
				<th width="20%"> <label for="title">제목</label></th>
				<td width="80%"> <input type="text" id="title" name="title" value="${boardVO.title}"> </td>
			</tr>
			<tr>
				<th> <label for="pass">암호</label></th>
				<td> <input type="password" id="pass" name="pass"> </td>
			</tr>
			<tr>
				<th>글쓴이</th>
				<td> <input type="text" name="name" value="${boardVO.name}"> </td>
			</tr>
			<tr>
				<th>내용</th>
				<td> <textarea name="content" class="textarea">${boardVO.content}</textarea> </td>
			</tr>
			<tr align="center">
				<td colspan="2">
					<button type="submit" onclick="fn_submit(); return false;">수정</button>
					<button type="reset">취소</button>
					<button type="button" onclick="location='boardList.do'">목록보기</button>
				</td>
			</tr>
			
		</table>
	</form>
</body>
</html>
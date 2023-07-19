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
	<script type="text/javascript">
		function fn_submit(){
			if(document.frm.name.value==""){
				alert("코드명을 입력해주세요.");
				document.frm.name.focus();
				return false;
			}
			document.frm.submit();
		}
	</script>
</head>
<body>
	<input type="hidden" id="val_gid" value="${vo.gid}">
	<form name="frm" method="post" action="updateCode.do">
		<input type="hidden" name="code" value="${vo.code}">
		<table>
			<tr>
				<th>분류</th>
				<td>
					<select name="gid">
						<option id="gid1" value="1">Job(업무)</option>
						<option id="gid2" value="2">Hobby(취미)</option>
					</select>
				</td>
			</tr>
			<tr>
				<th>코드명</th>
				<td> <input type="text" name="name" value="${vo.name}"> </td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="button" onclick="fn_submit(); return false;">수정</button>
					<button type="button" onclick="location='codeList.do'">취소</button>
				</td>
			</tr>
		</table>
	</form>
</body>
	<script type="text/javascript">
		//콤보박스 선택 구현
		if(document.getElementById('val_gid').value=='1'){
			document.getElementById('gid1').selected=true;
		}else{
			document.getElementById('gid2').selected=true;
		}
	</script>
</html>

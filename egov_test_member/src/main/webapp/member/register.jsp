<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="reg_frm" method="post" action="insertMember.do">
		<table border="1" align="center">
			<tr height="50">
				<td colspan="2" align="center">
					<h1>회원 가입 신청</h1>
				</td>
			</tr>
<!-- mem_uid  -->
<!-- mem_pwd  -->
<!-- mem_name  -->
<!-- mem_email -->
<!-- mem_address -->

			<tr height="30">
				<td width="80">User ID</td>
				<td>
					<input name="mem_uid" type="text" size="20">*
				</td>
			</tr>
			<tr height="30">
				<td width="80">암    호</td>
				<td>
					<input name="mem_pwd" type="password" size="20">*
				</td>
			</tr>
<!-- 			<tr height="30"> -->
<!-- 				<td width="80">암호 확인</td> -->
<!-- 				<td> -->
<!-- 					<input name="pwd_check" type="password" size="20">* -->
<!-- 				</td> -->
<!-- 			</tr> -->
			<tr height="30">
				<td width="80">이   름</td>
				<td>
					<input name="mem_name" type="text" size="20">*
				</td>
			</tr>
<!-- 			<tr height="30"> -->
<!-- 				<td width="80">E-mail</td> -->
<!-- 				<td> -->
<!-- 					<input name="mem_email" type="text" size="30">* -->
<!-- 				</td> -->
<!-- 			</tr> -->
<!-- 			<tr height="30"> -->
<!-- 				<td width="80">주    소</td> -->
<!-- 				<td> -->
<!-- 					<input name="mem_address" type="text" size="40"> -->
<!-- 				</td> -->
<!-- 			</tr> -->
			<tr height="30">
				<td width="80" colspan="2" align="center">
					<input type="submit" value="등록">
<!-- 					<input type="button" value="등록" onclick="check_OK();"> -->
<!-- 					<input type="reset" value="다시입력"> -->
<!-- 					<input type="button" value="가입안함" onclick="javascript:window.location='login.jsp'"> -->
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
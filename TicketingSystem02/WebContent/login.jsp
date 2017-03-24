<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ticketing</title>
<script src="js/jquery.js"></script>
</head>
<body>
	<form id="user" name="user" action="rest/login/checkin" method="POST">
		用户名：<input type="text" name="name" id="name"><br>
		密 码：<input type="password" name="pass" id="pass"><br>
		<input type="submit" name="sub" value="提交">
		<a href="javascript:post()"> 提交</a>
	</form>
</body>
<script type="text/javascript">
	function post(){
		//利用Jquery封装的Ajax向后台发送表单信息  
		$.ajax({  
	        url :"rest/login/in",  
	        type : "POST",  
	        data:$("#user").serialize(),  
	        success : function(obj){
	        	alert(obj)
	        }
		});
	}  



</script>





</html>
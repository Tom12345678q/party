<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>河南科技学院党员在线-登录</title>
</head>

<link rel="stylesheet" href="${rootPath }static/css/bootstrap.min.css" />
<link rel="stylesheet" href="${rootPath }static/css/denglu.css" />

<body>
<div class="container">
<div class="beijing"  style="position:absolute; z-index:-1;">
    	<img  class="img-responsive" width="100%;" src="${rootPath }static/images/denglubeijingyi.png">
</div>
<div class="title">
	<p>河南科技学院信息工程学院星火在线</p>
</div>
<form role="form"  action="${rootPath }login"  method="POST" onsubmit=" md5()">
<!--用户名一栏-->
<div class="row">
 <div class="col-lg-4 col-lg-offset-4 col-md-8 col-md-offset-2 col-xs-8 col-xs-offset-2">
  <div class="row">
  <div class="form-group">
  	<div class="col-lg-3  col-md-3 col-xs-3">
    <label for="inputEmail3" class="control-label">账号:</label>
    </div>
    <div class="col-lg-8  col-md-8 col-xs-8">
      <input  type="text"  name="username"  class="form-control" id="inputEmail3">
    </div>
    </div>
  </div>
 </div>
</div>
<!--密码一栏-->
<div class="row">
 <div class="col-lg-4 col-lg-offset-4 col-md-8 col-md-offset-2 col-xs-8 col-xs-offset-2">
  <div class="row">
  <div class="form-group">
  	<div class="col-lg-4   col-md-4 col-xs-4">
    <label for="inputEmail3" class="control-label">密码:</label>
    </div>
    <div class="col-lg-8 col-lg-pull-1 col-md-8 col-xs-8">
      <input  type="password" name="password"  class="form-control" id="inputEmail3"  >
    </div> 
   
      <h4>${loginMeg}</h4>  
    </div>
  </div>
 </div>
</div>
<!--验证码一栏-->
<div class="row">
 <div class="col-lg-4 col-lg-offset-4 col-md-8 col-md-offset-2 col-xs-8 col-xs-offset-2">
  <div class="row">
  <div class="form-group">
  	<div class="col-lg-3 col-md-3 col-xs-3">
    <label for="inputEmail3" class="control-label">验证码:</label>
    </div>
    <div class="col-lg-4 col-md-4 col-xs-4">
      <input  type="text" class="form-control" id="codeMeg" placeholder=""  name=""  >
    </div>
    
          <a href="javascript:void(0)" onclick="refresh()">
           <img alt="点击刷新" src="" id="yan" /></a>
    </div>
  </div>
 </div>
  
</div>
  <button type="submit" class="btn btn-default">登录</button>
</form>

</div>
<script type="text/javascript">
$(function(){
    $('#beijing').height($(window).height());
    $('#beijing').width($(window).width());
});
</script>
<script type="text/javascript">
	if('${codeMeg}'!=null){
		document.getElementById("codeMeg").setAttribute("placeholder",'${codeMeg}');
		
	}
/* 	function refresh() {
		document.getElementById("yan").src = "${rootPath}validation?s="
				+ new Date();
	} */
	function md5(){
		/* var list=document.getElementsByTagName("input");
		var pwd=list[1].value;		
		var sha = hex_sha1(pwd);		
		list[1].value=sha; */
		
	}
</script>
</body>
</html>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台页面</title>
<link rel="stylesheet" href="${staticPath }css/bootstrap.css" />
<link rel="stylesheet" href="${staticPath }css/head.css" />
${jqueryPath}
</head>
<body>
<div class="page">


	<div class="menu">


		<dl class="channel">
			<dt>
				个人中心<img src="${staticPath }images/select_xl01.png">
			</dt>
			<dd>
				<button id="test" onclick="jump('user/info');" >个人信息</button>
			</dd>
			<dd>
				<a target="_top" href="${rootPath }backend/userInfo/logOut">退出登录</a>
			</dd>
		</dl>
		<dl>
			<dt>权限管理</dt>
			<dd>角色列表</dd>
			<dd>角色分配</dd>
			<dd>权限列表</dd>
			<dd>权限分配</dd>
		</dl>
	</div>	
	
	<div id="content">
			内容区
	</div>

</div>
</body>
<script type="text/javascript">
function jump(path){
	var _url = "${backPath }"+path
    console.log("url = "+_url);
    $.ajax({
    	url:_url,
    	type:'get',
    	dateType:'html',
    	error:function(){
    		console.log("----------error---------------------")
    	},
    	success:function(data){
    		$("#content").html(data);
    	},
    	complete:function(){
    		console.log("请求已经完成");
    	}
    });
    
}


/* $(function(){
    $('#background').height($(window).height());
    $('#background').width($(window).width());
}); */
</script>
</html>
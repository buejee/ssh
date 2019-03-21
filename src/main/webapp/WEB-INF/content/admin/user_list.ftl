<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户列表</title>
<style type="text/css">
   ul li span{display:inline-block;width:100px;}
</style>
</head>
<body>
     <h2>欢迎来到用户列表页</h2>
     <ul>
         <li>
             <span>id</span>
	         <span>用户名</span>
	         <span>电话</span>
	         <span>年龄</span>
	         <span>创建日期</span>
	         <span>状态</span>
	         <span>操作</span>
         </li>
         <#list users as user>
         <li>
            <span>${user.id}</span>
            <span>${user.username}</span>
            <span>${user.mobile}</span>
            <span>${user.age}</span>
            <span>${user.createDate}</span>
            <span>${user.status?string("ok","error")}</span>
            <span><a href="${base}/admin/user!detail.action?id=${user.id}">用户详情</a></span>
         </li>
         </#list>
     </ul>
</body>
</html>
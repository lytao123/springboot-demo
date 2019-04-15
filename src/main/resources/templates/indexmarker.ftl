<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>indexmarker</title>
<link rel="stylesheet" href="/bootstrap-4.3.1-dist/css/bootstrap.min.css">  
<script src="/bootstrap-4.3.1-dist/js/bootstrap.min.js"></script>
</head>
<body>
<#if title == "1">
     <caption>标题</caption>
   <#elseif title == "2">
     <caption>测试</caption>
   <#else>
     <caption>${title}</caption>
</#if>
  <table class="table table-bordered table-hover">
  	<thead>
  		<tr>
  			<td>序号</td>
  			<td>姓名</td>
  		</tr>
  	</thead>
  	<tbody>
  		<#list users as user>
  		<tr>
  			<td>${user.id}</td>
  			<td>${user.name}</td>
  		</tr>
  		</#list>
  	</tbody>
  </table>
</body>
</html>
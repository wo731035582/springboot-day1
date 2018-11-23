<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath}/css/common.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div class="wrap">
<!-- main begin-->
  <div class="sale">
    <h1 class="lf">在线拍卖系统</h1>
    <div class="logout right"><a href="#" title="注销">注销</a></div>
  </div>
  <div class="forms">
  <form action="${pageContext.request.contextPath }/auction/getAll.do" method="post">
    <label for="name">名称</label>
    <input name="name" type="text" class="nwinput" id="name" value=""/>
    <label for="names">描述</label>
    <input name="desc" type="text" id="names" class="nwinput" value=""/>
    <label for="time">开始时间</label>
  
    <input name="startTime" type="text" id="time" class="nwinput" value=""/>
    <label for="end-time">结束时间</label>
    <input name="endTime" type="text" id="end-time" class="nwinput" value="" />
    <label for="price">起拍价</label>
    <input name="startPrice" type="text" id="price" class="nwinput" value="" />
    <input name="" type="submit"  value="查询" class="spbg buttombg f14  sale-buttom"/>
   <a href="${pageContext.request.contextPath }/add.jsp"> <input type="button"  value="发布" class="spbg buttombg f14  sale-buttom buttomb"/> </a>
    </form>
  </div>
  
  
  <div class="items">
      <ul class="rows even strong">
        <li>名称</li>
        <li class="list-wd">描述</li>
        <li>开始时间</li>
        <li>结束时间</li>
        <li>起拍价</li>
        <li class="borderno">操作</li>
      </ul>
  <c:forEach items="${requestScope.alist }" var="a" varStatus="sta">
  	<c:if test="${sta.index%2==0 }"><ul class="rows"> </c:if>
  		<c:if test="${sta.index%2!=0 }">  <ul class="rows even"></c:if>
        <li><a href="国书" title="">${a.name}</a></li>
        <li class="list-wd">${a.desc}</li>
        <li>  <fmt:formatDate value="${a.startTime}" pattern="yyyy-MM-dd HH:mm:ss"/></li>
        <li> <fmt:formatDate value="${a.endTime}" pattern="yyyy-MM-dd HH:mm:ss"/></li>
        <li>${a.startPrice}</li>
        <li class="borderno red">
       <c:if test="${sessionScope.user.is_admin==0 }"> <a href="${pageContext.request.contextPath }/record/getAll.do?id=${a.id}">竞拍</a> </c:if>
		<c:if test="${sessionScope.user.is_admin==1 }">
		 <a href="${pageContext.request.contextPath }/auction/getOne.do?id=${a.id}" title="修改" onclick="dele();">修改</a>|
          <a href="${pageContext.request.contextPath }/auction/delete.do?id=${a.id}" title="删除" onclick="abc();">删除</a>
          </c:if>
        </li>
      </ul>
</c:forEach>
  
 
  </div>
  <script>
   function abc(){
	   
	   if(confirm("你真的确认要修改吗？请确认")){
	    
		   return true;
		 }
		 else{
			 return false;
			 }
			 
	   };
	   function dele(){
		   if(confirm("你真的确认要修改吗？请确认")){
			   return true;
			   }
			   else{
				   return false;
				   }
		   }
  </script>
<!-- main end-->
</div>
</body>
</html>

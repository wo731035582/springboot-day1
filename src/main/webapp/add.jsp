<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
      <div class="login logns produce">
        <h1 class="blues">拍卖品信息</h1>
        <form action="${pageContext.request.contextPath }/auction/add.do" method="post" enctype="multipart/form-data">
          <dl>
            <dd >
              <label>名称：</label>
              <input type="text" class="inputh lf" value="" name="name" />
              <div class="xzkbg spbg lf"></div>
            </dd>
            <dd>
              <label>起拍价：</label>
              <input type="text" class="inputh lf" value="" name="startPrice" />
              <div class="lf red laba">必须为数字</div>
            </dd>
            <dd>
              <label>底价：</label>
              <input type="text" class="inputh lf" value="" name="upset" />
              <div class="lf red laba">必须为数字</div>
            </dd>
            <dd>
              <label>开始时间：</label>
              <input type="text" class="inputh lf" value="" name="startTime"  />
              <div class="lf red laba">格式：2010-05-05 12:30:00</div>
            </dd>
            <dd>
              <label>结束时间：</label>
              <input type="text" class="inputh lf" value="" name="endTime" />
              <div class="lf red laba">格式：2010-05-06 16:30:00</div>
            </dd>
            <dd class="dds">
              <label>拍卖品图片：</label>
               <div class="lf salebd"><a href="#"><img src="/auction_ssm/images/ad20.jpg" width="100" height="100" /></a></div>
              <input name="myPhoto" type="file" class="offset10 lf" />
             
            </dd>
             <dd class="dds">
              <label>描述：</label>
              <textarea name="desc" cols="" rows="" class="textarea" ></textarea>
            </dd>
            <dd class="hegas">
                <input name="" type="submit" value="保 存" class="spbg buttombg buttombgs buttomb f14 lf" />
                <input name="" type="button" value="取 消" class="spbg buttombg buttombgs buttomb f14 lf" />
            </dd>
          </dl>
          </form>
    </div>
<!-- main end-->
<!-- footer begin-->

</div>
 <!--footer end-->
 
</div>
</body>
</html>

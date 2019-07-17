<%--
  Created by IntelliJ IDEA.
  User: cy
  Date: 2019/6/25
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>index</title>
    <script src="https://libs.baidu.com/jquery/1.7.2/jquery.min.js"></script>    <script type="text/javascript">
      $(function () {
          $.post("show",function (data) {
              var  result="";
              for (var i = 0; i < data.length; i++) {
                  result+="<dl>";
                  result+="<dt style='cursor: pointer'>"+data[i].name+"</dt>";
                  for (var j = 0; j <data[i].children.length ; j++) {
                      result+="<dd>"+data[i].children[j].name+"</dd>";
                  }
                  result+="</dl>";
              }
              $("body").html(result);
          });
          //点击事件
          $("dt").live("click",function () {
              $(this).siblings().slideToggle(1000);
          });
      })
    </script>
  </head>
  <body>
  </body>
</html>

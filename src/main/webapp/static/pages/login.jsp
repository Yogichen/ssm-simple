<%--
  Created by IntelliJ IDEA.
  User: Yogi
  Date: 2016/8/18
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ page isELIgnored="false" %>
<%
    String context = request.getContextPath();
    pageContext.setAttribute("context_", context);
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="/static/css/index.css">
    <script type="text/javascript" src="http://lib.sinaapp.com/js/jquery/1.9.1/jquery-1.9.1.min.js"></script>
</head>
<body>

<form id="login" action="/user/index" method="post">
    <h1>Log In</h1>
    <fieldset id="inputs">
        <input name="userName" id="userName" type="text" placeholder="Username" autofocus required>
        <input name="password" id="password"  type="password" placeholder="Password" required>
        <input name="Captcha" id="Captcha" type="text" placeholder="验证码" required>
        <img style=" float:right;" title="点击更换" id="img_captcha" onclick="javascript:refreshCaptcha();"
             src="/servlet/captchaCode">
    </fieldset>
    <input type="checkbox" name="rememberMe" value="true"/> Remember me
    <fieldset id="actions">
        <input type="submit" id="submit" value="Log in">
    </fieldset>
</form>


<script type="text/javascript">
    var context_ = '${context_}';

    var userName = '${userName}';
      if(userName != null || userName != ""){
        $("#userName").val(userName);
      }

    function refreshCaptcha() {
        $("#img_captcha").attr("src", context_ + "/servlet/captchaCode?t=" + Math.random());
    }
</script>

</body>
</html>


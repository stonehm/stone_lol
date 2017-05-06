<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Home</title>
    <link href="${pageContext.request.contextPath}/libs/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            padding-top: 40px;
            padding-bottom: 40px;
            background-color: #eee;
        }

        .form-sign-in {
            max-width: 330px;
            padding: 15px;
            margin: 0 auto;
        }

        .form-sign-in .form-sign-in-heading,
        .form-sign-in .checkbox {
            margin-bottom: 10px;
        }

        .form-sign-in .checkbox {
            font-weight: normal;
        }

        .form-sign-in .form-control {
            position: relative;
            height: auto;
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            box-sizing: border-box;
            padding: 10px;
            font-size: 16px;
        }

        .form-sign-in .form-control:focus {
            z-index: 2;
        }

        .form-sign-in input[type="email"] {
            margin-bottom: -1px;
            border-bottom-right-radius: 0;
            border-bottom-left-radius: 0;
        }

        .form-sign-in input[type="password"] {
            margin-bottom: 10px;
            border-top-left-radius: 0;
            border-top-right-radius: 0;
        }
    </style>
</head>
<body>
<div class="container">
    <form class="form-sign-in" role="form"
          action="${pageContext.request.contextPath}/stone/user/operation/login"
          method="post">
        <h2 class="form-sign-in-heading">请登录</h2>
        <input type="text" class="form-control" name="username" placeholder="请输入用户名" required autofocus>
        <input type="password" class="form-control" name="password" placeholder="请输入密码" required>
        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> 记住俺
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
    </form>
</div> <!-- /container -->
</body>
</html>
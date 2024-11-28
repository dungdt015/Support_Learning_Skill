<%-- 
    Document   : login
    Created on : Oct 7, 2022, 9:53:51 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
    <head>
        <title>Happy Programming</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap" rel="stylesheet">

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

        <link rel="stylesheet" href="css/style-login.css">

    </head>
    <body class="img js-fullheight" style="background-image: url(images/bg.jpg);">
        <section class="ftco-section">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-md-6 text-center mb-5">
                        <h2 class="heading-section">Sign In</h2>
                    </div>
                </div>
                <div class="row justify-content-center">
                    <div class="col-md-6 col-lg-4">
                        <div class="login-wrap p-0">
                            <h5 class="mb-4 text-center" style="color: white">${error}</h5>
                            <form action="login" method="post" class="signin-form">
                                <div class="form-group">
                                    <input type="text" name="username" class="form-control" placeholder="Username" value="${username}" required>
                                </div>
                                <div class="form-group">
                                    <input id="password-field" type="password" name="password" class="form-control" value="${password}" placeholder="Password" required>
                                    <span toggle="#password-field" class="fa fa-fw fa-eye field-icon toggle-password"></span>
                                </div>
                                <div class="form-group">
                                    <button type="submit" class="form-control btn btn-primary submit px-3">Sign In</button>
                                </div>
                                <div class="form-group d-md-flex">
                                    <div class="w-50">
                                        <label class="checkbox-wrap checkbox-primary">Remember Me
                                            <input type="checkbox" name="remember" checked>
                                            <span class="checkmark"></span>
                                        </label>
                                    </div>
                                    <div class="w-50 text-md-right">
                                        <a href="forgot" style="color: #fff">Forgot Password</a>
                                    </div>
                                </div>
                                <div class="form-input" style="text-align: center;margin-top: 50px;font-size: 23px">
                                    Do not have an account?<a href="register"> Sign Up    </a><br>
                                    Or return to <a href="index">Home Page</a>
                                </div>
                            </form>
                                    <%if(session.getAttribute("error") != null) {
                                        session.removeAttribute("error");
                                    }%>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <script src="js/jquery.min.js"></script>
        <script src="js/popper.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/main-login.js"></script>

    </body>
</html>



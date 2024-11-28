<%-- 
    Document   : forgotPassword
    Created on : Oct 18, 2022, 9:05:09 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Password reset page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <style>
            .form-gap {
                padding-top: 100px;
            }

            .testpanel {
                margin-bottom: 20px;
                background: rgba(255, 255, 255, .8);
                border: 1px solid transparent;
                border-radius: 4px;
                -webkit-box-shadow: 0 1px 1px rgb(0 0 0 / 5%);
                box-shadow: 0 1px 1px rgb(0 0 0 / 5%);
            }

            .btn-primary, .btn-primary:hover, .btn-primary:active, .btn-primary:visited {
                background-color: #5fcf80 !important;
                border: 1px solid #5fcf80 !important;
            }
        </style>

    </head>
    <body class="img js-fullheight" style="background-image: url('https://images6.alphacoders.com/705/705836.jpg');">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
        <div class="form-gap"></div>
        <div class="container d-flex justify-content-center">
            <div class="row">
                <div class="col-md-4 col-md-offset-4">
                    <div class="testpanel panel-default">
                        <div class="panel-body">
                            <div class="text-center">
                                <h3><i class="fa fa-lock fa-4x"></i></h3>
                                <h2 class="text-center text-sm-start">Forgot Password?</h2>
                                <p>If you've forgotten your password, enter your account and email here.</p>
                                <%
                                    if(request.getAttribute("message")!=null)
                                    {
                                        out.print("<p class='text-danger ml-1'>"+request.getAttribute("message")+"</p>");
                                    }
                                %>
                                <div class="panel-body">

                                    <form id="register-form" action="forgot" role="form" autocomplete="on" class="form" method="post">

                                        <div class="form-group">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-envelope color-blue"></i></span>
                                                <input id="username" name="username" placeholder="Enter your username" class="form-control"  type="text" required="">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-envelope color-blue"></i></span>
                                                <input id="email" name="email" placeholder="Enter your email address" class="form-control"  type="email" required="">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <input name="recover-submit" class="btn btn-lg btn-primary btn-block" value="Reset Password" type="submit">
                                        </div>

                                        <input type="hidden" class="hide" name="token" id="token" value=""> 
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

<%-- 
    Document   : newPass
    Created on : Oct 18, 2022, 10:13:26 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Password</title>
        <link
            href='https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css'
            rel='stylesheet'>
        <link
            href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.0.3/css/font-awesome.css'
            rel='stylesheet'>
        <script type='text/javascript'
        src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
        <style>
            .placeicon {
                font-family: fontawesome
            }

            .custom-control-label::before {
                background-color: #5fcf80;
                border: #5fcf80;
            }
            .bg-info{
                background-color: #5fcf80!important;
                background-image: url(images/newpassbg.jpg);
            }
        </style>
    </head>
    <body oncontextmenu='return false' class='snippet-body bg-info'>
        <link rel="stylesheet"
              href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-social/5.1.1/bootstrap-social.css">
        <div>
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-12 col-md-9 col-lg-7 col-xl-6 mt-5">
                        <div class="container bg-white rounded mt-2 mb-2 px-0">
                            <div class="row justify-content-center align-items-center pt-3">
                                <h1>
                                    <strong>Reset Password</strong>
                                </h1>
                            </div>
                            <div class="pt-3 pb-3">
                                <%if(request.getAttribute("message") != null) {%>
                                <p><%=(String)request.getAttribute("message")%></p>
                                <%}%>
                                <form class="form-horizontal" action="forgot" method="POST">
                                    <div class="form-group row justify-content-center px-3">
                                        <div class="col-9 px-0">
                                            <input type="password" name="password" placeholder="&#xf084; &nbsp; New Password"
                                                   class="form-control border-info placeicon">
                                        </div>
                                    </div>
                                    <div class="form-group row justify-content-center px-3">
                                        <div class="col-9 px-0">
                                            <input type="password" name="repass"
                                                   placeholder="&#xf084; &nbsp; Confirm New Password"
                                                   class="form-control border-info placeicon">
                                        </div>
                                    </div>
                                    <div class="form-group row justify-content-center">
                                        <div class="col-3 px-3 mt-3">
                                            <input type="submit" value="Reset"
                                                   class="btn btn-block btn-info">
                                        </div>
                                    </div>
                                </form>
                            </div> 
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script type='text/javascript'
        src='https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.bundle.min.js'></script>
    </body>
</html>

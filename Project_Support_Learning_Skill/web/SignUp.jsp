<%-- 
    Document   : SignUp
    Created on : Oct 7, 2022, 8:05:31 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	


<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">

        <!-- Font Icon -->
        <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">
        <link rel="stylesheet" href="vendor/nouislider/nouislider.min.css">

        <!-- Main css -->
        <link rel="stylesheet" href="css/style.css">
        <title>Happy Programming</title>
        <!-- Template Main CSS File -->
        <link href="assets/css/style.css" rel="stylesheet">
    </head>
    <body>

        <div class="main">

            <div class="container">
                <div class="signup-content">
                    <div class="signup-img">
                        <img src="images/form-img.jpg" alt="">
                        <div class="signup-img-content">
                            <h2>Register now </h2>
                            <p>to master your code !</p>
                        </div>
                    </div>
                    <div class="signup-form">
                        <form action="register" method="post" class="register-form" id="register-form">
                            <div class="form-row">
                                <div class="form-group">
                                    <div class="form-input">
                                        <label for="username" class="required">Username</label>
                                        <input type="text" name="username" id="username" required/>
                                    </div>
                                    <div class="form-input">
                                        <label for="password" class="required">Password</label>
                                        <input type="password" name="password" id="password" required/>
                                    </div>
                                    <div class="form-input">
                                        <label for="repass" class="required">Confirm Password</label>
                                        <input type="password" name="repass" id="repass" required/>
                                    </div>
                                    <div class="form-input">
                                        <label for="fullname" class="required">Full Name</label>
                                        <input type="text" name="fullname" id="fullname" required/>
                                    </div>
                                    <div class="label-flex">
                                        <label for="gender" class="required">Gender</label>
                                    </div>
                                    <div class="select-list">
                                        <select style="width: 100%;box-sizing: border-box;border: 1px solid #ebebeb;
                                                padding: 14px 20px;border-radius: 5px;
                                                font-size: 14px;font-family: 'Poppins';" class="select" name="gender" required>
                                            <option disabled="disabled" selected="selected">Gender</option>
                                            <option value="m">Male</option>
                                            <option value="f">Female</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="form-input">
                                        <label for="phone" class="required">Phone</label>
                                        <input type="text" name="phone" id="phone" required/>
                                    </div>
                                    <div class="form-input">
                                        <label for="email" class="required">Email</label>
                                        <input type="text" name="email" id="email" required/>
                                    </div>
                                    <div class="form-input">
                                        <label for="dob" class="required">Date Of Birth</label>
                                        <input type="date" name="dob" id="dob" required/>
                                    </div>
                                    <div class="form-input">
                                        <label for="address">Address</label>
                                        <input type="text" name="address" id="address" />
                                    </div>
                                    <div class="label-flex">
                                        <label for="role" class="required">Role</label>
                                    </div>
                                    <div class="select-list">
                                        <select style="width: 100%;box-sizing: border-box;border: 1px solid #ebebeb;
                                                padding: 14px 20px;border-radius: 5px;
                                                font-size: 14px;font-family: 'Poppins';" class="select" name="role" required>
                                            <option disabled="disabled" selected="selected">Role</option>
                                            <option value="mentor">Mentor</option>
                                            <option value="mentee">Mentee</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <br>
                            <div style="text-align: center;padding: 30px;" class="form-submit">
                                <input style="margin-bottom: 30px" type="submit" value="Sign Up" class="submit" id="submit"/>
                                <label>${alert}</label>
                                
                            </div>
                                    <div style="text-align: center;font-size: 23px">
                                        Already have an account ?<a href="login"> Sign In</a><br>
                                        Or return to <a href="index">Home Page</a><br>
                                        Are you <a href="forgot">Forgot Password?</a>
                                    </div>
                        </form>
                                <script>
                                    var date = new Date();
                                    date.setFullYear(date.getFullYear() - 10);
                                    let dateonly = [date.getMonth()+1, date.getDate(), date.getFullYear()];
                                    var slotTime = dateonly[2] + "-" + (parseInt(dateonly[0]) < 10 ? "0" + dateonly[0] : dateonly[0]) + "-" + (parseInt(dateonly[1]) < 10 ? "0" + dateonly[1] : dateonly[1]);
                                    document.getElementById("dob").max = slotTime;
                                </script>
                    </div>
                </div>
            </div>
        </div>
        <!-- JS -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/nouislider/nouislider.min.js"></script>
        <script src="vendor/wnumb/wNumb.js"></script>
        <script src="vendor/jquery-validation/dist/jquery.validate.min.js"></script>
        <script src="vendor/jquery-validation/dist/additional-methods.min.js"></script>
        <script src="js/main.js"></script>
    </body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>





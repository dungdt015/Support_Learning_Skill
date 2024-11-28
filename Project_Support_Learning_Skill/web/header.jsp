<%-- 
    Document   : header
    Created on : Feb 25, 2024, 7:15:15 PM
    Author     : TGDD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- ======= Header ======= -->

<script>
    function searching() {
        window.location.href = 'index?search=' + document.getElementById('search-skill').value;
    }
</script>
<%  
    User u = (User)session.getAttribute("User");
    if(u == null) {%>
<header class="menu__header fix-menu" id="header-menu">
    <div class="navbar-header">
        <a href="index" class="logo">
            <img alt="logo playerduo" src="images/logo.png" style="border-radius: 50%;">
        </a>
    </div>
    <div class="navbar">
        <ul class="nav navbar-nav navbar-left">
            <li class="item-search">
                <nav class="Navbar__Item">
                    <div class="Navbar__Link">
                        <div class="Group-search visible ">
                            <span class="search input-group">
                                <input disabled="" placeholder="Skill ..." type="text" class="form-control" value="" id="search-skill">
                                <span class="input-group-addon">
                                    <button disabled="" type="button" class="btn btn-default" onclick="searching()">
                                        <i class="fal fa-search" aria-hidden="true"></i>
                                    </button>
                                </span>
                            </span>
                        </div>
                    </div>
                </nav>
            </li>
        </ul>
        <ul class="nav navbar-nav navbar-center">
            <li class="item-icon">
                <a class="group-user " style="display: block" href="index">
                    <i class="fal fa-home-alt"></i>
                </a>
            </li>
            <li class="item-icon">
                <a class="group-user" style="display: block" href="request">
                    <i class="fal fa-list"></i>
                </a>
            </li>
            <li class="item-icon group-fb">
                <a class="group-user" style="display: block" href="chat">
                    <i class="fal fa-comment"></i>
                </a>
            </li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li class="item-icon authent">
                <a class="money-user" href="login">
                    <i class="fal fa-power-off"></i>
                    <span>Đăng nhập</span>
                </a>
            </li>
        </ul>
    </div>
    <div class="navbar-mobile hidden">
        <button type="button" class="btn-login btn btn-default">
            <span>Đăng nhập</span>
        </button>
        <a class="btn-bars">
            <i class="fal fa-bars"></i>
        </a>
        <div class="flex-side hidden">
            <div class="overlay"></div>
            <div class="content">
                <div class="box-search">
                    <nav class="Navbar__Item">
                        <div class="Navbar__Link">
                            <div class="Group-search visible ">
                                <span class="search input-group">
                                    <input disabled="" placeholder="Skill ..." type="text" class="form-control" value="" id="search-skill">
                                    <span class="input-group-addon">
                                        <button disabled="" type="button" class="btn btn-default" onclick="searching()">
                                            <i class="fal fa-search" aria-hidden="true"></i>
                                        </button>
                                    </span>
                                </span>
                            </div>
                        </div>
                    </nav>
                    <a class="btn-close">
                        <i class="fal fa-times fa-2x"></i>
                    </a>
                </div>
                <ul class="list-page">
                    <a href="/">
                        <li class="item-icon active">
                            <a class="group-user">
                                <i class="fal fa-home-alt"></i>
                                <span>Trang chủ</span>
                            </a>
                        </li>
                    </a>
                    <a href="request">
                        <li class="item-icon " style="display: block">
                            <a class="group-user">
                                <i class="fal fa-list"></i> Request </a>
                        </li>
                    </a>
                    <li class="item-icon">
                        <a class="group-user">
                            <i class="fal fa-comment"></i>
                            <span>Bảng xếp hạng</span>
                        </a>
                    </li>
                </ul>
                <div class="list-mode">
                    <div class="item">
                        <p class="title">
                            <span>Chế độ</span>
                        </p>
                        <a class="func mode">
                            <i class="fas fa-moon op"></i>
                            <i class="fas fa-sun false"></i>
                        </a>
                    </div>
                    <div class="item">
                        <p class="title">
                            <span>Cộng đồng</span>
                        </p>
                        <div class="func group">
                            <a href="https://www.facebook.com/groups/playerduovn" target="_blank" rel="noopener noreferrer">
                                <i class="fal fa-globe"></i>
                            </a>
                            <a href="https://www.facebook.com/playerduo" target="_blank" rel="noopener noreferrer">
                                <i class="fab fa-facebook-f"></i>
                            </a>
                        </div>
                    </div>
                    <div class="item">
                        <p class="title">
                            <span>Ngôn ngữ</span>
                        </p>
                        <a class="func lang">
                            <img src="https://files.playerduo.net/production/static-files/flag/1.png" class="flag op" alt="PD">
                            <img src="https://files.playerduo.net/production/static-files/flag/2.png" class="flag false" alt="PD">
                        </a>
                    </div>
                    <div class="item">
                        <p class="title">
                            <span>Tải App</span>
                        </p>
                        <div class="func app">
                            <a href="https://testflight.apple.com/join/r6H9YvY4" target="_blank" rel="noopener noreferrer" download="">PlayerChat</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</header>
<%} else {
boolean isMentor = false;
if(session.getAttribute("Mentee") == null) {
    isMentor = true;
}
%>
<header class="menu__header fix-menu" id="header-menu">
    <div class="navbar-header">
        <a href="index" class="logo">
            <img alt="logo playerduo" src="images/logo.png" style="border-radius: 50%;">
        </a>
    </div>
    <div class="navbar">
        <ul class="nav navbar-nav navbar-left">
            <li class="item-search">
                <nav class="Navbar__Item">
                    <div class="Navbar__Link">
                        <div class="Group-search visible ">
                            <span class="search input-group">
                                <input placeholder="Skill ..." type="text" class="form-control" value="" id="search-skill">
                                <span class="input-group-addon">
                                    <button type="button" class="btn btn-default" onclick="searching()">
                                        <i class="fal fa-search" aria-hidden="true"></i>
                                    </button>
                                </span>
                            </span>
                        </div>
                    </div>
                </nav>
            </li>
        </ul>
        <ul class="nav navbar-nav navbar-center">
            <li class="item-icon">
                <a class="group-user" style="display: block" href="index">
                    <i class="fal fa-home-alt"></i>
                </a>
            </li>
            <li class="item-icon">
                <a class="group-user" style="display: block" href="request">
                    <i class="fal fa-list"></i>
                </a>
            </li>
            <li class="item-icon group-fb">
                <a class="group-user" style="display: block" href="chat">
                    <i class="fal fa-comment"></i>
                </a>
            </li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li class="item-icon balance">
                <a class="money-user" id="money-main">
                    <i class="far fa-plus"></i> <%=u.getWallet()%>đ </a>
                <script>
                    setInterval(async () => {
                        var resp = await fetch("api/wallet");
                        var data = await resp.json();
                        var m = document.getElementById("money-main");
                        if (data["wallet"] !== parseInt(m.innerHTML.toString().replaceAll('<i class="far fa-plus"></i> ', "").replaceAll('đ ', ''))) {
                            m.innerHTML = '<i class="far fa-plus"></i> ' + data["wallet"] + 'đ '
                        }
                    }, 500);
                </script>
            </li>
            <li class="item-icon item-avatar dropdown">
                <a id="header-nav-dropdown" role="button" class="dropdown-toggle" aria-haspopup="true" aria-expanded="false" href="#">
                    <img src="<%=u.getAvatar() == null ? "https://files.playerduo.net/production/images/avatar31.png" : u.getAvatar()%>" class="avt-img" style="max-height:45px; max-width: 45px" alt="PD">
                </a>
                <ul role="menu" class="dropdown-menu" aria-labelledby="header-nav-dropdown">
                    <li role="presentation" class="page-user">
                        <a role="menuitem" tabindex="-1" href="profile">
                            <img src="<%=u.getAvatar() == null ? "https://files.playerduo.net/production/images/avatar31.png" : u.getAvatar() %>" class="avt-img" style="max-height:45px; max-width: 45px" alt="PD">
                            <div class="text-logo">
                                <h5><%=u.getUsername()%> </h5>
                                <p>ID : <span><%=u.getEmail()%> </span>
                                </p>
                                <p class="label-user-page">
                                    <span>Xem trang cá nhân của bạn</span>
                                </p>
                            </div>
                        </a>
                    </li>
                    <li role="presentation" class="menu-item hidden-lg hidden-md">
                        <a role="menuitem" tabindex="-1" href="#">
                            <i class="fas fa-plus"></i>
                            <span>Số dư</span> : <span class="money">0 đ</span>
                        </a>
                    </li>
                    <li role="presentation" class="menu-item">
                        <a role="menuitem" tabindex="-1" href="wallet">
                            <i class="fas fa-minus"></i>
                            <span>Rút tiền</span>
                        </a>
                    </li>
                    <li role="presentation" class="menu-item">
                        <a role="menuitem" tabindex="-1" href="wallet">
                            <i class="fas fa-credit-card"></i>
                            <span>Nạp Tiền</span>
                        </a>
                    </li><%if(u.getRole().equalsIgnoreCase("mentor")) {%> <li role="presentation" class="menu-item">
                        <a role="menuitem" tabindex="-1" href="cv">
                            <i class="fas fa-user-lock"></i>
                            <span>Tạo/Sửa CV</span>
                        </a>
                    </li><% } %> <li role="presentation" class="menu-item">
                        <a role="menuitem" tabindex="-1" href="transaction">
                            <i class="fas fa-clock"></i>
                            <span>Lịch sử giao dịch</span>
                        </a>
                    </li>
                    <li role="presentation" class="menu-item">
                        <a role="menuitem" tabindex="-1" href="<%=(u.getRole().equalsIgnoreCase("admin") || u.getRole().equalsIgnoreCase("manager")) ? "admin/request" : "schedule"%>"><i class="fas fa-users"></i> <span><%=(u.getRole().equalsIgnoreCase("admin") || u.getRole().equalsIgnoreCase("manager")) ? "Admin Setting" : "Schedule"%></span>
                        </a>
                    </li>
                    <li role="presentation" class="menu-item">
                        <a role="menuitem" tabindex="-1" href="setting">
                            <i class="fas fa-cogs"></i>
                            <span>Cài đặt tài khoản</span>
                        </a>
                    </li>
                    <li role="presentation" class="menu-item">
                        <a role="menuitem" tabindex="-1" href="logout">
                            <i class="fas fa-power-off"></i>
                            <span>Đăng xuất</span>
                        </a>
                    </li>
                    <div class="menu-item list-flag">
                        <div class="box-item">
                            <div class="flag-all active">
                                <img src="https://files.playerduo.net/production/static-files/flag/2.png" class="flag flag-vn" alt="PD">
                            </div>
                        </div>
                        <div class="box-item">
                            <a href="" target="_blank" rel="noopener noreferrer">
                                <span>Fanpage</span>
                            </a>
                            <a href="" target="_blank" onclick="popupReport()" rel="noopener noreferrer">
                                <span>Report</span>
                            </a>
                        </div>
                        <script>
                            function popupReport() {
                                event.preventDefault();
                                if (!JSON.stringify(document.body.style).includes("overflow: hidden;")) {
                                    let pre = document.body.style.cssText;
                                    document.body.style = 'overflow: hidden; padding-right: 17px; ' + pre;
                                    //document.body.style = 'background-color: rgb(233, 235, 238) !important; padding-top: 66px;';
                                    let modal = document.createElement('div');
                                    modal.innerHTML = '<div role="dialog" aria-hidden="true">\n\
<div class="fade modal-backdrop"></div>\n\
<div role="dialog" tabindex="-1" class="fade modal-donate modal" style="display: block;">\n\
<div class="modal-dialog">\n\
<div class="modal-content" role="document">\n\
<div class="modal-header">\n\
  <button type="button" class="close">\n\
    <span aria-hidden="true">×</span>\n\
    <span class="sr-only">Close</span>\n\
  </button>\n\
  <h4 class="modal-title">\n\
    <span>Report Reason</span>\n\
  </h4>\n\
</div>\n\
<form method="post">\n\
  <div class="modal-body">\n\
    <table style="width: 100%;">\n\
      <tbody>\n\
        <tr>\n\
          <input type="hidden" name="type" value="report">\n\
          <input type="hidden" name="id" value="<%=u.getId()%>">\n\
          <td>\n\
            <span>Lý do report</span>:\n\
          </td>\n\
          <td>\n\
            <textarea placeholder="Nhập lý do..." required name="reason" maxlength="255" type="text" class="form-control" style="height:50px"></textarea>\n\
          </td>\n\
        </tr>\n\
      </tbody>\n\
    </table>\n\
  </div>\n\
  <div class="modal-footer">\n\
    <button type="submit" class="btn btn-success">\n\
      <span>Xác Nhận</span>\n\
    </button>\n\
    <button type="button" class="btn btn-default">\n\
      <span>Đóng</span>\n\
    </button>\n\
  </div>\n\
</form>\n\
</div>\n\
</div>\n\
</div>\n\
</div>';
                                    document.body.appendChild(modal.firstChild);
                                    let btn = document.body.lastChild.getElementsByTagName('button');
                                    btn[0].onclick = function () {
                                        document.body.lastChild.children[0].classList.remove("in");
                                        document.body.lastChild.children[1].classList.remove("in");
                                        setTimeout(function () {
                                            document.body.style = (document.body.style.cssText).replace('overflow: hidden; padding-right: 17px; ', '');
                                            document.body.removeChild(document.body.lastChild);
                                            window.onclick = null;
                                        }, 100);

                                    }
                                    btn[2].onclick = function () {
                                        document.body.lastChild.children[0].classList.remove("in");
                                        document.body.lastChild.children[1].classList.remove("in");
                                        setTimeout(function () {
                                            document.body.style = (document.body.style.cssText).replace('overflow: hidden; padding-right: 17px; ', '');
                                            document.body.removeChild(document.body.lastChild);
                                            window.onclick = null;
                                        }, 100);

                                    }
                                    setTimeout(function () {
                                        document.body.lastChild.children[1].classList.add("in");
                                        document.body.lastChild.children[0].classList.add("in");
                                        window.onclick = function (e) {
                                            if (!document.getElementsByClassName('modal-content')[0].contains(e.target)) {
                                                document.body.lastChild.children[0].classList.remove("in");
                                                document.body.lastChild.children[1].classList.remove("in");
                                                setTimeout(function () {
                                                    document.body.style = (document.body.style.cssText).replace('overflow: hidden; padding-right: 17px; ', '');
                                                    document.body.removeChild(document.body.lastChild);
                                                    window.onclick = null;
                                                }, 100);
                                            }
                                        };
                                    }, 1);
                                } else {
                                    //document.body.style = 'overflow: hidden; padding-right: 17px; background-color: rgb(233, 235, 238) !important; padding-top: 66px;';
                                    document.body.lastChild.children[1].classList.remove("in");
                                    document.body.lastChild.children[0].classList.remove("in");
                                    setTimeout(function () {
                                        document.body.style = (document.body.style.cssText).replace('overflow: hidden; padding-right: 17px; ', '');
                                        document.body.removeChild(document.body.lastChild);
                                        window.onclick = null;
                                    }, 100);
                                }
                            }
                            <%if(request.getAttribute("alert") != null) {%>
                            setTimeout(function () {
                                alert("<%=(String)request.getAttribute("alert")%>");
                            }, 1000);
                            <%}%>
                            <%if(session.getAttribute("alert") != null) {%>
                            setTimeout(function () {
                                alert("<%=(String)session.getAttribute("alert")%>");
                            }, 1000);
                            <%  session.removeAttribute("alert");
                            }%>
                        </script>
                    </div>
                </ul>
            </li>
        </ul>
    </div>
    <div class="navbar-mobile hidden">
        <ul class="navbar-nav">
            <li class="item-icon notificate dropdown">
                <a id="basic-nav-dropdown" role="button" class="dropdown-toggle" aria-haspopup="true" aria-expanded="false" href="#">
                    <div class="item-title">
                        <i class="fal fa-bell"></i>
                    </div>
                </a>
                <ul role="menu" class="dropdown-menu" aria-labelledby="basic-nav-dropdown">
                    <div class="content">
                        <div class="tab-notif-common">
                            <h5>
                                <span>Thông báo</span>
                            </h5>
                            <div class="tab-action">
                                <p class="active">
                                    <span>Chính</span>
                                </p>
                                <p class="">
                                    <span>Khác</span>
                                </p>
                                <p class="">
                                    <span>Theo dõi</span>
                                </p>
                                <p class="">
                                    <span>Tương tác</span>
                                </p>
                            </div>
                        </div>
                        <div>
                            <div class="infinite-scroll-component " style="height: 400px; overflow: auto;">
                                <div class="text-center" style="color: rgb(51, 51, 51);">
                                    <span>Đợi chút xíu ...</span>
                                </div>
                            </div>
                        </div>
                    </div>
                </ul>
            </li>
            <li class="item-icon item-avatar dropdown">
                <a id="header-nav-dropdown" role="button" class="dropdown-toggle" aria-haspopup="true" aria-expanded="false" href="#">
                    <img src="<%=u.getAvatar() == null ? "https://files.playerduo.net/production/images/avatar31.png" : u.getAvatar()%>" class="avt-img" style="max-height:45px; max-width: 45px" alt="PD">
                </a>
                <ul role="menu" class="dropdown-menu" aria-labelledby="header-nav-dropdown">
                    <li role="presentation" class="page-user">
                        <a role="menuitem" tabindex="-1" href="#">
                            <img src="<%=u.getAvatar() == null ? "https://files.playerduo.net/production/images/avatar31.png" : u.getAvatar()%>%>" class="avt-img" style="max-height:45px; max-width: 45px" alt="PD">
                            <div class="text-logo">
                                <h5><%=u.getUsername()%> </h5>
                                <p>ID : <span><%=u.getEmail()%> </span>
                                </p>
                                <p class="label-user-page">
                                    <span>Xem trang cá nhân của bạn</span>
                                </p>
                            </div>
                        </a>
                    </li>
                    <li role="presentation" class="menu-item hidden-lg hidden-md">
                        <a role="menuitem" tabindex="-1" href="#">
                            <i class="fas fa-plus"></i>
                            <span>Số dư</span> : <span class="money">0 đ</span>
                        </a>
                    </li>
                    <li role="presentation" class="menu-item">
                        <a role="menuitem" tabindex="-1" href="wallet">
                            <i class="fas fa-minus"></i>
                            <span>Rút tiền</span>
                        </a>
                    </li>
                    <li role="presentation" class="menu-item">
                        <a role="menuitem" tabindex="-1" href="wallet">
                            <i class="fas fa-credit-card"></i>
                            <span>Nạp Tiền</span>
                        </a>
                    </li><%if(u.getRole().equalsIgnoreCase("mentor")) {%> <li role="presentation" class="menu-item">
                        <a role="menuitem" tabindex="-1" href="#">
                            <i class="fas fa-user-lock"></i>
                            <span>Tạo/Sửa CV</span>
                        </a>
                    </li><% } %> <li role="presentation" class="menu-item">
                        <a role="menuitem" tabindex="-1" href="transaction">
                            <i class="fas fa-clock"></i>
                            <span>Lịch sử giao dịch</span>
                        </a>
                    </li>
                    <li role="presentation" class="menu-item">
                        <a role="menuitem" tabindex="-1" href="<%=(u.getRole().equalsIgnoreCase("admin") || u.getRole().equalsIgnoreCase("manager")) ? "admin/request" : "schedule"%>"><i class="fas fa-users"></i> <span><%=(u.getRole().equalsIgnoreCase("admin") || u.getRole().equalsIgnoreCase("manager")) ? "Admin Setting" : "Schedule"%></span>
                        </a>
                    </li>
                    <li role="presentation" class="menu-item">
                        <a role="menuitem" tabindex="-1" href="#">
                            <i class="fas fa-cogs"></i>
                            <span>Cài đặt tài khoản</span>
                        </a>
                    </li>
                    <li role="presentation" class="menu-item">
                        <a role="menuitem" tabindex="-1" href="logout">
                            <i class="fas fa-power-off"></i>
                            <span>Đăng xuất</span>
                        </a>
                    </li>
                    <div class="menu-item list-flag">
                        <div class="box-item">
                            <div class="flag-all active">
                                <img src="https://files.playerduo.net/production/static-files/flag/2.png" class="flag flag-vn" alt="PD">
                            </div>
                        </div>
                        <div class="box-item">
                            <a href="" target="_blank" rel="noopener noreferrer">
                                <span>Fanpage</span>
                            </a>
                            <a href="" target="_blank" rel="noopener noreferrer">
                                <span>Report</span>
                            </a>
                        </div>
                    </div>
                </ul>
            </li>
        </ul>
        <a class="btn-bars">
            <i class="fal fa-bars"></i>
        </a>
        <div class="flex-side hidden">
            <div class="overlay"></div>
            <div class="content">
                <div class="box-search">
                    <nav class="Navbar__Item">
                        <div class="Navbar__Link">
                            <div class="Group-search visible ">
                                <span class="search input-group">
                                    <input placeholder="Skill ..." type="text" class="form-control" value="" id="search-skill">
                                    <span class="input-group-addon">
                                        <button type="button" class="btn btn-default" onclick="searching()">
                                            <i class="fal fa-search" aria-hidden="true"></i>
                                        </button>
                                    </span>
                                </span>
                            </div>
                        </div>
                    </nav>
                    <a class="btn-close">
                        <i class="fal fa-times fa-2x"></i>
                    </a>
                </div>
                <ul class="list-page">
                    <a href="/">
                        <li class="item-icon">
                            <a class="group-user">
                                <i class="fal fa-home-alt"></i>
                                <span>Trang chủ</span>
                            </a>
                        </li>
                    </a>
                    <a href="request">
                        <li class="item-icon ">
                            <a class="group-user">
                                <i class="fal fa-list"></i> Stories </a>
                        </li>
                    </a>
                    <li class="item-icon">
                        <a class="group-user">
                            <i class="fal fa-trophy-alt"></i>
                            <span>Bảng xếp hạng</span>
                        </a>
                    </li>
                </ul>
                <div class="list-mode">
                    <div class="item">
                        <p class="title">
                            <span>Chế độ</span>
                        </p>
                        <a class="func mode">
                            <i class="fas fa-moon op"></i>
                            <i class="fas fa-sun false"></i>
                        </a>
                    </div>
                    <div class="item">
                        <p class="title">
                            <span>Cộng đồng</span>
                        </p>
                        <div class="func group">
                            <a href="https://www.facebook.com/groups/playerduovn" target="_blank" rel="noopener noreferrer">
                                <i class="fal fa-globe"></i>
                            </a>
                            <a href="https://www.facebook.com/playerduo" target="_blank" rel="noopener noreferrer">
                                <i class="fab fa-facebook-f"></i>
                            </a>
                        </div>
                    </div>
                    <div class="item">
                        <p class="title">
                            <span>Ngôn ngữ</span>
                        </p>
                        <a class="func lang">
                            <img src="https://files.playerduo.net/production/static-files/flag/1.png" class="flag op" alt="PD">
                            <img src="https://files.playerduo.net/production/static-files/flag/2.png" class="flag false" alt="PD">
                        </a>
                    </div>
                    <div class="item">
                        <p class="title">
                            <span>Tải App</span>
                        </p>
                        <div class="func app">
                            <a href="https://testflight.apple.com/join/r6H9YvY4" target="_blank" rel="noopener noreferrer" download="">PlayerChat</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</header>
<!-- End Header -->
<script>
    let avt = document.getElementById('header-nav-dropdown');
    avt.onclick = function () {
        if (avt.parentNode.classList.contains("open")) {
            avt.parentNode.classList.remove("open");
        } else {
            avt.parentNode.classList.add("open");
        }
    };
</script>
<% } %>
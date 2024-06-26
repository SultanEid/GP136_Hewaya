import React from "react";
import logo from "../../images/logoAR.png";
import "./login.css";

export default function Login(){
    return (
        <div class="container">
            <a href="/home">
            <img src={logo} alt="هواية | Hewayah Logo" class="logo"/>
            </a>
        <h2 class="title">تسجيل دخول</h2>
        <form action="login" method="post">
            <div class="form-group">
                <label for="email">الايميل </label>
                <input type="email" id="email" name="email" required placeholder="ادخل الايميل"/>
            </div>
            <div class="form-group">
                <label for="password">كلمة السر</label>
                <input type="password" id="password" name="password" required placeholder="ادخل كلمة المرور"/>
            </div>
            <p class="forget-password"><a href="forget-password">نسيت كلمة المرور؟</a></p>
            <div class="form-group">
                <input type="submit" value="تسجيل الدخول"/>
            </div>
            <p class="signup-link">ماعندك حساب? <a href="signup">أنضم الأن</a></p>
            <p class="signup-link"> أنضم <a href="signup/service_provider">كمزود خدمة</a></p>
        </form>
        {/* <p th:text="${emailAndPassword}" style="color: red"></p> */}
    </div>
    )
}
import React from "react";
import logoAR from "../../images/logoAR.png";
import "../login/login.css";

export default function ForgetPassword(){
    return (
        <div class="container" lang="ar" dir="rtl">
        <a href="/home"><img src={logoAR} alt="هواية | Hewayah Logo" class="logo"/></a>
        <h2 class="title">نسيت كلمة المرور</h2>
        <form action="login" method="post">
            <div class="form-group">
                <label for="email">الايميل </label>
                <input type="email" id="email" name="email" required placeholder="ادخل الايميل"/>
            </div>
            
            <div class="form-group">
                <input type="submit" value="ارسل الكود"/>
            </div>
            <p class="signup-link">ماعندك حساب? <a href="signup">أنضم الان</a></p>
        </form>
        {/* <p th:text="${emailAndPassword}" style="color: red"></p> */}
    </div>
    )
}
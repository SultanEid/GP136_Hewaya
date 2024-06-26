import React from "react";
import logo from "../../images/logoAR.png";
import "../login/login.css";

export default function Signup(){
    return (
        <div class="container">
        <a href="home"><img src={logo} alt="هواية | Hewayah Logo" class="logo"/></a>
        <h2 class="title">إنشاء حساب جديد</h2>
        <form action="signup" method="post">
            <div class="form-group">
                <label for="name">الاسم</label>
                <input type="text" id="name" name="name" required placeholder="أدخل اسمك"/>
            </div>
            <div class="form-group">
                <label for="username">اسم المستخدم</label>
                <input type="text" id="username" name="username" required placeholder="اسم المستخدم"/>
            </div>
            <div class="form-group">
                <label for="email">الايميل</label>
                <input type="email" id="email" name="email" required placeholder="أدخل الايميل"/>
            </div>
            <div class="form-group">
                <label for="password">كلمة المرور</label>
                <input type="password" id="password" name="password" required placeholder="ادخل كلمة المرور"/>
            </div>
            <div class="gender">
                    <input type="radio" id="male" name="gender" value="male" />
                    <label htmlFor="male">ذكر</label>
                    <input type="radio" id="female" name="gender" value="female" />
                    <label htmlFor="female">انثئ</label>
            </div>
    
                    
                    
            <div class="form-group">
                <input type="submit" value="إنشاء الحساب"/>
            </div>
            <p class="login-link">هل لديك حساب؟ <a href="login">تسجيل الدخول </a></p>
        </form>
        {/* <p th:text="${passwordErrorMessage}" style="color: red"></p>
        <p th:text="${usernameErrorMessage}" style="color: red"></p>
        <p th:text="${usernameAndPassowordErrorMessage}" style="color: red"></p>
        <p th:text="${emailErrorMessage}" style="color: red"></p> */}
    </div>
    )
}
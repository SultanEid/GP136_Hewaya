import React from "react";
import "./header.css";
import logo from "../../images/HewayaLogo.png";
import saudiMap from "../../images/saudiMap.png"
import vision2030 from "../../images/vision2030.png";
// import Login from "../login/login.js";




const Header = () => {
  const text = `هنا حيث الهواية,
  الصديق,
  و الترفيه`
  return (
    <header lang="ar" dir="rtl">
      <div class="containerHeader">
        <div class="logo-container">
          <img
            src={logo}
            alt="شعار هواية | Hewayah"
            class="logo hewayah-logo"
          />

          <img src={vision2030} class="logo vision-logo"/>
                    
        </div>
        
        <div class="saudi_map">
          <img src={saudiMap} alt="map of saudi"/>
        {/* <h2 class="title">هواية | Hewayah</h2> */}
        <div class="hewayahStatement" style={{ whiteSpace: "pre-line" }}>
          {text}
        </div>
        </div>
        
        <div class="button-container">
          <ul>
            <li>
              <a href="#" class="link">
                الصفحة الرئيسية
              </a>
            </li>
            <li>
              <a href="#" class="link">
                تواصل معنا
              </a>
            </li>
            <li>
              <a href="#" class="link">
                عن الهوايات
              </a>
            </li>
            <li>
              <a href="#" class="link">
                من نحن
              </a>
            </li>
            <li>
              <a href="signup" class="button">
                انضم الآن
              </a>
            </li>
            <li>
              <a href="/login" class="button">
                تسجيل الدخول
              </a>
            </li>
          </ul>
        </div>
      </div>
    </header>
  );
};

export default Header;

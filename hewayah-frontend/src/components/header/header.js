import React from "react";
import "./header.css";
import logo from "../../images/HewayaLogo.png";
import saudiMap from "../../images/saudiMap.png"
import vision2030 from "../../images/vision2030.png";




let name = "Naif"
let welcome = `welcome ${name} to our website`

const Header = () => {
  const text = `هنا حيث الهواية,
  الصديق,
  و الترفيه`
  return (
    <header lang="ar" dir="rtl">
      <div class="container">
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
        <p>{welcome}</p>
        <div class="button-container">
          <ul>
            <li>
              <a href="index.html" class="link">
                الصفحة الرئيسية
              </a>
            </li>
            <li>
              <a href="contact.html" class="link">
                تواصل معنا
              </a>
            </li>
            <li>
              <a href="hobbies.html" class="link">
                عن الهوايات
              </a>
            </li>
            <li>
              {" "}
              <a href="about.html" class="link">
                من نحن
              </a>
            </li>
            <li>
              <a href="sign up.html" class="button">
                انضم الآن
              </a>
            </li>
            <li>
              <a href="login.html" class="button">
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

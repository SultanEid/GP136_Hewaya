import React,{useState, useEffect} from "react";
import logo from "../../images/logoAR.png";
import "../login/login.css";
import "./signup-serviceP.css";
import axios from "axios";
import {useNavigate} from "react-router-dom";
import ImageIcon from "../../images/profile-icon.jpeg"
export default function Signup(){
    const navigate = useNavigate();
    
    const [user, setUser] = useState({
        name: "",
        phoneNumber: "",
        email: "",
        password: "",
        username: ""
    });
    

    const {serviceProviderName , phoneNumber, email, password, serviceProviderUsername} = user;

    const onInputChange = (e)=>{
        setUser({...user, [e.target.name]: e.target.value})
    }

    const goToHobbySelection =()=>{
        navigate("/select-hobby")
    }

    const onSubmit =async (event)=>{
        event.preventDefault();
        await axios.post("http://localhost:8080/createServiceProvider", user)
        navigate("/home")
    }
    //this code to check if the user loggin then take him into this url
    // <header>
    //   <div className="containerHeader">
    //     <a href={isLoggedIn ? "/home" : "/login"}>
    //       <img src={logo} alt="هواية | Hewayah Logo" className="logo-hewayah" />
    //     </a>
    //   </div>
    //   {isLoggedIn ? (
    //     <Redirect to="/home" /> // Redirect to home page if logged in
    //   ) : (
    //     <Redirect to="/login" /> // Redirect to login page if not logged in
    //   )}
    // </header>

    return (
        <div class="container" lang="ar" dir="rtl">
        <a href="/home"><img src={logo} alt="هواية | Hewayah Logo" class="logo"/></a>
        <h2 class="title">أنضم كمزود خدمة</h2>
        <hr/>
        <form onSubmit={(event) => onSubmit(event)}>
            <h5 style={{textAlign: "center"}}>اختر صورة العرض</h5>
            <div className="logo-serviceProvider">
                <ImageUpload/> 
            </div>

            <div class="form-group">
                <label for="serviceProviderName">اسم مزود الخدمة</label>
                <input type="text" id="serviceProviderName" name="serviceProviderName" value={serviceProviderName} onChange={(e) => onInputChange(e)} required placeholder="أدخل الأسم"/>
            </div>
            <div class="form-group">
                <label for="phoneNumber">رقم الجوال</label>
                <input type="number" max="1000000000" id="phoneNumber" name="phoneNumber" value={phoneNumber} onChange={(e) => onInputChange(e)} required placeholder=" رقم الجوال"/>
            </div>
            
            <div class="form-group">
                <label for="email">الايميل</label>
                <input type="email" id="email" name="email" value={email} onChange={(e) => onInputChange(e)} required placeholder="أدخل الايميل"/>
            </div>
            <div class="form-group">
                <label for="password">كلمة المرور</label>
                <input type="password" id="password" name="password" value={password} onChange={(e) => onInputChange(e)} required placeholder="ادخل كلمة المرور"/>
            </div>
            {/* <div class="form-group">
                <label for="password">اعادة كلمة المرور</label>
                <input type="password" id="repassword" name="password" required placeholder="ادخل كلمة المرور"/>
            </div> */}
            <div class="form-group">
                <label for="serviceProviderUsername">اسم المستخدم</label>
                <input type="text" id="serviceProviderUsername" name="serviceProviderUsername" value={serviceProviderUsername} onChange={(e) => onInputChange(e)} required placeholder="اسم المستخدم"/>
            </div>
            <div class="form-group">
                <input type="submit" value="إنشاء الحساب" onClick={goToHobbySelection} />
            </div>
            <p class="login-link">هل لديك حساب؟ <a href="../login">تسجيل دخول</a></p>
            {/* <p class="signup-link">انضم <a href="signup-serviceP">كمزود خدمة</a></p> */}
        </form>
        {/* <p th:text="${passwordErrorMessage}" style="color: red"></p>
        <p th:text="${usernameErrorMessage}" style="color: red"></p>
        <p th:text="${usernameAndPassowordErrorMessage}" style="color: red"></p>
        <p th:text="${emailErrorMessage}" style="color: red"></p> */}
    </div>
    )
}



function ImageUpload()  {
  const [selectedImage, setSelectedImage] = useState(null);

  const handleImageUpload = (event) => {
    const file = event.target.files[0];
    setSelectedImage(URL.createObjectURL(file));
  };

  return (
    <div className="img-upload">
      <input type="file" onChange={handleImageUpload} />
      {selectedImage && <img src={selectedImage}  alt="Selected" />}
    </div>
  );
};

// export default ImageUpload;
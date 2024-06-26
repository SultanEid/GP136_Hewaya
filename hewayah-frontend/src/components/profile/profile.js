import React from "react";
import logo from "../../images/logoAR.png";
// import "../header/header.css";
import "./profile.css";
import ServiceProviderLogo from "../../images/chessLogo.jpeg";
import Navbar from "../navbar/navbar";
import icon from "../../images/profile-icon.jpeg";
import Footer from "../footer/footer";


export default function Profile(){
    const joinDate = "2022 june";
    const followers = 321;
    const hobbyist = 121;
    const servicePname ="شطرنج العزيزية"
    const location ="المدينة المنورة-سلطانة"
    const users =["turki", "Abdallah", "naif21", "azozo29"]
    return (
        <div lang="ar" dir="rtl">
            
        <div className="top-side">
        <header>
            <div className="logo">
                <a href="/home">
                <img src={logo} />
                </a>
                <Navbar/>
            </div>
            </header>
            <div className="profile">
                {/* edit bio */}
                {/* <a href="#" className="edit-button">
                    <div className="edit" >تعديل البايو</div>
                </a> */}
                <div className="imgContainer">
                    <div className="joinDate"> انضم {joinDate}</div>
                    <img src={ServiceProviderLogo}/>
                    <div className="numbers">
                        <div className="name">
                        {hobbyist}
                        <p className="text">هاوي</p>
                        </div>
                        {" "}
                        <div className="name">
                        {followers}
                        <p className="text">متابع</p>
                        </div>
                        
                    </div>
                    
                </div>
                <div className ="profileDescription">
                    <div className="titleName">
                        <h3>{servicePname}</h3>
                    </div>
                    <div className="Description">
                        <p>
                        شطرنج العزيز هو نادي شطرنج يقع في مدينة المدينة المنورة بالمملكة العربية السعودية. يعتبر النادي وجهة رائدة لعشاق لعبة الشطرنج في المدينة والمناطق المحيطة بها.
                        </p>
                    </div>
                </div>
            </div>
            
            <div className="servicePinformation">
                <div className="buttons">
                    <div className="sendButton">
                        <a href="">مراسلة</a>
                    </div>
                    <div className="followButton">
                    <a href="">متابعة</a>
                    </div>
                    <div className="location">
                        <p>{location}</p>
                    </div>
                    <div className="rate">
                        <p>قييم مزود الخدمة</p>
                    </div>
                </div>
            </div>
            </div>
            <div className="buttom-side">
                    <div className="title-hobby">
                        <h2>الهوايات</h2>
                        <hr/>
                    </div>
                    <div className="name-of-hobbies">
                        <p className="hobby">رسم</p>
                        <p className="hobby">ركوب الخيل</p>
                        <p className="hobby">صناعة الفخار</p>
                        <p className="hobby">الرمي بالأسهم</p>
                    </div>
                    <div className="title-users">
                        <h2>الاعضاء المميزين</h2>
                        <hr/>
                    </div>
                    <div className="name-of-users">
                        <img className="user-icon" src={icon}/>
                        <p className="user">{users[0]}</p>
                        <img className="user-icon" src={icon}/>
                        <p className="user">{users[1]}</p>
                        <img className="user-icon" src={icon}/>
                        <p className="user">{users[2]}</p>
                        <img className="user-icon" src={icon}/>
                        <p className="user">{users[3]}</p>
                    </div>
            </div>

            <div className="footer">
                <Footer/>
            </div>
        </div>
    )
}
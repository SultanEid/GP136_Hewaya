import "../header/header.css";
import "./navbar.css"
// import JoinButton from "../header/header";


export default function Navbar(){
    
    return (
        
        <div className="button-container">
            <ul >
                <li>
                <a href="/home" class="link">
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
            {/* <JoinButton/> */}
            </ul>
            </div>
    )
}

// function joinButton(){
//     return(
//         <>

//         </>
//     )
// }
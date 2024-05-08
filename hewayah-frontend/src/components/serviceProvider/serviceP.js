import React from "react";
import ServiceLogo from "../../images/chessLogo.jpeg";
import "./serviceP.css";
import ServiceProfile from "../profile/profile.js"
// const serviceProvideName = "شطرنج العزيزية";


export default function ServiceProviderLogo(props){
    const {serviceProvideName} = props;

    return(
        <>
        <div lang="ar" dir="rtl" className="service-provider-container">
            <div className="profile-container">
                <a href="username/profile">
                <img src={ServiceLogo}/>
                </a>
                <div className="service-provider-name">{serviceProvideName}</div>
            <hr className="timeline"/>
            </div>
            
            {/* <div className="timeline">- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</div> */}
        </div>
        </>
        
    )

    
}
import React from 'react';
import './App.css';
import  Button  from 'react-bootstrap/Button';
import "bootstrap/dist/css/bootstrap.min.css";
import Header from "./components/header/header.js";
import ServiceProviderLogo from './components/serviceProvider/serviceP.js';
import Search from "./components/searchBar/search.js"
import ServiceProviderPage from "./components/service-provider-page/service-provider-page.js";
import HobbyistPage from "./components/hobbyist-page/hobbyist";






export default function App() {
  
  
  const userType = "Service Povider";
  return (
      
    <div>
      {userType === "Service Provider" ? <ServiceProviderPage/> : <HobbyistPage/>}
    </div>
    
  );
}


function Headerr(){
  return(
    <header lang="ar" dir="rtl">
      <Button>myButton</Button>
      <ul>
        <li>الصفحة الرئيسة</li>
        <li>من نحن</li>
        <li>تواصل معنا</li>
        <li>عن الهوايات</li>
      </ul>
    </header>
  )
}

function ServiceProfile(){
  return(
    <div className="profileContainer">
        <img src="images/acme.png" alt="hh"/>
    </div>
  )
}



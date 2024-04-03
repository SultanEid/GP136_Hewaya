import React from 'react';
// import logo from './logo.svg';
import './App.css';
import  Button  from 'react-bootstrap/Button';
import "bootstrap/dist/css/bootstrap.min.css";
// import  Header  from 'react-bootstrap/CardHeader';
// import  ListGroup  from 'react-bootstrap/ListGroup';
import Header from "./components/header/header.js";

import Search from "./components/searchBar/search.js"
// import Image from '../public/images';
export default function App() {
  return (
      
    <div>
      <Header/>
      <Search/>
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



import React ,{useState,useEffect}from 'react';
import '../../App.css';
import  Button  from 'react-bootstrap/Button';
import "bootstrap/dist/css/bootstrap.min.css";
import Header from "../header/header.js";
import ServiceProviderLogo from '../serviceProvider/serviceP.js';
import Search from "../searchBar/search.js"
import Event from "../event/event.js"
import chessLogo from "../../images/chessLogo.jpeg";
import bikeLogo from "../../images/bikeLogo1.jpg";
import axios from "axios";

export default function HobbyistPage() {
  const [serviceProvider, setSeviceProvider] = useState([]);
  useEffect(() => {
    const fetchData = async () => {
      try {
        const response = await axios.get('http://localhost:8080/getAllServiceProviders');
        setSeviceProvider(response.data);
        // Process the response data here
      } catch (error) {
        console.error('Error:', error.message);
        // Handle the error here
      }
    };

    fetchData();
  }, []);

  return (
      
    <div lang="ar" dir="rtl">
      <Header/>
      <Search/>
      <div className="service-p-container">
          <ServiceProviderLogo serviceProvideName="شطرنج العزيزية"  ServiceLogo={chessLogo}/>
          <div className="event-line">
            <table>
              <tbody>
                {
                  serviceProvider.map((user, index)=>(
                    
                      // <th scope="row" key={index}> {index+1}</th> 
                      <td><Event hobbyName={user.bio}/></td>

                    

                  ))
                }
            {/* <tr> */}
            {/* <td><Event hobbyName="بالوت" numberOfHobbyist="13" fullHobbyist="15" age="+16" time="6:20pm"/></td> */}
            {/* </tr> */}
              </tbody>
            </table>
          </div>
          <ServiceProviderLogo serviceProvideName="شطرنج العزيزية"  ServiceLogo={chessLogo}/>
          <div className="event-line">
            <table>
              <tbody>
            <tr>
            <td><Event hobbyName="شيش" numberOfHobbyist="15" fullHobbyist="15" age="+12" time="4:20pm"/></td>
            <td><Event hobbyName="بالوت" numberOfHobbyist="13" fullHobbyist="15" age="+16" time="6:20pm"/></td>
            </tr>
              </tbody>
            </table>
          </div>
          
          <ServiceProviderLogo serviceProvideName="النايف للدراجات" ServiceLogo={bikeLogo} username="zidn"/>
          <div className="event-line">
          <table>
              <tbody>
            <tr>
            <td><Event hobbyName="سباق دراجات" numberOfHobbyist="15" fullHobbyist="15" age="+12" time="3:20pm"/></td>
            <td><Event hobbyName="باركور" numberOfHobbyist="15" fullHobbyist="15" age="+12" time="7:20pm"/></td>
            <td><Event hobbyName="سباق دراجات" numberOfHobbyist="2" fullHobbyist="15" age="+12" time="3:20pm"/></td>
            <td><Event hobbyName="باركور" numberOfHobbyist="0" fullHobbyist="15" age="+12" time="7:20pm"/></td>
            <td><Event hobbyName="سباق دراجات" numberOfHobbyist="2" fullHobbyist="15" age="+12" time="3:20pm"/></td>
            
            </tr>
              </tbody>
            </table>
            
          </div>
      </div>
      
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



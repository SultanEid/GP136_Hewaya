import "./select.css";
import HewayahIcon from "../../images/logoAR.png";
import SaudiMap from "../../images/saudiMap.png";
import React ,{useState,useEffect}from 'react';
import { useNavigate  } from "react-router-dom";



export default function Select(){
    const navigate = useNavigate()
    const moveToHome = ()=>{
        navigate("/home")
    }

    const [selectedHobbies, setSelectedHobbies] = useState([]);

  // Function to handle the click event on a hobby
  const handleHobbyClick = (hobby) => {
    // Check if the hobby is already selected
    const isHobbySelected = selectedHobbies.includes(hobby);

    // Update the selected hobbies based on the click event
    if (isHobbySelected) {
      setSelectedHobbies(selectedHobbies.filter((h) => h !== hobby));
    } else {
      // Allow only three hobbies to be selected
      if (selectedHobbies.length < 3) {
        setSelectedHobbies([...selectedHobbies, hobby]);
      }
    }
  };

  // Function to handle the "Next" button click event
  const handleNextButtonClick = () => {
    // Check if exactly three hobbies are selected
    if (selectedHobbies.length === 3) {
      // Store the selected hobbies in localStorage or pass them to the next page using state management libraries or other means
      // Example using localStorage:
      localStorage.setItem('selectedHobbies', JSON.stringify(selectedHobbies));
        navigate("../home")
      // Redirect to the home page or perform any other necessary action
      // You can use React Router for navigation in a multi-page React application
      // Example: history.push('/home');
    } else {
      // Display an error message or provide a prompt to select exactly three hobbies
      alert('Please select exactly three hobbies.');
    }
  };
    return (
        <>
        <div className="line"/>
            <div className="hobby-container">
                
                <div className="right-side">
                    <div className="saudi-map-logo">
                        <img src={SaudiMap} className="img-map"/>
                    </div>
                    <div className="logo-hewayah">
                        <img src={HewayahIcon} className="img-hewayah"/>
                    </div>

                    <div className="btn-new-user">
                            <div className="next-button">
                                <a type="submit"onClick={handleNextButtonClick}>التالي</a>
                            </div>
                    </div>
                </div>
                {/* <hr  className="line"/> */}
                <div className="left-side">
                    <h3 className="title-hobbies">اختر ثلاثة من هوايتك المفضلة</h3>


                    
                    

                        <div className="hobbies-row1">
                            <div className={`hobbies-name ${selectedHobbies.includes('اللعاب الفيديو') ? 'selected' : ''}`}onClick={() => handleHobbyClick('اللعاب الفيديو')}>
                                اللعاب الفيديو
                            </div>
                            <div className={`hobbies-name ${selectedHobbies.includes('احصنه') ? 'selected' : ''}`}onClick={() => handleHobbyClick('احصنه')}>
                                    احصنه
                            </div>
                            <div className={`hobbies-name ${selectedHobbies.includes('شطرنج') ? 'selected' : ''}`}onClick={() => handleHobbyClick('شطرنج')}>
                                    شطرنج
                            </div>
                            
                            
                        </div>
                        <div className="hobbies-row2">
                        <div className={`hobbies-name ${selectedHobbies.includes('صناعة الفخار') ? 'selected' : ''}`}onClick={() => handleHobbyClick('صناعة الفخار')}>
                                صناعة الفخار
                            </div>
                            <div className={`hobbies-name ${selectedHobbies.includes('الرسم') ? 'selected' : ''}`}onClick={() => handleHobbyClick('الرسم')}>
                                    الرسم
                            </div>
                            <div className={`hobbies-name ${selectedHobbies.includes('صناعة القهوة') ? 'selected' : ''}`}onClick={() => handleHobbyClick('صناعة القهوة')}>
                                صناعة القهوة
                            </div>
                            
                            
                        </div>
                        <div className="hobbies-row3">
                        <div className={`hobbies-name ${selectedHobbies.includes('البرمجة') ? 'selected' : ''}`}onClick={() => handleHobbyClick('البرمجة')}>
                                البرمجة
                            </div>
                            <div className={`hobbies-name ${selectedHobbies.includes('التصميم') ? 'selected' : ''}`}onClick={() => handleHobbyClick('التصميم')}>
                                    التصميم
                            </div>
                            <div className={`hobbies-name ${selectedHobbies.includes('التصوير') ? 'selected' : ''}`}onClick={() => handleHobbyClick('التصوير')}>
                                التصوير
                            </div>
                            
                            
                        </div>
                        <div className="hobbies-row4">
                        <div className={`hobbies-name ${selectedHobbies.includes('تسلق الجبال') ? 'selected' : ''}`}onClick={() => handleHobbyClick('تسلق الجبال')}>
                                تسلق الجبال
                            </div>
                            <div className={`hobbies-name ${selectedHobbies.includes('ركوب الخيل') ? 'selected' : ''}`}onClick={() => handleHobbyClick('ركوب الخيل')}>
                                    ركوب  الخيل
                            </div>
                            <div className={`hobbies-name ${selectedHobbies.includes('الرماية') ? 'selected' : ''}`}onClick={() => handleHobbyClick('الرماية')}>
                                الرماية
                            </div>
                            
                            
                        </div>
                        <div className="hobbies-row5">
                        <div className={`hobbies-name ${selectedHobbies.includes('بالوت') ? 'selected' : ''}`}onClick={() => handleHobbyClick('بالوت')}>
                                    بالوت
                            </div>
                            <div className={`hobbies-name ${selectedHobbies.includes('الصيد') ? 'selected' : ''}`}onClick={() => handleHobbyClick('الصيد')}>
                                    الصيد
                            </div>
                            <div className={`hobbies-name ${selectedHobbies.includes('الدراجة الهوائية') ? 'selected' : ''}`}onClick={() => handleHobbyClick('الدراجة الهوائية')}>
                                الدراجة الهوائية
                            </div>
                            
                            
                        </div>


                </div>
            </div>
        </>
    )
}
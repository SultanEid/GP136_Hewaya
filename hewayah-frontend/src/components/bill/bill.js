import "./bill.css";
import { useState } from 'react';
import Payment from "../payment/payment";

export default function Bill() {
    const serviceProvideName = "شطرنج العزيزية";
    const event = "بالوت";
    const day = "الجمعة";
    const date = `2024/03/01 ${day}`;
    const location = "المدينة المنورة-سلطانة";
    const memeber = 15;
    const age = "+12";
    const price = 22.5;
  
    const [isVisible, setIsVisible] = useState(true);
    const [isBooked, setIsBooked] = useState(false);
  
    const handleCancelClick = () => {
      setIsVisible(false);
    };
  
    const handleBookClick = () => {
      setIsBooked(true);
    };
  
    if (!isVisible) {
      return null; // Hide the component if canceled
    }
  
    if (isBooked) {
    //   Redirect to another page or render the booking page/component
      return <Payment />;
    }
  
    return (
      <>
        <div className="conatiner-bill" lang="ar" dir="rtl">
            <div className="service-name">{serviceProvideName}</div>
            <div className="event-name">
            <span className="text-title">الحدث: </span>
            {event}
            </div>
        <div className="event-date">
            <span className="text-title">التاريخ: </span>
            {date}
        </div>
        <div className="event-age">
            <span className="text-title">العمر: </span>
            {age}
          </div>
          <div className="event-location">
            <span className="text-title">الموقع: </span>
            {location}
          </div>
          <div className="event-member">
            <span className="text-title">الأعضاء: </span>
            {memeber}
          </div>
          <div className="event-price">
            <span className="text-title">السعر: </span>
            {price}
          </div>
          <div className="btn-bill">
            <div className="btn-book">
              <a href="/payment" className="btn-green" >
                حجز
              </a>
            </div>
            <div className="btn-cancel">
              <button className="btn-red" onClick={handleCancelClick}>
                الغاء
              </button>
            </div>
          </div>
        </div>
      </>
    );
  }
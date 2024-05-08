import React, { useState } from "react";
import { useNavigate  } from "react-router-dom";

// import '../../bootstrap.min.css'
// import '../../style.css'
import "./payment.css";
function Payment() {

    const [isConfirmed, setIsConfirmed] = useState(false);
    const navigate = useNavigate ();
  const handleConfirmClick = () => {
    // if(document.getElementById())
    setIsConfirmed(false);
    navigate("/home")
  };
  document.documentElement.dir = 'rtl';
    return (
     <div className="payment-container">
        {/* <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" /> */}
        <div className="payment-form">
          <table className="table">
            <tbody>
              <tr>
                <th>المكان</th>
                <th>الهواية</th>
                <th>الموقع</th>
                <th>التاريخ</th>
              </tr>
              <tr>
                <td className="td">شطرنج العزيز</td>
                <td className="td">بالوت</td>
                <td className="td">المدينة المنورة</td>
                <td className="td">2023/12/1<br />
                  الجمعة
                </td>
              </tr>
            </tbody></table>
          <h3 className="mt-5">الاجمالي: 40 SAR</h3>
          <hr className="w-50 mx-auto" />
          <form method="post" className="payment-input">
            <div className="">
              <div className="field-name">
                <input type="text" className="text" placeholder="الاسم" />
              </div>
              <div className="input-group mb-3">
                <input type="text" className="text" placeholder="رقم البطاقة" />
              </div>
              <div className="card-date">
                <input type="text" className="text" placeholder="MM / YY" />
                <input type="text" className="text" placeholder="CVV" />
                
              </div>
            </div>
          </form>
          <div className="btn-container">
            <div className="btn-payment">
                <button type="submit" className="sure-btn" onClick={handleConfirmClick}>تأكيد</button>
              <a href="home" className="cancel-btn" >الغاء</a>
            </div>
          </div>
        </div>
      </div>
    );
}

export default Payment;

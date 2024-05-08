import React from "react";
import "./search.css";


export default function search(){
    const userType = "H"
    const hobbyistTitle = "أماكن ترفيهية";
    const servicepTitle = "مكانك";
    return(
        <>
        <div className="search-container">
            <div className="triangle">
                
            </div>
            <div className="title-user">
                <h2>{userType === "S"? servicepTitle : hobbyistTitle}</h2>
            </div>
            <div className="filter-option">
            <div className="selection">
            <select>
                    <option value="select-city">اختر المدينة</option>
                    <option value="med">المدينة المنورة</option>
                    <option value="jeddeh">جدة</option>
                    <option value="makkah">مكة</option>
            </select>
            </div>
            <div className="date">
                <input type="date" className="date-select"/>
            </div>
            <div className="selection">
            <select>
                    <option value="select-hobby">اختر هواية</option>
                    <option value="shooting-arrow">رماية الاسهم</option>
                    <option value="bike">الدراجة الهوائية</option>
                    <option value="coffee">صنع القهوة</option>
            </select>
            </div>
            </div>
        </div>
        </>
    )
}
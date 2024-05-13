
import "../add-event/add-event.css"

export default function EditEvent(){
    return(
        <div className="add-event-container" lang="ar" dir="rtl">
            <h2 className="title">تعديل الحدث </h2>
             <form action="signup" method="post">
           
            <div class="form-group">
                <label for="name">أسم الحدث</label>
                <input type="text" id="event-name" name="event-name" required placeholder="أدخل الأسم"/>
            </div>
            <div class="form-group">
                <label for="number-of-hobbyist">عدد الأعضاء</label>
                <input type="number"  id="number-of-hobbyist" name="number-of-hobbyist" required placeholder="عدد الأعضاء"/>
            </div>
            
            <div class="form-group">
                <label for="date">تاريخ الحدث</label>
                <input type="date" id="date" name="date" required placeholder="تاريخ الحدث"/>
            </div>
            <div class="form-group">
                <label for="req-age">العمر المطلوب</label>
                <input type="number" min="5" id="req-age" name="req-age" required placeholder="العمر المطلوب"/>
            </div>
            <div class="form-group">
                <label for="location">موقع الحدث</label>
                <input type="text" id="location" name="location" required placeholder="موقع الحدث"/>
            </div>
            <div class="form-group">
                <label for="price">السعر</label>
                <input type="number"  id="price" name="price" required placeholder="السعر"/>
            </div>
            <div class="form-group">
                <label for="sharp">هل الحدث يحتوي على ادوات حادة؟</label>
                <div class="sharp">
                <input type="radio"  id="sharp" name="sharp"/><p>نعم</p>
                <input type="radio"  id="not-sharp" name="sharp"/><p>لا</p>
                </div>
            </div>
            <div class="form-group">
                <input type="submit" value="حفظ التعديلات"/>
                
            </div>
            <a href="home" >
                    <div className="cancel-button">
                            الغاء
                    </div>
                </a>
            
        </form>
        </div>
    )
}
import React, { useState } from 'react';
import { useNavigate  } from "react-router-dom";
import "./event.css";
import Bill from "../bill/bill";
import AddEvent from "../add-event/add-event"
// export default function Event(props){
//     const {hobbyName ,numberOfHobbyist ,fullHobbyist ,age ,time} = props;
//     return(
//       <>
//         <div className="container-event-all">
        
//             <a href="#" className="event-link">
//             <div className={`container-event ${getEventColor(numberOfHobbyist, fullHobbyist, time)}`} >
//                     <div className="time">{time}</div>
//                     <div className="age">{age}</div>
//                     <div className="hobby-name">{hobbyName}</div>
//                     <div className="number-of-hobbyist">{numberOfHobbyist}/{fullHobbyist}</div>
//             </div>
            
//             </a>
            
//         </div>
//         {/* <Bill/> */}
//         </>
//     )
// }

export default function Event(props) {
  const { hobbyName, numberOfHobbyist, fullHobbyist, age, time, type } = props;
  const [selectedEvent, setSelectedEvent] = useState(null);
  const navigate = useNavigate();
  const handleEventClick = () => {
    if(props.type === "new"){
      return navigate("/add-event")
    }
    setSelectedEvent(props);
  };

  const handleBillClose = () => {
    setSelectedEvent(null);
  };

  return (
    <>
      
      <button className="event" onClick={handleEventClick}>
        {/* <button herf="#" className="event-link" onClick={handleEventClick}></button> */}
          <div className={`container-event ${getEventColor(numberOfHobbyist, fullHobbyist, time)} ${getEventType(type)}`}>
            <div className="time">{time}</div>
            <div className="age">{age}</div>
            <div className="hobby-name">{hobbyName}</div>
            <div className="number-of-hobbyist">{numberOfHobbyist}/{fullHobbyist}</div>
            {getEventType(props.type) === 'new' && <div className="empty-event">اضافة حدث</div>}
          </div>
        {/* </button> */}
      </button>

      {selectedEvent && (
        <div className="bill-container">
          <Bill event={selectedEvent} onClose={handleBillClose} />
        </div>
      )}
    </>
  );
}

function getEventType(eventType){
  if(eventType === "new"){
    return 'empty-event'
  }
}
function getEventColor(numberOfHobbyist ,fullHobbyist, time){
    //here if no booking then the event will be white
    if(numberOfHobbyist ===0){
        return 'container-event';
    }
    //if the number of hobbyists were full then the color will be green
    else if(numberOfHobbyist === fullHobbyist){
        return 'green-event';
    }
    //here if more than 0 book the event then the color will be yellow
    else if(numberOfHobbyist > 0 ){
        return 'yellow-event';
    }
    //here if the user book the event then the color of event will be blue;
    // else if(time){
    //     return 'blue-event';
    // }
}

function BillLink(){
    const [showContainer, setShowContainer] = useState(false);

    const handleLinkClick = () => {
      setShowContainer(true);
    };
  
    const handleCancelClick = () => {
      setShowContainer(false);
    };
  
    const handleBookClick = () => {
      // Perform booking logic here
      setShowContainer(false);
    };
  
    return (
      <div>
        <a href="#" onClick={handleLinkClick}><Bill/></a>
  
        {showContainer && (
          <div className="small-container">
            <button onClick={handleCancelClick}>Cancel</button>
            <button onClick={handleBookClick}>Book</button>
          </div>
        )}
      </div>
    );
}
import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import Login from "../src/components/login/login.js";
import Signup from "../src/components/signup/signup.js";
import Profile from "../src/components/profile/profile.js";
import SignupServiceProvider from "../src/components/signup-serviceP/signup-serviceP.js";
import Payment from "../src/components/payment/payment.js";
import SelectHobby from "../src/components/selection/select.js";
import Forget from "../src/components/forgetPassword/forget.js";
import EditEvent from "../src/components/edit-event/edit-event.js"
import AddEvent from "../src/components/add-event/add-event.js"


import { createBrowserRouter, 
  RouterProvider,
  Router, } from 'react-router-dom';

  const router = createBrowserRouter([
    {
      path:"/",
      element: <a herf="home">nothing to see here</a>
      },
    {
      path:"/home",
      element: <App/>
      },
    {
      path:"/login",
      element: <Login/>
      },
    {
        path:"/signup",
        element: <Signup/>
    },
    {
      path:"/username/profile",
      element: <Profile/>
  },
  {
    path:"/signup/service_provider",
    element: <SignupServiceProvider/>
},
{
  path:"/payment",
  element: <Payment/>
},
{
  path:"/select-hobby",
  element: <SelectHobby/>
},
{
  path:"/forget-password",
  element: <Forget/>
},
{
  path:"/add-event",
  element: <AddEvent/>
},
{
  path:"/edit-event",
  element: <EditEvent/>
},
  
  ])
  


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <RouterProvider router={router}/>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import Login from "../src/components/login/login.js";
import Signup from "../src/components/signup/signup.js";
import Profile from "../src/components/profile/profile.js";

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
  ])
  


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <RouterProvider router={router}/>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

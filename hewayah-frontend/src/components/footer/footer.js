import React from 'react';
import './footer.css';

const Footer = () => {
  const currentYear = new Date().getFullYear();

  return (
    <footer className="footer-container">
      <div>
        <ul>
          <a href="https://www.linkedin.com/in/abdallah-aljohani-6a6396236?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app" target="_blank"><li>Abdallah</li></a>
          <a href="#" target="_blank"><li>Naif</li></a>
          <a href="#" target="_blank"><li>Abdalaziz</li></a>
          <a href="#" target="_blank"><li>Mohammed</li></a>
        </ul>
      </div>
      <p>Created at {currentYear}</p>
     
    </footer>
  );
};

export default Footer;
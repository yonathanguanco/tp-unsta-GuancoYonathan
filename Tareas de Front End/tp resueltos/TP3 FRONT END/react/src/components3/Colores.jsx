import React, { useState } from 'react';

function ColorChanger() {
  const [backgroundColor, setBackgroundColor] = useState('white');

  const changeColor = () => {
    
    const randomColor = '#' + Math.floor(Math.random()*16777215).toString(16);
    setBackgroundColor(randomColor);
  };

  return (
    <div>
      {/* Cuadrado con el color de fondo actual */}
      <div
        style={{
          width: '100px',
          height:'100px',
          backgroundColor: backgroundColor,
          padding: '30px',
          borderRadius:'7px'
        }}
      ></div>
      {/* Botón para cambiar el color */}
      
      <button onClick={changeColor} style={{
        alignItems:'center',
        marginLeft:'auto',
        marginRight:'auto',
        borderRadius:'10px',
        padding:'30px',
        marginBottom: '10px',
        margin:'10px',
        fontSize:'14px'


      }}>Cambiar Color</button>
    </div>
  );
}

export default ColorChanger;

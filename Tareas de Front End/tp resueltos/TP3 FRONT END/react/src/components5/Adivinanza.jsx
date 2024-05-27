import React, { useState } from 'react';

function JuegoNumeroAleatorio() {
  const [numeroAleatorio, setNumeroAleatorio] = useState(generarNumeroAleatorio());
  const [suposicionUsuario, setSuposicionUsuario] = useState('');
  const [mensaje, setMensaje] = useState('');

  function generarNumeroAleatorio() {
    return Math.floor(Math.random() * 100) + 1; // Genera un número aleatorio entre 1 y 100
  }

  function manejarCambioInput(evento) {
    setSuposicionUsuario(evento.target.value);
  }

  function manejarSuposicion() {
    const suposicion = parseInt(suposicionUsuario);

    if (isNaN(suposicion)) {
      setMensaje('Por favor, introduce un número válido.');
    } else if (suposicion === numeroAleatorio) {
      setMensaje('¡Felicidades! Has adivinado el número.');
    } else if (suposicion < numeroAleatorio) {
      setMensaje('El número es mayor. Sigue intentándolo.');
    } else {
      setMensaje('El número es menor. Sigue intentándolo.');
    }
  }

  function reiniciarJuego() {
    setNumeroAleatorio(generarNumeroAleatorio());
    setSuposicionUsuario('');
    setMensaje('');
  }

  return (
    <div>
      <h1>Adivina el número</h1>
      <p>Introduce un número entre 1 y 100:</p>
      <input type="text" value={suposicionUsuario} onChange={manejarCambioInput} />
      <button onClick={manejarSuposicion}>Adivinar</button>
      <button onClick={reiniciarJuego}>Reiniciar</button>
      <p>{mensaje}</p>
    </div>
  );
}

export default JuegoNumeroAleatorio;

import React, { useState } from 'react';

function GeneradorEmoji() {
  const [emojiAleatorio, setEmojiAleatorio] = useState(null);

  const generarEmojiAleatorio = () => {
    // Lista de emojis
    const emojis = ['😀', '😂', '😎', '😍', '🥳', '🎉', '🚀', '💡', '🍕', '🎈'];

    // Generar un índice aleatorio para seleccionar un emoji de la lista
    const indiceAleatorio = Math.floor(Math.random() * emojis.length);

    // Establecer el emoji aleatorio en el estado
    setEmojiAleatorio(emojis[indiceAleatorio]);
  };

  return (
    <div>
      {/* Mostrar el emoji aleatorio */}
      <span style={{ fontSize: '2rem' }}>{emojiAleatorio}</span>
      {/* Botón para generar un nuevo emoji */}
      <button onClick={generarEmojiAleatorio}>Generar Emoji</button>
    </div>
  );
}

export default GeneradorEmoji;

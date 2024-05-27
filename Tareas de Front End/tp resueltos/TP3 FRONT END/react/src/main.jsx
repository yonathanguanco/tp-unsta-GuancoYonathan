import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App.jsx'
import './index.css'
import Contador from './components2/Contador.jsx'
import ColorChanger from './components3/Colores.jsx'
import './components3/Colores.jsx'
import GeneradorEmoji from './components4/Emojis.jsx'
import JuegoNumeroAleatorio from './components5/Adivinanza.jsx'


ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <App />
    <Contador />
    <ColorChanger />
    <GeneradorEmoji />
    < JuegoNumeroAleatorio />
    </React.StrictMode>,
)

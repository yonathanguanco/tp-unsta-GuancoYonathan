import './components/Tarjeta.css'
import TarjetaPresentacion from './components/Tarjeta'
// Componente principal
const App = () => {
  return (
    <>
      <div className='tarjeta-presentacion'>
        <h2> Tarjeta de Presentación</h2>
        {/* Pasando los datos al componente de tarjeta de presentación mediante props */}
        <TarjetaPresentacion
          nombre="Yonathan"
          apellido="Guanco"
          profesion=" En porceso!!"
          descripcion="Tengo 20 años, estudio Tecnicatura universitaria en desarrollo y calidad de software en la Universidad del Norte Santo Tomas de Aquino"
        />
      </div>
    </>
  );
};

export default App;
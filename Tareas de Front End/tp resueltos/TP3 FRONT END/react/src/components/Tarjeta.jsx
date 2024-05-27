// Componente de tarjeta de presentación
const TarjetaPresentacion = (props) => {
    const { nombre, apellido, profesion, descripcion } = props;


return (
    <>
    <div className="tarjeta-presentacion">
      <h2>{nombre} {apellido}</h2>
      <p><strong>Profesión:</strong> {profesion}</p>
      <p> <strong> Descripcion:</strong>{descripcion}</p>
    </div>
    
    </>
  );
};

export default TarjetaPresentacion;

/*
function TarjetaPresentacion() {
    return (
        <>

        </>
    )
}
// export default TarjetaPresentacion;*/
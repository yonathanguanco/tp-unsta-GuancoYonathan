import React, { useState } from 'react';

const Contador = () => {
  const [count, setCount] = useState(0);

  const incrementar = () => {
    setCount(count + 1);
  };

  return (
    <div className='contador'>
      <h2>Contador: {count}</h2>
      <button onClick={incrementar}>Incrementar</button>
    </div>
  );
};

export default Contador;

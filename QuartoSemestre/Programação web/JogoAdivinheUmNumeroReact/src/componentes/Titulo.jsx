import React from 'react'

export default ({tentativa=0}) => (
  <h1>Jogo Adivinhe um número em <span>{tentativa}</span> tentativas</h1>
)

// export default ({tentativa=0}) => (
//   <h1>Jogo Adivinhe um número em <span>{10 - tentativa}</span> tentativas</h1>
// )
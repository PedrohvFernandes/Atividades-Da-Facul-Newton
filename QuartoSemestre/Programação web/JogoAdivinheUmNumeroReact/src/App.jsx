import React, {useRef, useState} from 'react'

import Titulo from './componentes/Titulo'
import Descricao from './componentes/Descricao'

import './App.css'

let numeroAleatorio = Math.floor((Math.random() * 100) + 1);

export default () => {
  const textoInput = useRef()
  
  const [rodada, setRodada] = useState(10)

  const [palpites, setPalpites] = useState('')

  const [ultimoResultado, setUltimoResultado] = useState('')

  const [classeMensagem, setClasseMensagem] = useState('info')

  const [cursor, setCursor] = useState(false)

  const [baixoOuAlto, setBaixoOuAlto] = useState('')

  const [fimDoJogo, setFimDoJogo] = useState(false)

  console.log('Palpites: ', palpites)

  const conferirPalpite = () => {
    const valor = textoInput.current.value

    if(valor < 0 || valor > 100) {
      setUltimoResultado('O valor informado deve ser entre 0 e 100.')

      setClasseMensagem('erro')

      textoInput.current.focus()
    } else {

      setUltimoResultado('')

      if(valor == numeroAleatorio) {
        setUltimoResultado('Parabéns! Você acertou.')

        setClasseMensagem('info')
        setCursor(true)
        setFimDoJogo(true)

      } else if(rodada > 0) {
        setUltimoResultado('Errado!')
        setClasseMensagem('erro')

        if(valor < numeroAleatorio)
          setBaixoOuAlto('Seu palpite está muito baixo!')
        else
          setBaixoOuAlto('Seu palpite está muito alto!')
          setRodada(rodada - 1)
        
      } else {
        setUltimoResultado('FIM DO JOGO!')
        setClasseMensagem('erro')
        setCursor(true)

        setFimDoJogo(true)
      }

      setPalpites(`${palpites} ${valor}`)
      
    }
  }

  const reiniciarJogo = () => {
    numeroAleatorio = Math.floor((Math.random() * 100) + 1);
    setRodada(10)
    setPalpites('')
    setUltimoResultado('')
    setBaixoOuAlto('')
    setFimDoJogo(false)
    setCursor(false)
  }

  return (
    <>
      <Titulo 
        tentativa={rodada}
      />
      <Descricao />

      <label>Digite um palpite:</label>

      <input className={cursor ? 'mudarCursorMouseBlock' : 'mudarCursorMouseDefault'} ref={textoInput} type='number' min={1} max={100} disabled={fimDoJogo} />

      <button className={cursor ? 'mudarCursorMouseBlock' : 'mudarCursorMouseDefault'} onClick={conferirPalpite} disabled={fimDoJogo}>Enviar palpite</button>
      {
        fimDoJogo && <button onClick={reiniciarJogo}>Iniciar novo jogo</button>
      }
      
      <p>Palpites anteriores: {palpites}</p>

      <p className={classeMensagem}>{ultimoResultado}</p>

      <p>{baixoOuAlto}</p>
    </>
  )
}
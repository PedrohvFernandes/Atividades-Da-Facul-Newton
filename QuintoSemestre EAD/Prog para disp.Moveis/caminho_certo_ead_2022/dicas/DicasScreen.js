import React, {useState, useEffect} from 'react'
import {View, Text, Button, Image, StyleSheet} from 'react-native'

import {buscarTodasDicas, buscarPorId} from './DicasApi'

export default () => {
  const [indice, setIndice] = useState(1)
  const [dica, setDica] = useState({})

  useEffect(() => {
    carregarDica()
  }, [indice])

  async function carregarDica() {
    const resultado = await buscarPorId(indice)
    setDica(resultado)
  }

  return(
    <View style={styles.container}>
      <Image source={{uri: dica.imagemDica}} style={styles.imagem} />
      <Text>{dica.textoDica}</Text>
      <View style={styles.botoes}>
        <View style={{width: 100}}>
          <Button title='SIM'onPress={() => setIndice(indice + 1)} />
        </View>
        <View style={{width: 100}}>
          <Button title='NÃO' />
        </View>
      </View>
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'space-evenly'
  }, 
  imagem: {
    width: 300,
    height: 250
  },
  botoes: {
    width: '100%',
    flexDirection: 'row',
    justifyContent: 'space-evenly'
  }
})
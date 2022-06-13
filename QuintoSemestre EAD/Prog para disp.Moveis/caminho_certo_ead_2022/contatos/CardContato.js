import React from 'react'
import {Text, View, StyleSheet, TouchableOpacity, Image} from 'react-native'

import { AntDesign } from '@expo/vector-icons';

export default ({foto, tipo, nome, telefone}) => {
  return(
    <View style={styles.container}>
      <Image source={foto} style={{ width: 70, height: 90}} />
      <View style={styles.dados}>
        <Text style={styles.texto}>{tipo}</Text>
        <Text style={[styles.texto, styles.textoEmDestaque]}>{nome}</Text>
        <Text style={styles.texto}>{telefone}</Text>
      </View>
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    flexDirection: "row",
    justifyContent: "center",
    alignItems: "center",
    marginTop: 10,
    marginLeft: 20,
    marginRight: 20
  },
  dados: {
    flexGrow: 1,
    padding: 10
  }, 
  texto: {
    fontFamily: 'Roboto',
    fontSize: 14
  },
  textoEmDestaque: {
    fontWeight: 'bold'
  }
})
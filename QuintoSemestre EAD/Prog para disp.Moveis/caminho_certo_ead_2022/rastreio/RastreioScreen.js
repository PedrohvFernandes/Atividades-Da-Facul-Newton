import React from 'react'
import {View, Text, StyleSheet} from 'react-native'
import CustomButton from '../home/CustomButton'

export default ({navigation}) => {
  return (
    <View style={styles.container}>
      <Text style={styles.text}>
        O rastreio é composto de várias perguntas sobre diferentes fatores de risco.
      </Text>
      <Text style={[styles.text, styles.verdeClaro]}>
        Sempre que sua resposta apresentar um fator de risco recebera uma orientação em vídeo.
      </Text>
      <CustomButton 
        title='Continuar'
        onPress={() => navigation.navigate('dicas')}
      />
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'space-evenly',
    padding: 15
  },
  text: {
    backgroundColor: '#0D5145',
    color: 'white',
    fontSize: 21,
    textAlign: 'center',
    padding: 20,
    borderRadius: 30
  },
  verdeClaro: {
    backgroundColor: '#1C9984'
  }
})
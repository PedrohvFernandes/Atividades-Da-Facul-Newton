import React from 'react'
import {View, StyleSheet, Text, Button} from 'react-native'

import Constants from 'expo-constants'

import Header from './Header'
import CustomButton from './CustomButton'

export default (props) => {
  const navigation = props.navigation

  return(
    <View style={styles.container}>
      <Header />
      <View style={styles.botoes}>
        <CustomButton 
          title='SOS'
          color='red'
          onPress={() => navigation.navigate('listaContatos')}
        />

        <CustomButton 
          title='REGISTRO'
          color='#24CBAF'
          onPress={() => alert('Clique em Registro')}
        />

        <CustomButton 
          title='RASTREIO'
          color='#24CBAF'
          onPress={() => navigation.navigate('rastreio')}
        />

        {/* 
        <Button  
          title='SOS'
          color='red'
          onPress={() => navigation.navigate('listaContatos')}
        />

        <Button
          title='REGISTRO'
          color='#24CBAF'
          onPress={() => alert('Clique em Registro')}
        />

        <Button
          title='RASTREIO'
          color='#24CBAF'
          onPress={() => navigation.navigate('rastreio')}
        />
        */}
      </View>
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    //backgroundColor: 'red',
    marginTop: Constants.statusBarHeight
  },
  botoes: {
    flex: 1,
    justifyContent: 'space-evenly',
    // backgroundColor: 'red',
    padding: 20
  }
})
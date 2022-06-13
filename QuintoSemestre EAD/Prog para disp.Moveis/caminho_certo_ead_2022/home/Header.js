import React from 'react'

import {View, Text, Image, StyleSheet} from 'react-native'

import logo from '../assets/logo.png'

export default () => {
  return (
    <View style={styles.header}>
      <Text style={styles.title}>Caminho Certo</Text>
      <Image source={logo} style={styles.image} />
    </View>
  )
}

const styles = StyleSheet.create({
  header: {
    alignItems: 'center',
    backgroundColor: '#24CBAF',
    padding: 10
  },
  title: {
    fontSize: 26,
    fontFamily: 'Roboto',
    fontWeight: 'bold',
    color: 'white'
  },
  image: {
    width: 100,
    height: 100,
    borderRadius: 100,
    borderWidth: 1,
    borderColor: 'white'
  }
})
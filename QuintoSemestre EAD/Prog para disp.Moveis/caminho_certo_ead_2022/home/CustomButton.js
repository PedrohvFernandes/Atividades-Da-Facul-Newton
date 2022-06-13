import React from 'react'
import {TouchableOpacity, Text, StyleSheet} from 'react-native'

export default ({title, color='#24CBAF', onPress}) => (
    <TouchableOpacity 
      onPress={onPress}
      style={[styles.button, {backgroundColor: color}]} 
    >
      <Text style={styles.text}>{title.toUpperCase()}</Text>
    </TouchableOpacity>
)

const styles = StyleSheet.create({
  button: {
    height: 60,
    alignItems: 'center',
    justifyContent: 'center',
    borderRadius: 20,
    elevation: 3
  },
  text : {
    fontFamily: 'Roboto',
    fontWeight: 'bold',
    color: 'white',
    fontSize: 26
  }
})
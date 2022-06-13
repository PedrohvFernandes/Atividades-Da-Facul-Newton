import React from 'react'
import {View, Text} from 'react-native'

import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';

import HomeScreen from './home/HomeScreen'
import ListaContatosScreen from './contatos/ListaContatosScreen'
import SosScreen from './sos/SosScreen'
import RastreioScreen from './rastreio/RastreioScreen'
import DicasScreen from './dicas/DicasScreen'


const Stack = createNativeStackNavigator()

const headerStyle = {
  headerTintColor: 'white',
  headerStyle: {
    backgroundColor: '#24CBAF'
  },
  headerTitleStyle: {
    fontWeight: 'bold'
  }
}

export default () => {

  return(
    <NavigationContainer>
      <Stack.Navigator screenOptions={headerStyle}>
        <Stack.Screen name="home" component={HomeScreen} options={{headerShown: false}} />
        <Stack.Screen name="listaContatos" component={ListaContatosScreen} options={{title: 'Lista de contatos'}} />
        <Stack.Screen name="sos" component={SosScreen} options={{title: 'SOS'}} />
        <Stack.Screen name='rastreio' component={RastreioScreen} />
        <Stack.Screen name='dicas' component={DicasScreen} />
      </Stack.Navigator>
    </NavigationContainer>
  )
}
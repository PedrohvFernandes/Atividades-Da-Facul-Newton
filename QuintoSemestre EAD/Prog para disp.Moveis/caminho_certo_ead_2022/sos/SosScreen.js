import React, {useState, useEffect} from 'react'
import {View, Text, StyleSheet} from 'react-native'

import MapView, {Marker} from 'react-native-maps'
import * as Location from 'expo-location'

import { MaterialCommunityIcons } from '@expo/vector-icons';

export default (props) => {
  const navigation = props.navigation
  const route = props.route
  const [location, setLocation] = useState()

  useEffect(() => {
    obterLocalizacao()
  }, [])

  async function obterLocalizacao() {
    const {status} = await Location.requestForegroundPermissionsAsync()

    if(status !== 'granted') {
      alert('Necessário habilitar o serviço de localização do seu aparelho')
      return 
    }

    const location = await Location.getCurrentPositionAsync({})
    setLocation({
      latitude: location.coords.latitude,
      longitude: location.coords.longitude,
      latitudeDelta: 0.005,
      longitudeDelta: 0.005,
    })
  }


  return (
    <View style={styles.container}>
      <Text>SOS Screen - {route.params.nome + ' - ' + route.params.telefone}</Text>
      <MapView 
        initialRegion={location}
        style={styles.mapView}
      >
        {
          location && 
            <Marker
              coordinate={location}
            >
              <MaterialCommunityIcons name="human-handsup" size={36} color="black" />
            </Marker>
        }
      </MapView>
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    flex: 1
  },
  mapView: {
    width: '100%',
    height: '100%'
  }
})
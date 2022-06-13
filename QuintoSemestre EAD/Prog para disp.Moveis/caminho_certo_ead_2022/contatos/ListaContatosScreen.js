import React, {useState, useEffect} from  'react'
import {View, Text, FlatList, Button, TouchableOpacity} from 'react-native'
import AsyncStorage from '@react-native-async-storage/async-storage';

import {Button as ButtonPaper, Dialog, Portal, Provider, TextInput} from 'react-native-paper'

import foto from '../assets/filha.png'
import CardContato from './CardContato'

/*
const listaContatos = [
  {id: 1, nome: 'Larissa', telefone: '31 9 8855-6622'},
  {id: 2, nome: 'Kamila', telefone: '31 9 8855-6622'},
  {id: 3, nome: 'Ana Clara', telefone: '31 9 8855-6622'},
  {id: 4, nome: 'Ana Luisa', telefone: '31 9 8855-6622'},
  {id: 5, nome: 'Natalia', telefone: '31 9 8855-6622'}
]
*/

export default (props) => {
  const navigation = props.navigation
  const [modalVisible, setModalVisible] = useState(false)
  const [tipo, setTipo] = useState('')
  const [nome, setNome] = useState('')
  const [telefone, setTelefone] = useState('')
  const [listaContatos, setListaContatos] = useState([])

  useEffect(
    () => {
      loading()
    },
    []
  )

  async function removerContatos() {
    //await AsyncStorage.clear()
    await AsyncStorage.removeItem('@listaContatosSOS')
    setListaContatos([])
  }

  async function addContatos() {
    let jsonValue = await AsyncStorage.getItem('@listaContatosSOS')
    const contatos = jsonValue != null
                              ? JSON.parse(jsonValue)
                              : []
    
    const novoContato = {tipo, nome, telefone}

    contatos.push(novoContato) 

    jsonValue = JSON.stringify(contatos)
    await AsyncStorage.setItem('@listaContatosSOS', jsonValue)
    console.log('Gravando contatos:', jsonValue)

    setListaContatos(contatos)
    setModalVisible(false)
  }

  async function loading() {
    const jsonValue = await AsyncStorage.getItem('@listaContatosSOS')
    const jsObject = jsonValue != null 
                          ? JSON.parse(jsonValue) 
                          : null
    setListaContatos(jsObject)
  }

  return (
    <Provider>
      <View>
        <Text>Listagem de contatos SOS</Text>
        <FlatList
          data={listaContatos}
          renderItem={({item}) => 
            <TouchableOpacity 
              onPress={() => navigation.navigate('sos', {nome: item.nome, telefone: item.telefone})}
            > 
              <CardContato
                foto={foto}
                tipo={item.tipo}
                nome={item.nome}
                telefone={item.telefone}
              />
            </TouchableOpacity>
          }
          keyExtractor={item => item.id}
        />
        <Button 
          title='Add Contato'
          onPress={() => setModalVisible(true)}
        />
        <Button 
          title='Limpar contatos'
          onPress={removerContatos}
        />

        <Portal>
          <Dialog visible={modalVisible} onDismiss={() => setModalVisible(false)}>
            <Dialog.Title>Novo contato</Dialog.Title>
            <Dialog.Content>
              <TextInput 
                label='Tipo'
                value={tipo}
                onChangeText={(text) => setTipo(text)}
                mode='outlined'
              />
              <TextInput 
                label='Nome'
                value={nome}
                onChangeText={(text) => setNome(text)}
                mode='outlined'
              />
              <TextInput 
                label='Telefone'
                value={telefone}
                onChangeText={(text) => setTelefone(text)}
                mode='outlined'
                keyboardType='phone-pad'
              />
            </Dialog.Content>
            <Dialog.Actions>
              <ButtonPaper onPress={() => setModalVisible(false)}>CANCELAR</ButtonPaper>
              <ButtonPaper
                onPress={addContatos}
              >
                SALVAR
              </ButtonPaper>
            </Dialog.Actions>
          </Dialog>
        </Portal>
      </View>
    </Provider>
  )
}
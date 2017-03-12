'use strict';

import React from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View,
  Button,
  Alert
} from 'react-native';

import LoginScreen from "./react-app/login";

class HelloWorld extends React.Component {
  render() {
    
    return (
      <View style={styles.container}>
        <Text style={styles.hello}>Hello, World from react</Text>
        <Button onPress={(this._onPressLearnMore.bind(this))} title="Learn More" color="#841584" accessibilityLabel="Learn more about this purple button" />
      </View>
    )
  }

 _onPressLearnMore() {
    Alert.alert(
      'Alert Title', 
      'My Alert Msg'
    )
  }
}
var styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
  },
  hello: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
  loginContainer: {
    flex: 1
  }
});

class LoginComponent extends React.Component {
  render() {
    return(
    <View style={styles.loginContainer}>
            <LoginScreen />
    </View>
    )
  }
}

AppRegistry.registerComponent('HelloWorld', () => HelloWorld);
AppRegistry.registerComponent('LoginScreen', () => LoginComponent);
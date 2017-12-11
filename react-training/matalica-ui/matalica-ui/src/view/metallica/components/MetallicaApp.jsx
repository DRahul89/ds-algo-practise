import React, { Component } from 'react';
import Header from "./Header.jsx"
import TradeScreen from "../containers/TradeScreenContainer"
class MetallicaApp extends Component {
  render() {
    return (
      <div >
       <Header/>
       <TradeScreen />
      </div>
    );
  }
}

export default MetallicaApp;

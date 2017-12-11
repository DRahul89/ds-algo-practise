import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import {Panel} from "react-bootstrap"

class App extends Component {
  constructor(props){
    super(props);
  }
  render() {
    return (
      <div className="container">
        {this.props.children}
        
      </div>
    );
  }
}

export default App;

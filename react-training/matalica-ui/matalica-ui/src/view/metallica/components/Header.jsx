import React, { Component } from 'react';
import {Panel} from "react-bootstrap";

class Header extends Component {
  render() {
    return (
      <div >
        
        <Panel collapsible={false} header={<b>Metallica App</b>} >
        <ul className="nav nav-tabs">
          <li className="active"><a href="#">TRADES</a></li>
          <li><a href="#">TRANSFERS</a></li>
          <li><a href="#">TRANSPORTS</a></li>
          <li className="pull-right"><p>Rahul :<span class="glyphicon glyphicon-user"></span></p> </li>
        </ul>         
        </Panel>
        
        
      </div>
    );
  }
}

export default Header;

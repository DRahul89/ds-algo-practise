import React, { Component } from 'react';
import {Panel} from "react-bootstrap"
class LiveMarketPrice extends Component {
  render() {
    return (
        <div>
        <Panel header={<marquee scrollamount="5"><text className="color-red">Live Market Rates</text ></marquee>} >
            <div className="row">
            <div className="col-sm-2">
                <b><text>Commodity Name</text></b>
            </div>
            <div className="col-sm-1">
            Silver
            </div>
            </div>
            <div className="row">
            <div className="col-sm-2">
                <b><text>Commodity Price</text></b>
            </div>
            <div className="col-sm-1">
           100 USD
            </div>
            </div>
          </Panel>
       
      </div>
    );
  }
}

export default LiveMarketPrice;

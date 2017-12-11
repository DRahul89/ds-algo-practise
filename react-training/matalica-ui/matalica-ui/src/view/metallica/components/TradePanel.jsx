import React, { Component } from 'react';
import {Panel,Button} from "react-bootstrap"
import '../../../App.css';
import Select from 'react-select';
import { SingleDatePicker} from 'react-dates';
import moment from "moment";
class TradePanel extends Component {
  constructor(props){
    super(props);
    this.state = {
      tradeId:null,
      tradeDate : null,
      commodityId: null,
      side : 'BUY',
      counterPartId: null,
      locationId: null,
      quantity: null,
      price: null,
      userId:1
    }
}
setTradeDate=(e)=>{
let tradeDate = e.format('YYYY-MM-DD');
this.setState({tradeDate});
}
saveUpdateTrade=()=>{
  if(this.state.tradeId != null){
    this.props.updateTrade(this.state);
  }else{
  this.props.addTrade(this.state);
  }
}
deleteTrade=()=>{
  this.props.deleteTrade(this.state.tradeId);
}
clearState=()=>{
  this.setState(Object.assign({},this.state,{
    tradeId:null,
    tradeDate : null,
    commodityId: null,
    side : 'BUY',
    counterPartId: null,
    locationId: null,
    quantity: 0,
    price: 0,
    userId:1
}));
}
componentWillReceiveProps(nextProps){
  console.log("cart summary recieve props  next ",nextProps);
  let row = nextProps.row;
  if(row != null){
  this.setState(Object.assign({},this.state,{
    tradeId:row.tradeId,
    tradeDate : row.tradeDate,
    commodityId: row.commodityId,
    side : row.side,
    counterPartId: row.counterPartId,
    locationId: row.locationId,
    quantity: row.quantity,
    price: row.price,
    userId:1
}));
  }else{
    this.clearState();
  }
}
  render() {
      let headerContent  = (<div><b>Trade Id:{this.state.tradeId}</b> <a onClick={this.deleteTrade}> <span className='glyphicon glyphicon-trash pull-right'> </span></a></div>);
    return (
      <div >
        
        <Panel header={headerContent} >
        
        <div className="row">
        <div className="col-lg-4" >
        <p className="row-space"> <strong>TradeDate</strong></p>
        </div>
        <div className="col-lg-8" >
        <SingleDatePicker
  date={(null!= this.state.tradeDate)?moment(this.state.tradeDate):null} // momentPropTypes.momentObj or null
  onDateChange={this.setTradeDate} // PropTypes.func.isRequired
  focused={this.state.focused} // PropTypes.bool
  onFocusChange={({ focused }) => this.setState({ focused })} // PropTypes.func.isRequired
/>
        </div>
        </div>
        <div className="row">
        <div className="col-lg-4" >
        <p className="row-space"><strong>Price</strong></p>
        </div>
        <div className="col-lg-8" >
        <input type="text" value={this.state.price} onChange={e => this.setState({price:e.target.value})}/>
        </div>
        </div>
        <div className="row">
        <div className="col-lg-4" >
        <p className="row-space"><strong>Quantity</strong></p>
        </div>
        <div className="col-lg-8" >
        <input type="text"  value={this.state.quantity} onChange={t => this.setState({quantity:t.target.value})}/>
        </div>
        </div>
        <div className="row">
        <div className="col-lg-4" >
        <p className="row-space"><strong>Commodity</strong></p>
         </div>
         <div className="col-lg-8" >
         <Select
        name="commodity"
        value={this.state.commodityId}
        onChange={t => this.setState({commodityId:t.value})}
        options={this.props.commodities}
      />
         </div>
        </div>
        <div className="row">
        <div className="col-lg-4" >
        <p className="row-space"><strong>Side</strong></p>
        </div>
         <div className="col-lg-8" >
        <Select
        name="side"
        value={this.state.side}
        onChange={t => this.setState({side:t.value})}
        options={[
          { value: 'BUY', label: 'BUY' },
          { value: 'SELL', label: 'SELL' },
        ]}
      />
        </div>
        </div>
        <div className="row">
        <div className="col-lg-4" >
        <p className="row-space"><strong>Counterparty</strong></p>
        </div>
        <div className="col-lg-8" >
        <Select
        name="counterparty"
        value={this.state.counterPartId}
        onChange={t => this.setState({counterPartId:t.value})}
        options={this.props.counterparties}
      />
         </div>
        </div>
        
        <div className="row">
        <div className="col-lg-4" >
        <p className="row-space"><strong>Location</strong></p>
        </div>
        <div className="col-lg-8" >
        <Select
        name="location"
        value={this.state.locationId}
        onChange={t => this.setState({locationId:t.value})}
        options={this.props.locations}
      />
        </div>
        </div>
        <div className="row">
       <div className="pull-right">
        <Button onClick={this.clearState}>Cancel</Button>
        <Button onClick={this.saveUpdateTrade}>Save</Button>
        </div>
        </div>
        
        
        </Panel>
      </div>
    );
  }
}

export default TradePanel;

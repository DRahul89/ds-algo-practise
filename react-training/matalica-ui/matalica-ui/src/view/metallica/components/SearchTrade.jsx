import React, { PureComponent } from 'react';
import {Panel,Button} from "react-bootstrap";
import Select from 'react-select';
import createReactClass  from "create-react-class";
import 'react-select/dist/react-select.css';
import 'react-dates/initialize';
import { DateRangePicker} from 'react-dates';
import moment from "moment";
const TradeHeader =createReactClass({
    render() {
      return (
        <div className="row">
        <div className="col-lg-4" >
        Trade date
        </div>
        <div className="col-lg-2" >
        Commodity
        </div>
        <div className="col-lg-2" >
        Side
        </div>
        <div className="col-lg-2" >
        Counterparty 
        </div>
        <div className="col-lg-2" >
        Location
        </div>
        </div>      
      );
    }
  });
  
class SearchTrade extends PureComponent {
    constructor(props){
        super(props);
        this.state = {
          startDate : null,
          endDate : null,
          commodityId: null,
          side : null,
          counterPartId: null,
          locationId: null
        }
    }

    handleCommodityChange=(elememnt)=>{
      this.setState(Object.assign({},this.state,{commodityId:elememnt.value}));
    }
    handleCounterPartyChange=(elememnt)=>{
      this.setState(Object.assign({},this.state,{counterPartId:elememnt.value}));
    }
    handleLocationChange=(elememnt)=>{
      this.setState(Object.assign({},this.state,{locationId:elememnt.value}));
    }
    handleSideChange=(elememnt)=>{
      this.setState(Object.assign({},this.state,{side:elememnt.value}));
    }
    handleDateChange=(e)=>{

      let stDt = (undefined != e.startDate)?moment(e.startDate).format('YYYY-MM-DD'):null;
      let endDt = (undefined != e.endDate)?moment(e.endDate).format('YYYY-MM-DD'):null;
      this.setState({startDate:stDt,endDate:endDt});
      //console.log(e);
    }

    clear=()=>{
      this.setState(Object.assign({},this.state,{
        startDate : null,
        endDate : null,
        commodityId: null,
        side : null,
        counterPartId: null,
        locationId: null
    }));
    }
    search=()=>{
      this.props.searchTrade(this.state);
    }
  render() {
   
    return (
      <div >
        
        <Panel header={<b>Search Trade</b>} >
        <TradeHeader />
        <div className="row">
        <div className="col-lg-4" >
        <DateRangePicker
  startDate={(null!=this.state.startDate)?(moment(this.state.startDate)):null} // momentPropTypes.momentObj or null,
  endDate={(null != this.state.endDate)?(moment(this.state.endDate)):null} // momentPropTypes.momentObj or null,
  onDatesChange={this.handleDateChange} // PropTypes.func.isRequired,
  focusedInput={this.state.focusedInput} // PropTypes.oneOf([START_DATE, END_DATE]) or null,
  onFocusChange={focusedInput => this.setState({ focusedInput })} // PropTypes.func.isRequired,
/>
        </div>
        <div className="col-lg-2" >
        <Select
        name="commodity"
        value={this.state.commodityId}
        onChange={this.handleCommodityChange}
        options={this.props.commodities}
      />
      </div>
      <div className="col-lg-2" >
      <Select
        name="side"
        value={this.state.side}
        onChange={this.handleSideChange}
        options={[
          { value: 'BUY', label: 'BUY' },
          { value: 'SELL', label: 'SELL' },
        ]}
      />
        </div>
      <div className="col-lg-2" >
        <Select
        name="counterparty"
        value={this.state.counterPartId}
        onChange={this.handleCounterPartyChange}
        options={this.props.counterparties}
      />
      </div>
      <div className="col-lg-2" >
        <Select
        name="location"
        value={this.state.locationId}
        onChange={this.handleLocationChange}
        options={this.props.locations}
      />
      </div>
    </div>
        <div className="row">
        <div className="pull-right">
        <Button onClick={this.clear}>Clear</Button>
        <Button onClick={this.search}>Search</Button>
        </div>
        </div>
        </Panel>
      </div>
    );
  }
}

export default SearchTrade;

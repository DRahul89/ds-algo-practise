import React, { Component } from 'react';
import TradePanel from "./TradePanel.jsx";
import TradeGrid from "./TradeGrid";
import LiveMarketPrice from "./LiveMarketPrice.jsx"
import SearchTrade from "./SearchTrade.jsx"
class TradeScreen extends Component {
  constructor(props){
    super(props);
    this.state={row:null};
  }
  componentDidMount(){
    this.props.fetchCommodity();
    this.props.fetchCounterParty();
    this.props.fetchLocation();
  }
  updatePanelState=(row)=>{
    this.setState({row:row});
  }
  render() {
    const commodities = this.props.commodities.map(elem =>{
      return {value:elem.entityId,label:elem.commodityName}
    });
    const counterparties = this.props.counterparties.map(elem =>{
      return {value:elem.entityId,label:elem.counterPartyName}
    });
    const locations = this.props.locations.map(elem =>{
      return {value:elem.entityId,label:elem.locationName}
    });
   
    let isActive =true;
    let searchPanel ;
    if(isActive){
      searchPanel =(
        <div className="row">
        <div className="col-lg-8" >
        <TradeGrid updatePanel={this.updatePanelState} trades={this.props.trades}/>
        </div>
        <div className="col-lg-4" >
        <TradePanel  row={this.state.row} deleteTrade={this.props.deleteTrade} updateTrade={this.props.updateTrade} addTrade={this.props.addTrade} commodities={commodities} locations={locations} counterparties={counterparties}/>
        </div>
        </div>
      );
    }
    return (
     
      <div>
         <LiveMarketPrice />
         <SearchTrade searchTrade={this.props.searchTrade} commodities={commodities} locations={locations} counterparties={counterparties}/>
          {searchPanel}
      </div>
    );
  }
}

export default TradeScreen;

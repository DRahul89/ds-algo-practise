import React, { Component } from 'react';
import {Panel} from "react-bootstrap";
import {BootstrapTable, TableHeaderColumn} from 'react-bootstrap-table';


class TradeGrid extends Component {

  
 onRowSelect=(row, isSelected, e) =>{
    console.log(row);
    this.props.updatePanel(row);
  }

    
 addNewTrade=() =>{
  
  return this.props.updatePanel(null);
}
  
  render() {
    const selectRowProp = {
      mode: 'checkbox',
      bgColor: 'pink', // you should give a bgcolor, otherwise, you can't regonize which row has been selected
      hideSelectColumn: true,  // enable hide selection column.
      clickToSelect: true , // you should enable clickToSelect, otherwise, you can't select column.
      onSelect: this.onRowSelect,
    };
    const addButton = ( <div><b>Trade Grid </b><a className="pull-right"  onClick={this.addNewTrade}>
    <span class="glyphicon glyphicon-plus-sign"></span>
  </a></div>);
    return (
      <div >
        
        <Panel header={addButton} >
        <BootstrapTable ref='table' data={this.props.trades} selectRow={ selectRowProp } striped={true} hover={true}>
        <TableHeaderColumn isKey dataField='tradeId' >Trade Id</TableHeaderColumn>
          <TableHeaderColumn dataField='tradeDate' >Trade Date</TableHeaderColumn>
          <TableHeaderColumn dataField='commodity' >Commodity</TableHeaderColumn>
          <TableHeaderColumn dataField='side'>Side</TableHeaderColumn>
          <TableHeaderColumn dataField='quantity' >Qty(MT)</TableHeaderColumn>
          <TableHeaderColumn dataField='price' >Price(/MT)</TableHeaderColumn>
          <TableHeaderColumn dataField='counterParty'>CounterParty</TableHeaderColumn>
          <TableHeaderColumn dataField='counterParty'>Location</TableHeaderColumn>
        </BootstrapTable>
        </Panel>
      </div>
    );
  }
}

export default TradeGrid;


import {connect} from "react-redux";

import TradeScreen from "../components/TradeScreen";
import * as actions from "../state/actions";

const mapStateToProps = (state) => {
    console.log(state);
    return {
         commodities: state.commodity.commodities,
         locations: state.location.locations,
         counterparties: state.counterParty.counterparties,
         trades: state.trade.trades
    }
}

const mapDispatchToProps = (dispatch) => {
    return {

        fetchCommodity: function(){
            let actionFn = actions.fetchCommodities()
            dispatch(actionFn);
        },

        fetchCounterParty: function(){
            let actionFn = actions.fetchCounterParties();
            dispatch(actionFn);
        },
        fetchLocation: function(){
            let actionFn = actions.fetchLocations();
            dispatch(actionFn);
        },
        searchTrade: function(props){
            let actionFn = actions.searchTrades(props);
            dispatch(actionFn);
        },
        addTrade:function(trade){
            let actionFn = actions.addTrade(trade);
            dispatch(actionFn);
        },
        updateTrade:function(trade){
            let actionFn = actions.updateTrade(trade);
            dispatch(actionFn);
        },
        deleteTrade:function(tradeId){
            let actionFn = actions.deleteTrade(tradeId);
            dispatch(actionFn);
        },
    }
}

export default connect(mapStateToProps, 
                    mapDispatchToProps) (TradeScreen);
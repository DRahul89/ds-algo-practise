import * as ActionTypes from "../ActionTypes";

const INITIAL_STATE = {
    trades: []
}

export default function tradeReducer(state=INITIAL_STATE,action){

    switch(action.type){
        case ActionTypes.INIT_TRADES:
        return Object.assign({},state,{trades:action.payload.trades});
        default:
        return state;
    }
}
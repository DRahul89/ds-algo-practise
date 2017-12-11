import * as ActionTypes from "../ActionTypes";

const INITIAL_STATE = {
    commodities: []
}

export default function commodityReducer(state=INITIAL_STATE,action){

    switch(action.type){
        case ActionTypes.INIT_COMMODITIES:
        return Object.assign({},state,{commodities:action.payload.commodities});
        default:
        return state;
    }
}
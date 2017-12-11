import * as ActionTypes from "../ActionTypes";

const INITIAL_STATE = {
    counterparties: []
}

export default function counterPartyReducer(state=INITIAL_STATE,action){

    switch(action.type){
        case ActionTypes.INIT_COUNTERPARTIES:
        return Object.assign({},state,{counterparties:action.payload.counterparties});
        default:
        return state;
    }
}
import * as ActionTypes from "../ActionTypes";

const INITIAL_STATE = {
    locations: []
}

export default function locationReducer(state=INITIAL_STATE,action){

    switch(action.type){
        case ActionTypes.INIT_LOCATIONS:
        return Object.assign({},state,{locations:action.payload.locations});
        default:
        return state;
    }
}
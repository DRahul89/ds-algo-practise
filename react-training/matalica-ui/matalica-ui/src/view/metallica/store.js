import {createStore,
    combineReducers,
    applyMiddleware
} from "redux";
import commodityReducer from "./state/reducers/commoditiesReducer";
import counterPartyReducer from "./state/reducers/counterPartyReducer";
import locationReducer from "./state/reducers/locationReducer";
import thunkMiddleware from "redux-thunk";
import tradeReducer from "./state/reducers/tradeReducer";
import { reducer as notifReducer } from 'redux-notifications';
let rootReducer = combineReducers({
    commodity: commodityReducer,
    counterParty:counterPartyReducer,
    location:locationReducer,
    trade:tradeReducer,
    notifs: notifReducer
}

);


function loggerMiddleware(store){
    return function(next){
        return function(action){
            console.log("LOGGER",action);

            //if( typeof action == 'function'){
              //  call action() with dsipatch
           // }
            //next forward sction to reducer
            let result = next(action);
            return result;
        }
    }
}


const store =createStore(rootReducer,applyMiddleware(loggerMiddleware,thunkMiddleware));

export default store;
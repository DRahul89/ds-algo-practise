import {createStore,
    combineReducers,
    applyMiddleware
} from "redux";
import cartReducer from "./cart/state/reducers/cartReducer";
import productReducer from "./cart/state/reducers/productReducer";
import thunkMiddleware from "redux-thunk";

function counterReducer(state=10,action){
    console.log("reducer",state,action);

    switch(action.type){
        case 'INCREMENT' :
        return state + action.payload.value;
        case 'DECREMENT' :
        return state - action.payload.value;
        default :
        return state;
    }
}

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


let rootReducer = combineReducers({
    counter: counterReducer,
    cartItems:cartReducer,
    productState:productReducer
}

);
const store =createStore(rootReducer,applyMiddleware(loggerMiddleware,thunkMiddleware));

export default store;

//////Learn
store.subscribe(
    () =>{
        console.log("subs 1",store.getState());
    }
)

let unsubFn = store.subscribe(
    () =>{
        console.log("subs 1",store.getState());
    }
);
//it return unsubscribe
unsubFn();
let action ={
    type: 'INCREMENT',
    payload:{
        value:3
    }
}


function incrementAction(value){
    return {
        type: 'INCREMENT',
        payload:{
            value:value
        }
    }
}

function decrementAction(value){
    return {
        type: 'DECREMENT',
        payload:{
            value:value
        }
    }
}
//store.dispatch(action);
console.log("state" + store.getState());
store.dispatch(incrementAction(10));
console.log("state" + store.getState());

store.dispatch(decrementAction(10));
console.log("state" + store.getState());


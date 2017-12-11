import * as ActionTypes from "./ActionTypes";
import { reducer as notifReducer, actions as notifActions, Notifs } from 'redux-notifications';
const { notifSend } = notifActions;
export const initCommodities = (commodities) => {
    return {
     type: ActionTypes.INIT_COMMODITIES,
     payload: {
        commodities: commodities
     }
 }
}

export const initCouterparties = (counterparties) => {
    return {
     type: ActionTypes.INIT_COUNTERPARTIES,
     payload: {
        counterparties: counterparties
     }
 }
}

export const initLocations = (locations) => {
    return {
     type: ActionTypes.INIT_LOCATIONS,
     payload: {
        locations: locations
     }
 }
}

export const initTrades = (trades) => {
    return {
     type: ActionTypes.INIT_TRADES,
     payload: {
        trades: trades
     }
 }
}

export function fetchCommodities(){
    
        //return function as action
        return function(dispatch){
            console.log("middle ware calling");
            fetch("http://localhost:8765/refData/commodity").then(response => {
                console.log("RESPONSE",response);
                //return a promise json() parse response to json
                return response.json();
            }).then(commodities => {
                let action = initCommodities(commodities);
                dispatch(action);
            })
        }
    }


    export function fetchCounterParties(){
        
            //return function as action
            return function(dispatch){
                console.log("middle ware calling");
                fetch("http://localhost:8765/refData/counterParty").then(response => {
                    console.log("RESPONSE",response);
                    //return a promise json() parse response to json
                    return response.json();
                }).then(counterparties => {
                    let action = initCouterparties(counterparties);
                    dispatch(action);
                })
            }
        }

        export function fetchLocations(){
            
                //return function as action
                return function(dispatch){
                    console.log("middle ware calling");
                    fetch("http://localhost:8765/refData/location").then(response => {
                        console.log("RESPONSE",response);
                        //return a promise json() parse response to json
                        return response.json();
                    }).then(locations => {
                        let action = initLocations(locations);
                        dispatch(action);
                    })
                }
            }


export function searchTrades(opts){
                
                    //return function as action
    return function(dispatch){
        console.log("middle ware calling");
        fetch("http://localhost:8765/trade/search",
        {
        method: 'post',
        body: JSON.stringify(opts),
        headers: new Headers({'content-type': 'application/json'})
        }
        ).then(response => {
        console.log("RESPONSE",response);
        if(response.status == 500 ){
            dispatch(notifSend({
                message: 'Trade search failed because of internal server error',
                kind: 'info',
                dismissAfter: 2000
              }));
        }else{
            //return a promise json() parse response to json
         return response.json();
        }
        }).then(trades => {
            let action = initTrades(trades);
            dispatch(action);
        }).catch(function(erro) {
            dispatch(notifSend({
                message: 'Trade search failed because of internal server error',
                kind: 'info',
                dismissAfter: 2000
              }));
        })
        }
 }

 export function addTrade(trade){
                
                    //return function as action
    return function(dispatch){
        console.log("middle ware calling");
        fetch("http://localhost:8765/trade/save",
        {
        method: 'post',
        body: JSON.stringify(trade),
        headers: new Headers({'content-type': 'application/json'})
        }
        ).then(response => {
        console.log("RESPONSE",response);
        if(response.status == 500 ){
            dispatch(notifSend({
                message: 'Trade create failed',
                kind: 'info',
                dismissAfter: 2000
              }));
        }else{
        dispatch(notifSend({
            message: 'Trade created successfully',
            kind: 'success',
            dismissAfter: 2000
          }));
        }
         
        }).catch(function(erro) {
            dispatch(notifSend({
                message: 'Trade create failed',
                kind: 'info',
                dismissAfter: 2000
              }));
        })
        }
 }

 export function updateTrade(trade){
                
                    //return function as action
    return function(dispatch){
        console.log("middle ware calling");
        fetch("http://localhost:8765/trade/update",
        {
        method: 'put',
        body: JSON.stringify(trade),
        headers: new Headers({'content-type': 'application/json'})
        }
        ).then(response => {
        console.log("RESPONSE",response);
        dispatch(notifSend({
            message: 'Trade updated successfully',
            kind: 'success',
            dismissAfter: 2000
          }));
         
        }).catch(function(erro) {
            dispatch(notifSend({
                message: 'Trade update failed',
                kind: 'info',
                dismissAfter: 2000
              }));
        })
        }
 }

 export function deleteTrade(tradeId){
    return function(dispatch){
        console.log("middle ware calling");
        fetch(`http://localhost:8765/trade/delete/1/${tradeId}`,
        {
        method: 'delete'
        }
        ).then(response => {
        console.log("RESPONSE",response);
        dispatch(notifSend({
            message: 'Trade deleted successfully',
            kind: 'success',
            dismissAfter: 2000
          }));
         
        }).catch(function(erro) {
            dispatch(notifSend({
                message: 'Trade delete failed',
                kind: 'info',
                dismissAfter: 2000
              }));
        })
        }
 }
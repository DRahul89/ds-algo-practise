import React from "react";

import {BrowserRouter as Router,
        Route, 
        Switch
    } from "react-router-dom";

import {App} from "./App";

import Home from "./components/Home";
import About from "./components/About";
import NotFound from "./components/NotFound";
import Cart from "./cart/containers/Cart";
import Counter from "./components/Counter";
import withRedux from "./components/HoCRedux";
import ProductList from "./cart/containers/ProductList";

import CounterContainer from "./components/CounterContainer"

export default function Routes() {
    return (
        <Router>
            <App>
                <Switch>
                    <Route path="/" exact component={Home} />
                    <Route path="/about" component={About} />
                    <Route path="/cart" component={Cart} />
                    <Route path="/counter" component={CounterContainer} />
                    <Route path="/products" component={ProductList} />
                    <Route path="*" component={NotFound} />
                </Switch>
            </App>
        </Router>
    )
}
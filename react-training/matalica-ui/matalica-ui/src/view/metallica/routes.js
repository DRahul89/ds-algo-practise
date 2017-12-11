import React from "react";

import {BrowserRouter as Router,
        Route, 
        Switch
    } from "react-router-dom";

import App from "../../App";
import MetallicaApp from "./components/MetallicaApp.jsx"
export default function Routes() {
    return (
        <Router>
            <App>
                <Switch>
                    <Route path="/" exact component={MetallicaApp} />
                </Switch>
            </App>
        </Router>
    )
}
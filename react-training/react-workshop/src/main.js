//boot strap react app into real dom
import React from "react";

//diff algo
import {render} from "react-dom";

//import {App} from "./app/App"

//binding real and virtual dom

import Routes from "./app/Routes";
import store from "./app/store";
import {Provider} from "react-redux";

render(
    <Provider store={store}> 
        <Routes />
</Provider>
,document.getElementById("root"));
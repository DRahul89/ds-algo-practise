import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import registerServiceWorker from './registerServiceWorker';
import 'bootstrap/dist/css/bootstrap.css';
import 'bootstrap/dist/css/bootstrap-theme.css';
import store from "./view/metallica/store";
import {Provider} from "react-redux";
import Routes from "./view/metallica/routes";
import { Notifs } from 'redux-notifications';
import 'redux-notifications/lib/styles.css';


ReactDOM.render(
    <Provider store={store}> 
        <div>
        <Routes />
        <Notifs />
        </div>
</Provider>
,document.getElementById("root"));

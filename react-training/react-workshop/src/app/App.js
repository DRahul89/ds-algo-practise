import React from "react";
import Header from "./components/Header";
import Footer from "./components/Footer";
import Home from "./components/Home";
import About from "./components/About";
import Cart from "./cart/components/Cart";
import store from "./store";
//functional component
export class App extends React.Component{

    contactUS(){
        alert('parent');
    }

    contactUsWithParam(city){
        alert(city);
    }

    //create and return a virtual dom
    render(){
        return (
            <div>
                <Header title="Raect App" />
                <div>

                {this.props.children}
                </div>
                <Footer year={2017} address={{city: 'delhi'}}
                contactFunc = {this.contactUS}
                contactParamFunc={this.contactUsWithParam}
                />
            </div>
        );
    }
}
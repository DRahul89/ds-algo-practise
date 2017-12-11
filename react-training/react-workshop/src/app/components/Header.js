import React ,{Component} from "react"
import Proptypes from "prop-types";
import {NavLink} from "react-router-dom";

export default class Header extends Component {
    //ES.NEXT /stage-2 preset
    static proptypes={
        title: Proptypes.string
    }
    constructor(props){
        super(props);
        console.log(this.props);
    }

    render(){
        let description = 'React Workshop'
        return (
            <div>
                <h2>{this.props.title}</h2>
                <p>{description}</p>
                <div>
                    <NavLink  to= "/" className="button" exact activeClassName="success">
                    Home
                    </NavLink>
                    <NavLink  to= "/products" className="button" exact activeClassName="success">
                    Products
                    </NavLink>
                    <NavLink  to= "/cart" className="button" exact activeClassName="success">
                    Cart
                    </NavLink>
                    <NavLink  to= "/about" className="button" exact activeClassName="success">
                    About
                    </NavLink>
                    <NavLink  to= "/counter" className="button" exact activeClassName="success">
                    Counter
                    </NavLink>
                </div>
            </div>
        );
    }
}
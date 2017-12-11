
import React, {Component} from "react";
import PropTypes from "prop-types";
import {withRouter} from "react-router-dom"
import CartItem from "./CartItem";
class CartList extends Component {
    constructor(props) {
        super(props);
    }
    
    componentDidMount() {
        
    }
    
    shouldComponentUpdate(nextprops,nextState){
        console.log("cartlistshould update");
        console.log(nextprops.items.length);
        console.log(this.props.items.length);
        return nextprops.items !== this.props.items;
    }
    render() {
        console.log("cart list render");
        let {items, onRemove, onUpdate} = this.props;

        return (
            <div> 
            <h2>Cart List</h2>
            <button onClick={() => this.props.history.push("/")} >
                Home
            </button>
            <table>
             <tbody>
                <tr>
                    <th>Name</th>
                    <th>Qty</th>
                    <th>Price</th>
                    <th>Update</th>
                    <th>Remove</th>
                </tr>

                {
                    items.map( (item) => (
                    <CartItem key={item.id} item={item} onUpdate={this.props.onUpdate} onRemove={this.props.onRemove}>   </CartItem>   
                    ) )
                }

             </tbody>
            </table>



            </div>
        )
    }
} 


CartList.defaultProps = {
    
}

CartList.propTypes = {
    items: PropTypes.array.isRequired,
    onRemove: PropTypes.func.isRequired,
    onUpdate: PropTypes.func.isRequired
}

const cartWithRouterComponent = withRouter(CartList);

export default cartWithRouterComponent;
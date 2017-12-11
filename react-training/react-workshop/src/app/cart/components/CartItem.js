
import React, {Component} from "react";
import PropTypes from "prop-types";

export default class CartItem extends Component {
    constructor(props) {
        super(props);
        
        this.state = {
            qty: props.item.qty
        }

        console.log("CartItem cons");
    }

    componentWillMount() {
        console.log("CartItem will mount");
    }
    
    componentDidMount() {
        console.log("CartItem did mount");
        this.input.focus();//actual dom
        this.myspan.textContent = "from ref";
    }

    //e is an event obj
    handleValueChange(e) {
        //real input dom element
        let target = e.target;
        console.log(target.value);

        this.setState({
            qty: target.value
        })
    }
    
    render() {
        console.log("CartItem render");

        let {item} = this.props;

        return (
           <tr> 
               <td>{item.name} </td>
               <span ref={(elem) => this.myspan = elem}>
                </span>
               <td>
                    <input value={this.state.qty}  
                           onChange={ (e) => this.handleValueChange(e)}
                           ref ={(elem) => this.input = elem}
                    
                    />
                </td>

               <td>{item.price}
               
                   <p>Total: {item.price * item.qty} </p>
               </td>

               <td> 
                   <button onClick={ () => this.props.actions.updateItemInCart(item.id, parseInt(this.state.qty)) }>
                     Update
                    </button>
                </td>

                <td> 
                   <button onClick={ () => this.props.actions.removeItemFromCart(item.id) }>
                     Remove
                    </button>
                </td>
           </tr>
        )
    }

    componentWillUnmount() {
        console.log("CartItem will unmount");
    }
} 


CartItem.defaultProps = {
    
}

CartItem.propTypes = {
    item: PropTypes.shape ({
        id: PropTypes.number.isRequired,
        name: PropTypes.string.isRequired,
        qty: PropTypes.number.isRequired,
        price: PropTypes.number.isRequired
    }).isRequired,

    onRemove: PropTypes.func.isRequired,
    onUpdate: PropTypes.func.isRequired
}
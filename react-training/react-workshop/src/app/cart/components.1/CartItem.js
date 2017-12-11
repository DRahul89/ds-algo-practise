
import React, {Component} from "react";
import PropTypes from "prop-types";

export default class CartItem extends Component {
    constructor(props) {
        super(props);
        
        this.state = {
            qty:props.item.qty
        }
        console.log("constr for cart item")
    }
    
    componentDidMount() {
        console.log("component did mount for cart item")
    }
    componentWillMount() {
        console.log("component wil mount for cart item");
    }

    //e is an event
    nahdleValueChange(e){
        console.log(e.target.value);
        this.setState({
            qty:e.target.value
        })
    }
    
    render() {
        console.log("cart item render");
        let {item, onRemove, onUpdate} = this.props;

        return (
           <tr> 
               <td>{item.name} </td>
               <td>
                    <input value={this.state.qty} 
                           onChange={(e)=>{this.nahdleValueChange(e)}}
                    /> 
                </td>

               <td>{item.price}</td>

               <td> 
                   <button onClick={ () =>onUpdate(item.id,parseInt(this.state.qty))}>
                     Update
                    </button>
                </td>

                <td> 
                   <button onClick={ () => onRemove(item.id)}>
                     Remove
                    </button>
                </td>
           </tr>
        )
    }
    componentWillUnMount(){
        console.log("cart item will unmount");
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
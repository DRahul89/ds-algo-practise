
import React, {PureComponent} from "react";
import PropTypes from "prop-types";

export default class CartSummary extends PureComponent {
    constructor(props) {
        super(props);
    }
    
    componentDidMount() {
        
    }

    componentWillReceiveProps(nextProps){
        console.log("cart summary recieve props  next ",nextProps);
        console.log("cart summary current props ",this.props);
    }
    //called when parent render called
    //or during this.setState on same component 
    // shouldComponentUpdate(nextProps,nextState){
    //     console.log("cart summary should update");
    //     return nextProps.count != this.props.count||
    //            nextProps.amount != this.props.amount;
    // }
    
    render() {
        console.log("cart summary render");
        let {amount, count} = this.props;

        return (
            <div> 
            <h2>Cart Summary</h2>

            <p>Amount: {amount} </p>

            <p>Count: {count} </p>

            </div>
        )
    }
} 


CartSummary.defaultProps = {
    
}

CartSummary.propTypes = {
    amount: PropTypes.number.isRequired,
    count: PropTypes.number.isRequired
}
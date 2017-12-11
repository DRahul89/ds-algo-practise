import {connect} from "react-redux";
import Cart from "../components/Cart";
import * as actions from "../state/actions"

//called by container componnet on state change
//on subscribe for only this state change as pure component
function mapStateToProps (state) {
    return {
        items:state.cartItems
    }
}

function mapDispatchToProps(dispatch){
    return {
        addItemToCart: function (item){
            let action = actions.addItemToCart(item);
            dispatch(action);
        },

        emptyCart:function(){
            dispatch(actions.emptyCart());
        }
    }
}

let connectFn = connect(mapStateToProps,mapDispatchToProps);

let CartContainerComponent = connectFn(Cart);

export default CartContainerComponent;


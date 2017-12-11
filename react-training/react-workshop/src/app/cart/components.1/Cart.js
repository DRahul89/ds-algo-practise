
import React, {Component} from "react";
import PropTypes from "prop-types";

import CartList from "./CartList";
import CartSummary from "./CartSummary";

export default class Cart extends Component {
    constructor(props) {
        super(props);

        this.state = {
            items: [ {id: 1, name: 'p1', price: 100, qty: 1} ],
            amount: 0,
            count: 0,
            flag: true
        }

        this.removeItem = this.removeItem.bind(this);
        this.updateItem = this.updateItem.bind(this);
    }
    componentWillMount(){
        this.reCalculate(this.state.items);
    }

    addItem() {
        let id = 100 + Math.ceil(Math.random() * 100000);
        let item = {
            id: id,
            name: `Product ${id}`,
            price: Math.ceil(Math.random() * 1000),
            qty: 1
        }
        

        let newItems = [...this.state.items,item];
        this.setState({
            items:newItems
        })
    }

    reCalculate(items) {
        console.log("recalcuate called");

        let count = 0;
        let amount = 0;
        for (let item of items) {
            count += item.qty;
            amount += item.qty * item.price
        }
        this.setState(
            {
              count:count,
              amount:amount  
            }
        );
        
    }

    emptyCart() {
        this.setState(
           { items:[]}
        )
        this.reCalculate([]);

    }


    //dummy 
    refresh() {
this.setState(
    {
        flag:!this.state.flag
    }
)
    }

    removeItem(id){
        let newItems = this.state.items.filter(item => item.id != id);
        this.setState(
            {items: newItems}
        )
    }

    updateItem(id, qty) {
        let newitems = this.state.items.map( item => {
            if(item.id != id)
            return item;

            return Object.assign({},item,{qty:qty});
        });

        this.setState({items:newitems});
    }

    componentDidMount() {
        
    }
    
    render() {
        console.log("cart  render");
        return (
            <div> 
            <h2>Cart</h2>
            <button onClick={()=>this.addItem()}>
        Add Item
        </button>
        <button onClick={()=>this.emptyCart()}>
        Empty Cart
        </button>
        <button onClick={()=>this.refresh()} className={this.state.flag ?"success":""}
                                             onMouseEnter={()=>this.setState({flag:true})}
                                             onMouseLeave={()=>{this.setState({flag:false})}}
        >
        Refresh
        </button>
            <CartList items={this.state.items} 
                      onRemove={this.removeItem}
                      onUpdate={this.updateItem}
            />
            <CartSummary amount={this.state.amount}
                         count={this.state.count}
            />
            </div>
        )
    }

    componentWillUnmount(){
        console.log("cart will unmount");
    }
} 


Cart.defaultProps = {
    
}

Cart.propTypes = {
    
}
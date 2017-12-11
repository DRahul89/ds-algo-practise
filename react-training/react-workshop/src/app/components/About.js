
import React, {Component} from "react";
import PropTypes from "prop-types";

export default class About extends Component {
    constructor(props) {
        super(props);

        this.state = {
            likes:100,
            members: ['Member 1', 'Member 2'],
            show:true
        }
    }
   incr() {
       let lk=this.state.likes+1;
       //async method preferred
    this.setState(Object.assign({},{likes:lk}),()=>{
        console.log(this.state.likes);
    });
   
    //this.forceUpdate() bad
   }

   showHide(){
       
   }

   addMember(){
    this.setState({
        members:[...this.state.members,"memeber3"]
    })
   }
    render() {
        return (
            <div> 
            <h2>About</h2>
            <button onClick={()=>this.incr()}>
            +1
            </button>
            <h2>Likes {this.state.likes}</h2>

            {
                this.state.showHide &&
            <ul>
                {
                    this.state.members.map(
                        (member,index) => (
                            <li key={index}>{member}</li>
                        )
                    )
                }
            </ul>
            }
            </div>
        )
    }
} 


About.defaultProps = {
    
}

About.propTypes = {
    
}
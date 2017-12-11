
import React from "react";
import PropTypes from "prop-types";

export default function NotFound(props) { 
        return (
            <div> 
            <h2>Not Found - {props.match.url} </h2>
            
            <button onClick={() => props.history.push("/")} >
                Home
            </button>

            <button onClick={() => props.history.push("/cart")} >
                Cart
            </button>


            <button onClick={() => props.history.goBack()} >
                Back
            </button>


            <button onClick={() => props.history.goForward()} >
                Forward
            </button>


            </div>
        )
} 


NotFound.defaultProps = {
    
}

NotFound.propTypes = {
    
}
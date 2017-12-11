import React from "react"
import PropTypes from "prop-types"

export default function Footer(props) {

    let {year,company} = props;
    return(
        <div>
            <hr/>

Copyrights @{year} ,{company}  
<p>city :{props.address.city}</p> 
<button onClick={props.contactFunc}>contact</button>
<button onClick={()=>props.contactParamFunc(props.address.city)}>contactParam</button>
</div>
    )
}
//prop types is a keyword
Footer.propTypes = {
year : PropTypes.number.isRequired,

company : PropTypes.string,
contactFunc:PropTypes.func,
contactParamFunc:PropTypes.func
}

Footer.defaultProps = {
    company : 'Product App'
}
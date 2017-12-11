import Counter from "./Counter";
import withRedux from "./HoCRedux";

function mapReduxToReact(state) {
    console.log("here state" + state);
    return {
        count: state.counter
    }
}

function mapDispatchToReact(dispatch)  {
    return {
        onIncr: () => {
            
                                    let action = {
                                        type: 'INCREMENT',
                                        payload: {
                                            value: 1
                                        }
                                    }
            
                                    dispatch(action);
                            } 
    }
}

const CounterContainer = withRedux(Counter, mapReduxToReact, mapDispatchToReact);

export default CounterContainer;
import React, { Component } from 'react';

export default class AjaxBox extends Component {
    render() {
        let customer = ['Customer 01', 'Customer 02', 'Customer 03'];
        let supplier = ['Supplier 01', 'Supplier 02', 'Supplier 03', 'Supplier 04'];

        let data = (this.props.source == 'customer') ? customer : supplier;

        let style = {
            border: '2px',
            borderStyle: 'solid',
            borderColor: '#73AD21',
            padding: '10px'
        }

        return (
            <div style={ style }>
                <h3>AjaxBox V2</h3>
                <input type="text" className="form-control" />
                <p></p>
                <button className="btn btn-primary">List ({ this.props.source })</button>

                <hr/>

                <ul className="list-group">
                    { data.map(d => { return(<li key={ d } className="list-group-item">{ d }</li>) }) }
                </ul>
            </div>
        );
    }
}
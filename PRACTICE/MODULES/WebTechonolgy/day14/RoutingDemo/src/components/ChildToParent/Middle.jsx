import React, { useState } from 'react'
import "react-bootstrap"
import "bootstrap/dist/css/bootstrap.min.css"
import { Col, Row } from 'react-bootstrap'
import Inner from './Inner'
const Middle = () => {

    const [incomingData, setIncomingData] = useState("")

    const handleIncoming = (v) => {
        console.log("V" + v);   
        setIncomingData(v);
    }
  return (
    <div>
        <Row className='bg-danger container'>
            this is Middle
            <button type='text'>{incomingData || "unchanged"}</button>
              <Inner sendToParent={handleIncoming} />
            this is Middle
        </Row>
    </div>
  )
}

export default Middle
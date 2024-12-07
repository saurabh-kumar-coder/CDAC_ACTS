import React, { useState } from 'react'
import "react-bootstrap"
import "bootstrap/dist/css/bootstrap.min.css"
import { Col, Row } from 'react-bootstrap'
import Middle from './Middle'

const Outer = () => {
  
  return (
    <div>
        <Row className='bg-primary container'>
            this is outer
              <Middle />
            this is outer
        </Row>
    </div>
  )
}

export default Outer
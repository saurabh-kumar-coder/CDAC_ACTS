import React, { useState } from "react";
import "react-bootstrap";
import "bootstrap/dist/css/bootstrap.min.css";
import { Col, Row } from "react-bootstrap";
import { createContext } from "react";

const Inner = ({sendToParent}) => {
  const [inputValue, setInputValue] = useState("");

  const handleInputValue = (e) => {
    const newValue = e.target.value;
    setInputValue(newValue);
    sendToParent(newValue)
  };

  return (
    <div>
      <Row className="bg-success">
        this is Inner
        <div>
          <button type="button">{inputValue || "changeme"}</button>
          <input type="text" name="fname" onChange={handleInputValue} />
        </div>
        this is Inner
      </Row>
    </div>
  );
};

export default Inner;

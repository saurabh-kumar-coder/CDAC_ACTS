import React from 'react'
import {BrowserRouter, Route, Routes } from "react-router-dom"
import AboutUs from './AboutUs'
import Career from './Career'
import MyLayout from './MyLayout'
import Home from './Home'
const MyRoutes = () => {
  return (
    <div>
        <BrowserRouter>
            <Routes>
                <Route path='/' element={<MyLayout />}>
                    {/* <Route path='/' element={<Home />} /> */}
                    <Route index element={<Home />} />
                    <Route path='/aboutus' element={<AboutUs />} />
                    <Route path='/career' element={<Career />} />
                </Route>
            </Routes>
        </BrowserRouter>
    </div>
  )
}

export default MyRoutes
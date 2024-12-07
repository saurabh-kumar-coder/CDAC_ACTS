import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import App from './App.jsx'
import MyRoutes from './components/routing/MyRoutes.jsx'

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <MyRoutes />
    <App />
  </StrictMode>,
)

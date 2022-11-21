import { BrowserRouter as Router, Routes, Route } from "react-router-dom";

import StartTemplate from "./components/templates/Inicio";
import PreRegister from "./components/templates/PreRegistro";
import HomeTemplate from "./components/templates/Home";

<script src="https://unpkg.com/react@18/umd/react.production.min.js" crossorigin></script>
<script src="https://unpkg.com/react-dom@18/umd/react-dom.production.min.js" crossorigin></script>

const App = () => {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<StartTemplate />} />
        <Route path="/pre-registro" element={<PreRegister />} />
        <Route path="/registro" element={""} />
        <Route path="/cadastro" />
        <Route path="/home" element={<HomeTemplate />} />
      </Routes>
    </Router>
  );
};

export default App;

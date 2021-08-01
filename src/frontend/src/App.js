import './Style.css';
import Body from './components/Body';
import ShowChart from './components/ShowChart';
import Footer from './components/Footer';

import Login from './components/Login';
import Register from './components/Register';
import {BrowserRouter as Router,Route,Link} from "react-router-dom";
import Listing from './components/Listing';


function App() {
  return (
    <div className="App">

<div className="">

 
      
    <Router>
      <switch>      
      <Route exact path="/" component={ShowChart} />
      <Route exact path="/list" component={Listing} />

      <Route exact path="/login" component={Login} />
      <Route exact path="/register" component={Register} />
      </switch>
  </Router>
</div>  
    </div>
  );
}

export default App;

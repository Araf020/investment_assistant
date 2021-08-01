import React from 'react';
import '../Style.css';
import Body from './Body';
import Footer from './Footer';
import Top from './Top';
import logo from './photo/logo.jpg';
import { Dropdown,InputGroup,FormControl } from 'react-bootstrap';

function ShowChart() {
    return (

      <div>
      <Top/>
	    {/*<div className="header navbar-light  ">*/}
        {/*<nav className="navbar navbar-expand-lg navbar-light container ">*/}
        {/*  <div className="container-fluid col-md">*/}
        {/*  */}

        {/*    <img className="logo" src={logo} alt="Logo" href="/"LOGO />*/}
        {/*  </div>*/}
        {/*  <div className=" col-right" class="pull-right" id="navbarSupportedContent">*/}
        {/*      <ul className="navbar-nav me-auto mb-2 mb-lg-0">*/}
        {/*      */}
        {/*        <li className="nav-item">*/}
        {/*          <a className="nav-link active text-light" aria-current="page" href="#">Stock index</a>*/}
        {/*        </li> */}
        {/*        <li className="nav-item">*/}
        {/*          <a className="nav-link active text-light" aria-current="page" href="#">Financial statements</a>*/}
        {/*        </li>  */}
        {/*        <li className="nav-item">*/}
        {/*          <a className="nav-link active text-light" aria-current="page" href="#">Companies</a>*/}
        {/*        </li>*/}
        {/*        <li className="nav-item">*/}
        {/*          <a className="nav-link active text-light" aria-current="page" href="#">Analyze</a>*/}
        {/*        </li>*/}
        {/*        <li className="nav-item">*/}
        {/*          <a className="nav-link active text-light" aria-current="page" href="#">Research</a>*/}
        {/*        </li>*/}
        {/*        <li className="nav-item">*/}
        {/*          <a className="nav-link active text-light" aria-current="page" href="/Login">Sign In</a>*/}
        {/*        </li>*/}
        {/*        <li className="nav-item">*/}
        {/*          <a className="nav-link active text-light" aria-current="page" href="/Register">Sign up</a>*/}
        {/*        </li>*/}
        {/*      </ul>*/}
        {/*    </div>*/}
        {/*</nav>*/}

        {/*</div>*/}
        <div className=" submenu bg-light ">
        <nav className="navbar navbar-expand-lg navbar-light container ">
            <div className="container-fluid col-md-2">
                <Dropdown>
                    <Dropdown.Toggle variant="light" id="dropdown-basic">
                       Dropdown Button
                    </Dropdown.Toggle>

                    <Dropdown.Menu>
                      <Dropdown.Item href="#/action-1">Action</Dropdown.Item>
                      <Dropdown.Item href="#/action-2">Another action</Dropdown.Item>
                      <Dropdown.Item href="#/action-3">Something else</Dropdown.Item>
                    </Dropdown.Menu>
                </Dropdown>
           </div>
           <div className="container-fluid col-md-2">
                <Dropdown>
                    <Dropdown.Toggle variant="light" id="dropdown-basic">
                       Dropdown Button
                    </Dropdown.Toggle>

                    <Dropdown.Menu>
                      <Dropdown.Item href="#/action-1">Action</Dropdown.Item>
                      <Dropdown.Item href="#/action-2">Another action</Dropdown.Item>
                      <Dropdown.Item href="#/action-3">Something else</Dropdown.Item>
                    </Dropdown.Menu>
                </Dropdown>
           </div>
          <div className="container-fluid col-md-8 pt-3">
              <InputGroup className="mb-3">
                <InputGroup.Text id="basic-addon1"><i className="fa fa-search "></i></InputGroup.Text>
                  <FormControl className=""
                    placeholder="Search"
                    aria-label="search"
                    aria-describedby="basic-addon1"
                />
              </InputGroup>
          </div>
       </nav>
         
        </div>
        <Body/>
        <Footer/>
      </div>
     
    );
}

export default ShowChart;


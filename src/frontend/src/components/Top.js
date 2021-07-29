import React from 'react';
import '../Style.css';
import Body from './Body';
import Footer from './Footer';
import logo from './photo/logo.jpg';
import { Dropdown,InputGroup,FormControl } from 'react-bootstrap';

function Top() {
    return (
        <div>

            <div className="header navbar-light  ">
                <nav className="navbar navbar-expand-lg navbar-light container ">
                    <div className="container-fluid col-md">


                        <img className="logo" src={logo} alt="Logo" href="/"LOGO />
                    </div>
                    <div className=" col-right" class="pull-right" id="navbarSupportedContent">
                        <ul className="navbar-nav me-auto mb-2 mb-lg-0">

                            <li className="nav-item">
                                <a className="nav-link active text-light" aria-current="page" href="#">Stock index</a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link active text-light" aria-current="page" href="#">Financial statements</a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link active text-light" aria-current="page" href="#">Companies</a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link active text-light" aria-current="page" href="#">Analyze</a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link active text-light" aria-current="page" href="#">Research</a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link active text-light" aria-current="page" href="/Login">Sign In</a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link active text-light" aria-current="page" href="/Register">Sign up</a>
                            </li>
                        </ul>
                    </div>
                </nav>

            </div>



        </div>

    );
}

export default Top;


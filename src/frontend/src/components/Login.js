import React from 'react';
import '../Style.css';
import { Button ,Form} from 'react-bootstrap';

function Login() {
    return (
        <div className=" signin-up">
		<div className="container">
			<div className=" container">
                <Form className="form ">
                <div className="sign">
                <h4 className="textt">Sign In</h4>
                    <Form.Group className="" controlId="formBasicEmail">
                       <Form.Label>Email address</Form.Label>
                           <Form.Control type="email" placeholder="Enter email" />
                          
                    </Form.Group>

                    <Form.Group className="" controlId="formBasicPassword">
                        <Form.Label>Password</Form.Label>
                        <Form.Control type="password" placeholder="Password" />
                    </Form.Group>
                    <Form.Group className="mt-4" controlId="formBasicCheckbox">
                        <Form.Check type="checkbox" label="Check me out" />
                    </Form.Group>
                   
                    <Button className="mt-2 bg-dark "  type="submit">
                        Submit
                    </Button>
                    </div>
                </Form>
               </div>
           </div>
       </div>

 );
}

export default Login;
import React from 'react';
import '../Style.css';
import { Button ,Form} from 'react-bootstrap';

function Register() {
    return (
        <div className="signin-up">
		<div className="container">
			<div className=" container">
                <Form className="form ">
                <div className="sign">
                <h4 className="textt">Sign Up</h4>
                    <Form.Group className="" controlId="formBasicEmail">
                       <Form.Label>Username </Form.Label>
                           <Form.Control type="username" placeholder="Enter Username" />
                          
                    </Form.Group>
                    <Form.Group className="" controlId="formBasicEmail">
                       <Form.Label>Email </Form.Label>
                           <Form.Control type="email" placeholder="Enter email" />
                          
                    </Form.Group>

                    <Form.Group className="" controlId="formBasicPassword">
                        <Form.Label>Password</Form.Label>
                        <Form.Control type="password" placeholder="Password" />
                    </Form.Group>
                   
                    <Button className="mt-4 bg-dark"  type="submit">
                        Submit
                    </Button>
                    </div>
                </Form>
               </div>
           </div>
       </div>

 );
}

export default Register;
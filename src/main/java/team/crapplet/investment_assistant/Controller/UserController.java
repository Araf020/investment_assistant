package team.crapplet.investment_assistant.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import team.crapplet.investment_assistant.Model.User;
import team.crapplet.investment_assistant.Model.Values;
import team.crapplet.investment_assistant.Repository.UserRepository;


public class UserController {
    private UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository ;
    }

    @GetMapping("/login")
    public Iterable<User> getAllValues(){
        return userRepository.findAll();
    }


}

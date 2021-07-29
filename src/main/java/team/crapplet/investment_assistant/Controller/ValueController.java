package team.crapplet.investment_assistant.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import team.crapplet.investment_assistant.Model.Values;
import team.crapplet.investment_assistant.Repository.ValueRepository;

@RestController
@CrossOrigin
public class ValueController {

    private ValueRepository valueRepository;

    public ValueController(ValueRepository valueRepository){
        this.valueRepository = valueRepository;
    }

    @GetMapping("/values")
    public Iterable<Values> getAllValues(){
        return valueRepository.findAll();
    }

}

package team.crapplet.investment_assistant.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import team.crapplet.investment_assistant.Model.PerShare;
import team.crapplet.investment_assistant.Repository.PerShareRepository;

import java.util.ArrayList;
import java.util.List;


@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api")
public class PershareController {

    @Autowired
    private PerShareRepository pershareRepository;

    PershareController(PerShareRepository pershareRepository){
        this.pershareRepository = pershareRepository;
    }

    @GetMapping("/pershares/{codeName}")
    public List<PerShare> getRatioByCodeName(@PathVariable String codeName){

        List<PerShare> pershares= pershareRepository.findAll();
        List<PerShare> result = new ArrayList<>();

        for (PerShare pershare:pershares)
        {
            if (pershare.getCodeName().equalsIgnoreCase(codeName))
                result.add(pershare);
        }

        return result;
    }
}

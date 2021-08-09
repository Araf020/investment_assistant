package team.crapplet.investment_assistant.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import team.crapplet.investment_assistant.Model.PerShare;
import team.crapplet.investment_assistant.Repository.Name_EPS;
import team.crapplet.investment_assistant.Repository.PerShareRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
    public List<PerShare> getEPSbyCodeName(@PathVariable String codeName){

        List<PerShare> pershares= pershareRepository.findAll();
        List<PerShare> result = new ArrayList<>();


        for (PerShare pershare:pershares)
        {

            if (pershare.getCodeName().equalsIgnoreCase(codeName))
                result.add(pershare);
        }

        return result;
    }
    @GetMapping("/pershares/top_company_by_eps")
    public List<Name_EPS> getTopCompanyByEPS(){
        return pershareRepository.getEPSandName();

    }
}

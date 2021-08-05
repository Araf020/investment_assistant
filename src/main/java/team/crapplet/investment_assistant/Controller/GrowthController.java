package team.crapplet.investment_assistant.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team.crapplet.investment_assistant.Model.Growths;
import team.crapplet.investment_assistant.Model.Ratios;
import team.crapplet.investment_assistant.Repository.GrowthRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api")
public class GrowthController {

    @Autowired
    private GrowthRepository growthRepository;

    GrowthController(GrowthRepository growthRepository){
        this.growthRepository = growthRepository;
    }

    @GetMapping("/growths/{codeName}")
    public List<Growths> getRatioByCodeName(@PathVariable String codeName){

        List<Growths> growths= growthRepository.findAll();
        List<Growths> result = new ArrayList<>();

        for (Growths growth:growths)
        {
            if (growth.getCodeName().equalsIgnoreCase(codeName))
                result.add(growth);
        }
        Map<String,ArrayList<Double>> name_ratioMap = new HashMap<>();

        return result;
    }
}

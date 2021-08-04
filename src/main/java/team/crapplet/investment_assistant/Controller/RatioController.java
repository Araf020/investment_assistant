package team.crapplet.investment_assistant.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team.crapplet.investment_assistant.Model.Ratios;
import team.crapplet.investment_assistant.Repository.RatioRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/test/f")

public class RatioController {

    @Autowired
    private RatioRepository ratioRepository;

    public RatioController(RatioRepository ratioRepository){
        this.ratioRepository = ratioRepository;
    }

    @GetMapping("/ratios")
    public String getRatios() {
        System.out.println("i m in getRatios..");
        return ratioRepository.findAll().get(2).getCodeName();
    }
    @GetMapping("/ratios/{codeName}")
    public List<Ratios> getRatioByCodeName(@PathVariable String codeName){

       List<Ratios> ratios= ratioRepository.findAll();
       List<Ratios> result = new ArrayList<>();

       for (Ratios ratio:ratios
             ) {
            if (ratio.getCodeName().equalsIgnoreCase(codeName))
                result.add(ratio);
        }
        return result;
    }

    @GetMapping("/all_ratios")
    public List<Ratios> getAllRatios(){
        return ratioRepository.findAll();
    }

}

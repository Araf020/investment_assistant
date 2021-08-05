package team.crapplet.investment_assistant.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team.crapplet.investment_assistant.Model.Sector;
import team.crapplet.investment_assistant.Repository.GrowthRepository;
import team.crapplet.investment_assistant.Repository.SectorRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api")
public class SectorController {





        @Autowired
        private SectorRepository sectorRepository;

        SectorController(SectorRepository sectorRepository){
            this.sectorRepository = sectorRepository;
        }

        @GetMapping("/sectors/{codeName}")
        public List<Sector> getRatioByCodeName(@PathVariable String codeName){

            List<Sector> sectors= sectorRepository.findAll();

            List<Sector> result = new ArrayList<>();

            for (Sector sector:sectors)
            {
                if (sector.getCodeName().equalsIgnoreCase(codeName))
                    result.add(sector);
            }

            return result;
        }

        @GetMapping("/all_sectors")
        List<Sector> getSectors(){
            return sectorRepository.findAll();
        }


}

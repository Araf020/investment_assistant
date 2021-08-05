package team.crapplet.investment_assistant.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team.crapplet.investment_assistant.Model.Ratios;
import team.crapplet.investment_assistant.Repository.RatioRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/test/f")

public class RatioController {

    @Autowired
    private RatioRepository ratioRepository;
    private String[] names = {"priceBookValueRatio","priceToBookRatio","priceToSalesRatio","priceToFreeCashFlowsRatio","priceToOperatingCashFlowsRatio","priceCashFlowRatio","priceSalesRatio","currentRatio","priceEarningsToGrowthRatio","quickRatio","priceEarningsRatio","cashRatio","debtRatio","debtEquityRatio","cashFlowToDebtRatio","payoutRatio","operatingCashFlowSalesRatio","freeCashFlowOperatingCashFlowRatio","cashFlowCoverageRatios","shortTermCoverageRatios","capitalExpenditureCoverageRatios","dividendpaidAndCapexCoverageRatios","dividendPayoutRatio","PE_ratio","Price_to_Sales_Ratio","POCF_ratio","PFCF_ratio","PB_ratio","PTB_ratio","Payout_Ratio"};

    private Map<String,ArrayList<Double>> getName_Data(List<Ratios> ratios){

        Map<String,ArrayList<Double>> map = new HashMap<>();
        ArrayList<Double> list = new ArrayList<>();
        for(String name:names) {
            for(Ratios ratio:ratios) {


            }
        }
        return map;
    }

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
        Map<String,ArrayList<Double>> name_ratioMap = new HashMap<>();

        return result;
    }

    @GetMapping("/all_ratios")
    public List<Ratios> getAllRatios(){
        return ratioRepository.findAll();
    }

}

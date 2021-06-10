package team.crapplet.investment_assistant.ProcessData.processWithBatch;

import org.slf4j.Logger;

import org.springframework.batch.item.ItemProcessor;
import org.slf4j.LoggerFactory;
import team.crapplet.investment_assistant.Model.Ratios;
import team.crapplet.investment_assistant.Model.Values;

public class IntermediateRatioProcessor implements ItemProcessor<InputDataSets, Values> {

    private static final Logger log = LoggerFactory.getLogger(IntermediateRatioProcessor.class);


    @Override
    public Values process(InputDataSets inputDataSets) throws Exception {

        Values values = new Values();

        /**
         * parsing data from input to Values
         *
         *
         * */


        values.setCodeName(inputDataSets.getName());
        System.out.println("Name: "+inputDataSets.get_Sector());

//        values.setEnterprise_Value_over_EBITDA(312321.30921);
//        values.setEnterprise_Value(Double.parseDouble(inputDataSets.getEnterprise_Value()));
//        values.setEnterpriseValueMultiple(Double.parseDouble(inputDataSets.getEnterpriseValueMultiple()));
//        values.setPriceFairValue(Double.parseDouble(inputDataSets.getPriceFairValue()));
//        values.setNet_Current_Asset_Value(Double.parseDouble(inputDataSets.getNet_Current_Asset_Value()));
//        values.setTangible_Asset_Value(Double.parseDouble(inputDataSets.getTangible_Asset_Value()));
//        values.setNet_Current_Asset_Value(Double.parseDouble(inputDataSets.getNet_Current_Asset_Value()));
//        values.setEnterprise_Value_over_EBITDA(Double.parseDouble(inputDataSets.getEnterprise_Value_over_earnings_ibtDA()));

        values.setYear(2018);

        return values;
    }
}





//package team.crapplet.investment_assistant.ProcessData.processWithBatch;
//
//import org.slf4j.Logger;
//
//import org.springframework.batch.item.ItemProcessor;
//import org.slf4j.LoggerFactory;
//import team.crapplet.investment_assistant.Model.PerShare;
//import team.crapplet.investment_assistant.Model.Ratios;
//import team.crapplet.investment_assistant.Model.Values;
//
//public class IntermediateRatioProcessor implements ItemProcessor<InputDataSets, Values> {
//
//    private static final Logger log = LoggerFactory.getLogger(IntermediateRatioProcessor.class);
//
//    private  double parseDouble(String s, double otherwise) {
//        return s.equals("")  ? otherwise : Double.parseDouble(s);
//    }
//
//    @Override
//    public Values process(InputDataSets inputDataSets) throws Exception {
//
//        Values values = new Values();
//
//        values.setcomapny_code((inputDataSets.getName()));
//
//        values.setEnterprise_Value_over_EBITDA(parseDouble(inputDataSets.get_Enterprise_Value_over_EBITDA(),0.0));
//        values.setEnterprise_Value(parseDouble(inputDataSets.get_Enterprise_Value(),0.0));
//        values.setEnterpriseValueMultiple(parseDouble(inputDataSets.get_enterpriseValueMultiple(),0.0));
//        values.setTangible_Asset_Value(parseDouble(inputDataSets.get_Tangible_Asset_Value(),0.0));
//        values.setPriceFairValue(parseDouble(inputDataSets.get_priceFairValue(),0.0));
//        values.setNet_Current_Asset_Value(parseDouble(inputDataSets.get_Net_Current_Asset_Value(),0.0));
//        values.setYear(2017);
//
////        PerShare perShare = new PerShare();
////
////        /**
////         * parsing data from input to Pershare
////         *
////         *
////         * */
////        perShare.setcomapny_code(inputDataSets.getName());
//        log.info("Name: "+inputDataSets.get_Sector());
////
////
////        perShare.setCash_per_Share(parseDouble(inputDataSets.get_cashPerShare(),0.0));
////        perShare.setBook_Value_per_Share(parseDouble(inputDataSets.get_Book_Value_per_Share(),0.0));
////        perShare.setBook_Value_per_Share_Growth(parseDouble(inputDataSets.get_Book_Value_per_Share_Growth(),0.0));
////        perShare.setCapex_per_Share(parseDouble(inputDataSets.get_Capex_per_Share(),0.0));
////        perShare.setEarnings_Per_Share(parseDouble(inputDataSets.getEPS(),0.0));
////        perShare.setDiluted_Earnings_Per_Share(parseDouble(inputDataSets.getEPS_Diluted(),0.0));
////        perShare.setDividend_per_Share(parseDouble(inputDataSets.getDividend_per_Share(),0.0));
////        perShare.setDividends_per_Share_Growth(parseDouble(inputDataSets.get_Dividends_per_Share_Growth(),0.0));
////
////        perShare.setFree_Cash_Flow_per_Share(parseDouble(inputDataSets.get_Free_Cash_Flow_per_Share(),0.0));
////        perShare.setInterest_Debt_per_Share(parseDouble(inputDataSets.get_Interest_Debt_per_Share(),0.0));
////        perShare.setOperating_Cash_Flow_per_Share(parseDouble(inputDataSets.get_Operating_Cash_Flow_per_Share(),0.0));
////        perShare.setShareholders_Equity_per_Share(parseDouble(inputDataSets.get_Shareholders_Equity_per_Share(),0.0));
////        perShare.setTangible_Book_Value_per_Share(parseDouble(inputDataSets.get_Tangible_Book_Value_per_Share(),0.0));
////
////
////        perShare.setFiveY_Dividend_per_Share_Growth_per_Share(parseDouble(inputDataSets.get_5Y_Dividend_per_Share_Growth_per_Share(),0.0));
////        perShare.setFiveY_Net_Income_Growth_per_Share(parseDouble(inputDataSets.get_5Y_Net_Income_Growth_per_Share(),0.0));
////        perShare.setFiveY_Revenue_Growth_per_Share(parseDouble(inputDataSets.get_5Y_Revenue_Growth_per_Share(),0.0));
////        perShare.setFiveY_Operating_CF_Growth_per_Share(parseDouble(inputDataSets.get_5Y_Operating_CF_Growth_per_Share(),0.0));
////        perShare.setFiveY_Shareholders_Equity_Growth_per_Share(parseDouble(inputDataSets.get_5Y_Shareholders_Equity_Growth_per_Share(),0.0));
////
////        perShare.setTenY_Dividend_per_Share_Growth_per_Share(parseDouble(inputDataSets.get_10Y_Dividend_per_Share_Growth_per_Share(),0.0));
////        perShare.setTenY_Net_Income_Growth_per_Share(parseDouble(inputDataSets.get_10Y_Net_Income_Growth_per_Share(),0.0));
////        perShare.setTenY_Revenue_Growth_per_Share(parseDouble(inputDataSets.get_10Y_Revenue_Growth_per_Share(),0.0));
////        perShare.setTenY_Operating_CF_Growth_per_Share(parseDouble(inputDataSets.get_10Y_Operating_CF_Growth_per_Share(),0.0));
////        perShare.setTenY_Shareholders_Equity_Growth_per_Share(parseDouble(inputDataSets.get_10Y_Shareholders_Equity_Growth_per_Share(),0.0));
////
////        perShare.setThreeY_Dividend_per_Share_Growth_per_Share(parseDouble(inputDataSets.get_3Y_Dividend_per_Share_Growth_per_Share(),0.0));
////        perShare.setThreeY_Net_Income_Growth_per_Share(parseDouble(inputDataSets.get_3Y_Net_Income_Growth_per_Share(),0.0));
////        perShare.setThreeY_Revenue_Growth_per_Share(parseDouble(inputDataSets.get_3Y_Revenue_Growth_per_Share(),0.0));
////        perShare.setThreeY_Operating_CF_Growth_per_Share(parseDouble(inputDataSets.get_3Y_Operating_CF_Growth_per_Share(),0.0));
////        perShare.setThreeY_Shareholders_Equity_Growth_per_Share(parseDouble(inputDataSets.get_3Y_Shareholders_Equity_Growth_per_Share(),0.0));
////
////        perShare.setYear(2017);
////
////        return perShare;
//        return values;
//    }
//}
//
//
//
//

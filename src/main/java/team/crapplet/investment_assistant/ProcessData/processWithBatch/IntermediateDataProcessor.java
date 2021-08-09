//package team.crapplet.investment_assistant.ProcessData.processWithBatch;
//
//import org.slf4j.Logger;
//
//import org.springframework.batch.item.ItemProcessor;
//import org.slf4j.LoggerFactory;
//import team.crapplet.investment_assistant.Model.*;
//
//public class IntermediateDataProcessor implements ItemProcessor<InputDataSets, PerShare> { // edit here
//
//    private static final Logger log = LoggerFactory.getLogger(IntermediateDataProcessor.class);
//
//    private  double parseDouble(String s, double otherwise) {
////        log.info(s + ":" +otherwise);
//        return s.equals("")  ? otherwise : Double.parseDouble(s);
//    }
//
//    @Override
//    public PerShare process(InputDataSets inputDataSets) throws Exception {
//
////        Sector sector = new Sector();
////        sector.setCodeName(inputDataSets.getName());
////        sector.setSectorName(inputDataSets.get_Sector());
//
////        Ratios ratios = new Ratios();
////        Growths growths = new Growths();
////        Averages averages = new Averages();
//
//        //        Earnings earnings = new Earnings();
//
//        /*
//
//        /*
//        THis part is for ratios
//         */
////        ratios.setCodeName(inputDataSets.getName());
////        ratios.setYear(2014);
////
////        ratios.setPriceBookValueRatio(parseDouble(inputDataSets.get_priceBookValueRatio(),0.0));
////        ratios.setPriceToBookRatio(parseDouble(inputDataSets.get_priceToBookRatio(),0.0));
////        ratios.setPriceToSalesRatio(parseDouble(inputDataSets.get_Price_to_Sales_Ratio(),0.0));
////        ratios.setPriceToFreeCashFlowsRatio(parseDouble(inputDataSets.get_priceToFreeCashFlowsRatio(),0.0));
////        ratios.setPriceToOperatingCashFlowsRatio(parseDouble(inputDataSets.get_priceToOperatingCashFlowsRatio(),0.0));
////        ratios.setPriceCashFlowRatio(parseDouble(inputDataSets.get_priceCashFlowRatio(),0.0));
////
////        ratios.setPriceSalesRatio(parseDouble(inputDataSets.get_priceSalesRatio(),0.0));
////        ratios.setCurrentRatio(parseDouble(inputDataSets.get_Current_ratio(),0.0));
////        ratios.setQuickRatio(parseDouble(inputDataSets.get_quickRatio(),0.0));
////        ratios.setPriceEarningsRatio(parseDouble(inputDataSets.get_priceEarningsRatio(),0.0));
////        ratios.setCashRatio(parseDouble(inputDataSets.get_cashRatio(),0.0));
////        ratios.setDebtRatio(parseDouble(inputDataSets.get_debtRatio(),0.0));
////        ratios.setDebtEquityRatio(parseDouble(inputDataSets.get_debtEquityRatio(),0.0));
////        ratios.setCashFlowToDebtRatio(parseDouble(inputDataSets.get_cashFlowToDebtRatio(),0.0));
////        ratios.setPayoutRatio(parseDouble(inputDataSets.get_Payout_Ratio(),0.0));
////        ratios.setOperatingCashFlowSalesRatio(parseDouble(inputDataSets.get_operatingCashFlowSalesRatio(),0.0));
////        ratios.setPriceEarningsToGrowthRatio(parseDouble(inputDataSets.get_priceEarningsToGrowthRatio(),0.0));
////        ratios.setFreeCashFlowOperatingCashFlowRatio(parseDouble(inputDataSets.get_priceToFreeCashFlowsRatio(),0.0));
////        ratios.setCashFlowCoverageRatios(parseDouble(inputDataSets.get_cashFlowCoverageRatios(),0.0));
////        ratios.setShortTermCoverageRatios(parseDouble(inputDataSets.get_shortTermCoverageRatios(),0.0));
////        ratios.setCapitalExpenditureCoverageRatios(parseDouble(inputDataSets.get_capitalExpenditureCoverageRatios(),0.0));
////        ratios.setDividendpaidAndCapexCoverageRatios(parseDouble(inputDataSets.get_dividendpaidAndCapexCoverageRatios(),0.0));
////
////        ratios.setDividendPayoutRatio(parseDouble(inputDataSets.get_dividendPayoutRatio(),0.0));
////        ratios.setPE_ratio(parseDouble(inputDataSets.get_PE_ratio(),0.0));
////        ratios.setPrice_to_Sales_Ratio(parseDouble(inputDataSets.get_priceToSalesRatio(),0.0));
////        ratios.setPFCF_ratio(parseDouble(inputDataSets.get_PFCF_ratio(),0.0));
////        ratios.setPB_ratio(parseDouble(inputDataSets.get_PB_ratio(),0.0));
////        ratios.setPOCF_ratio(parseDouble(inputDataSets.get_POCF_ratio(),0.0));
////        ratios.setPTB_ratio(parseDouble(inputDataSets.get_PTB_ratio(),0.0));
////        ratios.setPayout_Ratio(parseDouble(inputDataSets.get_Payout_Ratio(),0.0));
////
////        /* This part is for growths*/
//
////        growths.setCodeName(inputDataSets.getName());
////        growths.setYear(2018);
////        growths.setAsset_Growth(parseDouble(inputDataSets.get_Asset_Growth(),0.0));
////        growths.setDebt_Growth(parseDouble(inputDataSets.get_Debt_Growth(),0.0));
////        growths.setEBIT_Growth(parseDouble(inputDataSets.get_EBIT_Growth(),0.0));
////        growths.setEPS_Growth(parseDouble(inputDataSets.get_EPS_Growth(),0.0));
////        growths.setFree_Cash_Flow_growth(parseDouble(inputDataSets.get_Free_Cash_Flow_growth(),0.0));
////        growths.setGross_Profit_Growth(parseDouble(inputDataSets.get_Gross_Profit_Growth(),0.0));
////        growths.setEPS_Diluted_Growth(parseDouble(inputDataSets.get_EPS_Diluted_Growth(),0.0));
////        growths.setInventory_Growth(parseDouble(inputDataSets.get_Inventory_Growth(),0.0));
////        growths.setNet_Income_Growth(parseDouble(inputDataSets.get_Net_Income_Growth(),0.0));
////        growths.setOperating_Cash_Flow_growth(parseDouble(inputDataSets.get_Operating_Cash_Flow_growth(),0.0));
////        growths.setOperating_Income_Growth(parseDouble(inputDataSets.get_Operating_Income_Growth(),0.0));
////        growths.setRevenue_Growth(parseDouble(inputDataSets.getRevenue_Growth(),0.0));
////        growths.setReceivables_growth(parseDouble(inputDataSets.get_Receivables_growth(),0.0));
////        growths.setWeighted_Average_Shares_Diluted_Growth(parseDouble(inputDataSets.get_Weighted_Average_Shares_Diluted_Growth(),0.0));
////        growths.setWeighted_Average_Shares_Growth(parseDouble(inputDataSets.get_Weighted_Average_Shares_Growth(),0.0));
////
//
//        /*
//        * This part is for Averages*/
//
////        averages.setCodeName(inputDataSets.getName());
////        averages.setYear(2014);
////
////        averages.setAverage_Inventory(parseDouble(inputDataSets.get_Average_Inventory(),0.0));
////        averages.setAverage_Payables(parseDouble(inputDataSets.get_Average_Payables(),0.0));
////        averages.setAverage_Receivables(parseDouble(inputDataSets.get_Average_Receivables(),0.0));
////        averages.setWeighted_Average_Shs_Out(parseDouble(inputDataSets.getWeighted_Average_Shs_Out(),0.0));
////        averages.setWeighted_Average_Shs_Out_Dil(parseDouble(inputDataSets.getWeighted_Average_Shs_Out_Dil(),0.0));
//        /*
//        * this part is for earnings
//        * */
////        earnings.setCodeName(inputDataSets.getName());
////        earnings.setEarnings_before_Tax(parseDouble(inputDataSets.getEarnings_before_Tax(),0.0));
////        earnings.setEarnings_Before_Tax_Margin(parseDouble(inputDataSets.getEarnings_Before_Tax_Margin(),0.0));
////        earnings.setEarnings_Yield(parseDouble(inputDataSets.get_Earnings_Yield(),0.0));
////        earnings.setEBITDA(parseDouble(inputDataSets.getEBITDA(),0.0));
////        earnings.setYear(2016);
////        earnings.setEbtperEBIT(parseDouble(inputDataSets.get_ebtperEBIT(),0.0));
////
//
////        Values values = new Values();
////
////        values.setcomapny_code((inputDataSets.getName()));
////
////        values.setEnterprise_Value_over_EBITDA(parseDouble(inputDataSets.get_Enterprise_Value_over_EBITDA(),0.0));
////        values.setEnterprise_Value(parseDouble(inputDataSets.get_Enterprise_Value(),0.0));
////        values.setEnterpriseValueMultiple(parseDouble(inputDataSets.get_enterpriseValueMultiple(),0.0));
////        values.setTangible_Asset_Value(parseDouble(inputDataSets.get_Tangible_Asset_Value(),0.0));
////        values.setPriceFairValue(parseDouble(inputDataSets.get_priceFairValue(),0.0));
////        values.setNet_Current_Asset_Value(parseDouble(inputDataSets.get_Net_Current_Asset_Value(),0.0));
////        values.setYear(2017);
//
//        PerShare perShare = new PerShare();
//
//        /**
//         * parsing data from input to Pershare
//         *
//         *
//         * */
////
//        log.info("Name: "+inputDataSets.get_Sector());
//
//
//        /*
//        this below part was for pershare
//        **/
////
//        perShare.setCodeName(inputDataSets.getName());
//
//        perShare.setCash_per_Share(parseDouble(inputDataSets.get_cashPerShare(),0.0));
//        perShare.setBook_Value_per_Share(parseDouble(inputDataSets.get_Book_Value_per_Share(),0.0));
//        perShare.setBook_Value_per_Share_Growth(parseDouble(inputDataSets.get_Book_Value_per_Share_Growth(),0.0));
//        perShare.setCapex_per_Share(parseDouble(inputDataSets.get_Capex_per_Share(),0.0));
//        perShare.setEarnings_Per_Share(parseDouble(inputDataSets.getEPS(),0.0));
//        perShare.setDiluted_Earnings_Per_Share(parseDouble(inputDataSets.getEPS_Diluted(),0.0));
//        perShare.setDividend_per_Share(parseDouble(inputDataSets.getDividend_per_Share(),0.0));
//        perShare.setDividends_per_Share_Growth(parseDouble(inputDataSets.get_Dividends_per_Share_Growth(),0.0));
//
//        perShare.setFree_Cash_Flow_per_Share(parseDouble(inputDataSets.get_Free_Cash_Flow_per_Share(),0.0));
//        perShare.setInterest_Debt_per_Share(parseDouble(inputDataSets.get_Interest_Debt_per_Share(),0.0));
//        perShare.setOperating_Cash_Flow_per_Share(parseDouble(inputDataSets.get_Operating_Cash_Flow_per_Share(),0.0));
//        perShare.setShareholders_Equity_per_Share(parseDouble(inputDataSets.get_Shareholders_Equity_per_Share(),0.0));
//        perShare.setTangible_Book_Value_per_Share(parseDouble(inputDataSets.get_Tangible_Book_Value_per_Share(),0.0));
//
//
//        perShare.setFiveY_Dividend_per_Share_Growth_per_Share(parseDouble(inputDataSets.get_5Y_Dividend_per_Share_Growth_per_Share(),0.0));
//        perShare.setFiveY_Net_Income_Growth_per_Share(parseDouble(inputDataSets.get_5Y_Net_Income_Growth_per_Share(),0.0));
//        perShare.setFiveY_Revenue_Growth_per_Share(parseDouble(inputDataSets.get_5Y_Revenue_Growth_per_Share(),0.0));
//        perShare.setFiveY_Operating_CF_Growth_per_Share(parseDouble(inputDataSets.get_5Y_Operating_CF_Growth_per_Share(),0.0));
//        perShare.setFiveY_Shareholders_Equity_Growth_per_Share(parseDouble(inputDataSets.get_5Y_Shareholders_Equity_Growth_per_Share(),0.0));
//
//        perShare.setTenY_Dividend_per_Share_Growth_per_Share(parseDouble(inputDataSets.get_10Y_Dividend_per_Share_Growth_per_Share(),0.0));
//        perShare.setTenY_Net_Income_Growth_per_Share(parseDouble(inputDataSets.get_10Y_Net_Income_Growth_per_Share(),0.0));
//        perShare.setTenY_Revenue_Growth_per_Share(parseDouble(inputDataSets.get_10Y_Revenue_Growth_per_Share(),0.0));
//        perShare.setTenY_Operating_CF_Growth_per_Share(parseDouble(inputDataSets.get_10Y_Operating_CF_Growth_per_Share(),0.0));
//        perShare.setTenY_Shareholders_Equity_Growth_per_Share(parseDouble(inputDataSets.get_10Y_Shareholders_Equity_Growth_per_Share(),0.0));
//
//        perShare.setThreeY_Dividend_per_Share_Growth_per_Share(parseDouble(inputDataSets.get_3Y_Dividend_per_Share_Growth_per_Share(),0.0));
//        perShare.setThreeY_Net_Income_Growth_per_Share(parseDouble(inputDataSets.get_3Y_Net_Income_Growth_per_Share(),0.0));
//        perShare.setThreeY_Revenue_Growth_per_Share(parseDouble(inputDataSets.get_3Y_Revenue_Growth_per_Share(),0.0));
//        perShare.setThreeY_Operating_CF_Growth_per_Share(parseDouble(inputDataSets.get_3Y_Operating_CF_Growth_per_Share(),0.0));
//        perShare.setThreeY_Shareholders_Equity_Growth_per_Share(parseDouble(inputDataSets.get_3Y_Shareholders_Equity_Growth_per_Share(),0.0));
//
//        perShare.setYear(2018);
//
//
////        return sector;
////        return ratios;
////        return growths;
////        return averages;
//        return perShare;
////        return values;
//    }
//}
//
//
//
//

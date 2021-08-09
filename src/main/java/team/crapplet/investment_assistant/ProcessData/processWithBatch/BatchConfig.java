//package team.crapplet.investment_assistant.ProcessData.processWithBatch;
//
//
//import javax.sql.DataSource;
//
//import org.springframework.batch.core.Job;
//import org.springframework.batch.core.Step;
//import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
//import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
//import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
//import org.springframework.batch.core.launch.support.RunIdIncrementer;
//import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
//import org.springframework.batch.item.database.JdbcBatchItemWriter;
//import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
//import org.springframework.batch.item.file.FlatFileItemReader;
//import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
//import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ClassPathResource;
//
//import team.crapplet.investment_assistant.Model.*;
//
//@Configuration
//@EnableBatchProcessing
//public class BatchConfig {
//
//    @Autowired
//    public JobBuilderFactory jobBuilderFactory;
//
//    @Autowired
//    public StepBuilderFactory stepBuilderFactory;
//
////    private  final  String[] FIELD_NAMES =  new String[] {"Name","Revenue"};
//    private final String[] FIELD_NAMES = new String[] {  "Name","Revenue","Revenue_Growth","Cost_of_Revenue",
//        "Gross_Profit","R_D_Expenses","SG_A_Expense","Operating_Expenses","Operating_Income","Interest_Expense",
//        "Earnings_before_Tax","Income_Tax_Expense","Net_Income___Non_Controlling_int","Net_Income___Discontinued_ops",
//        "Net_Income","Preferred_Dividends","Net_Income_Com","EPS","EPS_Diluted","Weighted_Average_Shs_Out",
//        "Weighted_Average_Shs_Out_Dil","Dividend_per_Share","Gross_Margin","EBITDA_Margin","EBIT_Margin",
//        "Profit_Margin","Free_Cash_Flow_margin","EBITDA","EBIT","Consolidated_Income","Earnings_Before_Tax_Margin",
//        "Net_Profit_Margin","Cash_and_cash_equivalents","Short_term_investments","Cash_and_short_term_investments",
//        "Receivables","Inventories","Total_current_assets","Property_Plant___Equipment_Net",
//        "_Goodwill_and_Intangible_Assets","_Long_term_investments","_Tax_assets",
//        "_Total_non_current_assets","_Total_assets","_Payables","_Short_term_debt","_Total_current_liabilities",
//        "_Long_term_debt","_Total_debt","_Deferred_revenue","_Tax_Liabilities","_Deposit_Liabilities",
//        "_Total_non_current_liabilities","_Total_liabilities","_Other_comprehensive_income","_Retained_earnings_deficit","_Total_shareholders_equity","_Investments","_Net_Debt","_Other_Assets","_Other_Liabilities","_Depreciation___Amortization","_Stock_based_compensation","_Operating_Cash_Flow","_Capital_Expenditure","_Acquisitions_and_disposals","_Investment_purchases_and_sales","_Investing_Cash_flow","_Issuance_repayment_of_deb","_Issuance_buybacks_of_share","_Dividend_payments","_Financing_Cash_Flow","_Effect_of_forex_changes_on_cash","_Net_cash_flow_per_Change_in_cash","_Free_Cash_Flow","_Net_Cash_per_Marketcap","_priceBookValueRatio","_priceToBookRatio","_priceToSalesRatio","_priceEarningsRatio","_priceToFreeCashFlowsRatio","_priceToOperatingCashFlowsRatio","_priceCashFlowRatio","_priceEarningsToGrowthRatio","_priceSalesRatio","_dividendYield","_enterpriseValueMultiple","_priceFairValue","_ebitperRevenue","_ebtperEBIT","_niperEBT","_grossProfitMargin","_operatingProfitMargin","_pretaxProfitMargin","_netProfitMargin","_effectiveTaxRate","_returnOnAssets","_returnOnEquity","_returnOnCapitalEmployed","_nIperEBT","_eBTperEBIT","_eBITperRevenue","_payablesTurnover","_inventoryTurnover","_fixedAssetTurnover","_assetTurnover","_currentRatio","_quickRatio","_cashRatio","_daysOfSalesOutstanding","_daysOfInventoryOutstanding","_operatingCycle","_daysOfPayablesOutstanding","_cashConversionCycle","_debtRatio","_debtEquityRatio","_longtermDebtToCapitalization","_totalDebtToCapitalization","_interestCoverage","_cashFlowToDebtRatio","_companyEquityMultiplier","_operatingCashFlowPerShare","_freeCashFlowPerShare","_cashPerShare","_payoutRatio","_operatingCashFlowSalesRatio","_freeCashFlowOperatingCashFlowRatio","_cashFlowCoverageRatios","_shortTermCoverageRatios","_capitalExpenditureCoverageRatios","_dividendpaidAndCapexCoverageRatios","_dividendPayoutRatio","_Revenue_per_Share","_Net_Income_per_Share","_Operating_Cash_Flow_per_Share","_Free_Cash_Flow_per_Share","_Cash_per_Share","_Book_Value_per_Share","_Tangible_Book_Value_per_Share","_Shareholders_Equity_per_Share","_Interest_Debt_per_Share","_Market_Cap","_Enterprise_Value","_PE_ratio","_Price_to_Sales_Ratio","_POCF_ratio","_PFCF_ratio","_PB_ratio","_PTB_ratio","_EV_to_Sales","_Enterprise_Value_over_EBITDA","_EV_to_Operating_cash_flow","_EV_to_Free_cash_flow","_Earnings_Yield","_Free_Cash_Flow_Yield","_Debt_to_Equity","_Debt_to_Assets","_Net_Debt_to_EBITDA","_Current_ratio","_Interest_Coverage","_Income_Quality","_Dividend_Yield","_Payout_Ratio","_SG_A_to_Revenue","_R_D_to_Revenue","_Intangibles_to_Total_Assets","_Capex_to_Operating_Cash_Flow","_Capex_to_Revenue","_Capex_to_Depreciation","_Stock_based_compensation_to_Revenue","_Graham_Number","_ROIC","_Return_on_Tangible_Assets","_Graham_Net_Net","_Working_Capital","_Tangible_Asset_Value","_Net_Current_Asset_Value","_Invested_Capital","_Average_Receivables","_Average_Payables","_Average_Inventory","_Days_Sales_Outstanding","_Days_Payables_Outstanding","_Days_of_Inventory_on_Hand","_Receivables_Turnover","_Payables_Turnover","_Inventory_Turnover","_ROE","_Capex_per_Share","_Gross_Profit_Growth","_EBIT_Growth","_Operating_Income_Growth","_Net_Income_Growth","_EPS_Growth","_EPS_Diluted_Growth","_Weighted_Average_Shares_Growth","_Weighted_Average_Shares_Diluted_Growth","_Dividends_per_Share_Growth","_Operating_Cash_Flow_growth","_Free_Cash_Flow_growth","_10Y_Revenue_Growth_per_Share","_5Y_Revenue_Growth_per_Share","_3Y_Revenue_Growth_per_Share","_10Y_Operating_CF_Growth_per_Share","_5Y_Operating_CF_Growth_per_Share","_3Y_Operating_CF_Growth_per_Share","_10Y_Net_Income_Growth_per_Share","_5Y_Net_Income_Growth_per_Share","_3Y_Net_Income_Growth_per_Share","_10Y_Shareholders_Equity_Growth_per_Share","_5Y_Shareholders_Equity_Growth_per_Share","_3Y_Shareholders_Equity_Growth_per_Share","_10Y_Dividend_per_Share_Growth_per_Share","_5Y_Dividend_per_Share_Growth_per_Share","_3Y_Dividend_per_Share_Growth_per_Share","_Receivables_growth","_Inventory_Growth","_Asset_Growth","_Book_Value_per_Share_Growth","_Debt_Growth","_R_D_Expense_Growth",
//        "_SG_A_Expenses_Growth","_Sector","PRICE_VAR_percent","_Class"};
//
//    @Bean
//    public FlatFileItemReader<InputDataSets> reader() {
//        return new FlatFileItemReaderBuilder<InputDataSets>().name("InputDataSetsReader")
//                .resource(new ClassPathResource("2018_Financial_Data.csv")).delimited().names(FIELD_NAMES)
//                .fieldSetMapper(new BeanWrapperFieldSetMapper<InputDataSets>() {
//                    {
//                        setTargetType(InputDataSets.class);
//                    }
//                }).build();
//    }
//
//    @Bean
//    public IntermediateDataProcessor processor() {
//        return new IntermediateDataProcessor();
//    }
//
//    /**
//     * For VAlues population
//     * @param dataSource
//     * @return
//     */
////    @Bean
////    public JdbcBatchItemWriter<Values> writer(DataSource dataSource) {
////        return new JdbcBatchItemWriterBuilder<Values>()
////                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
////                .sql("INSERT INTO values (code_name, year, enterprise_value_multiple,price_fair_value,enterprise_value," +
////                        "enterprise_value_over_EBITDA,tangible_asset_value,net_current_asset_value)"
////                        + " VALUES ( :comapny_code,:year,:enterpriseValueMultiple,:priceFairValue,:Enterprise_Value,:Enterprise_Value_over_EBITDA," +
////                        ":Tangible_Asset_Value,:Net_Current_Asset_Value)")
////                .dataSource(dataSource).build();
////    }
//
//    /**
//     * for Pershare Population
//     * @param //dataSource
//     * @return
//     */
//    @Bean
//    public JdbcBatchItemWriter<PerShare> writer(DataSource dataSource) {
//        return new JdbcBatchItemWriterBuilder<PerShare>()
//                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
//                .sql("INSERT INTO per_share (code_name,year,dividend_per_share,cash_per_share," +
//                        "book_value_per_share,tangible_book_value_per_share,shareholders_equity_per_share," +
//                        "interest_debt_per_share,book_value_per_share_growth,capex_per_share,earnings_per_share," +
//                        "diluted_earnings_per_share,operating_cash_flow_per_share,free_cash_flow_per_share," +
//                        "teny_revenue_growth_per_share,fivey_revenue_growth_per_share,threey_revenue_growth_per_share," +
//                        "teny_operating_cf_growth_per_share,fivey_operating_cf_growth_per_share,threey_operating_cf_growth_per_share," +
//                        "teny_net_income_growth_per_share,fivey_net_income_growth_per_share,threey_net_income_growth_per_share," +
//                        "teny_shareholders_equity_growth_per_share,fivey_shareholders_equity_growth_per_share," +
//                        "threey_shareholders_equity_growth_per_share,teny_dividend_per_share_growth_per_share,fivey_dividend_per_share_growth_per_share," +
//                        "threey_dividend_per_share_growth_per_share,dividends_per_share_growth)"
//                        + " VALUES (:CodeName,:year,:dividend_per_Share,:cash_per_Share,:Book_Value_per_Share,:Tangible_Book_Value_per_Share,:Shareholders_Equity_per_Share,:Interest_Debt_per_Share,:Book_Value_per_Share_Growth,:Capex_per_Share,:Earnings_Per_Share,:Diluted_Earnings_Per_Share,:Operating_Cash_Flow_per_Share,:Free_Cash_Flow_per_Share,:tenY_Revenue_Growth_per_Share,:fiveY_Revenue_Growth_per_Share,:threeY_Revenue_Growth_per_Share,:tenY_Operating_CF_Growth_per_Share,:fiveY_Operating_CF_Growth_per_Share,:threeY_Operating_CF_Growth_per_Share,:tenY_Net_Income_Growth_per_Share,:fiveY_Net_Income_Growth_per_Share,:threeY_Net_Income_Growth_per_Share,:tenY_Shareholders_Equity_Growth_per_Share,:fiveY_Shareholders_Equity_Growth_per_Share,:threeY_Shareholders_Equity_Growth_per_Share,:tenY_Dividend_per_Share_Growth_per_Share,:fiveY_Dividend_per_Share_Growth_per_Share,:threeY_Dividend_per_Share_Growth_per_Share,:Dividends_per_Share_Growth)")
//                .dataSource(dataSource).build();
//    }
////    @Bean
////    public JdbcBatchItemWriter<PerShare> writer(DataSource dataSource) {
////        return new JdbcBatchItemWriterBuilder<PerShare>()
////                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
////                .sql("INSERT INTO per_share(comapny_code)"
////                        + " VALUES(:comapny_code)")
////                .dataSource(dataSource).build();
////    }
//
//
//    /*
//    * Earning Writer
//    * */
//
////        @Bean
////    public JdbcBatchItemWriter<Earnings> writer(DataSource dataSource) {
////        return new JdbcBatchItemWriterBuilder<Earnings>()
////                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
////                .sql("INSERT INTO earnings (code_name,year,earnings_before_Tax,earnings_before_tax_margin,ebitda ,earnings_yield ,ebt_per_ebit)"
////                        + " VALUES (:CodeName, :year, :Earnings_before_Tax, :Earnings_Before_Tax_Margin, :EBITDA, :Earnings_Yield, :ebtperEBIT )")
////                .dataSource(dataSource).build();
////    }
//
//
//    /*This part is for AVerages*/
////        @Bean
////    public JdbcBatchItemWriter<Averages> writer(DataSource dataSource) {
////        return new JdbcBatchItemWriterBuilder<Averages>()
////                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
////                .sql("INSERT INTO averages (code_name,year,weighted_average_shs_out,weighted_average_shs_dil,average_receivables,average_payables,average_inventory)"
////                        + " VALUES (:CodeName,:year,:Weighted_Average_Shs_Out,:Weighted_Average_Shs_Out_Dil,:Average_Receivables,:Average_Payables,:Average_Inventory)")
////                .dataSource(dataSource).build();
////    }
//
//    /*This part is for Grpwths*/
////    @Bean
////    public JdbcBatchItemWriter<Growths> writer(DataSource dataSource) {
////        return new JdbcBatchItemWriterBuilder<Growths>()
////                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
////                .sql("INSERT INTO growths (code_name,year,revenue_growth,gross_profit_growth,ebit_growth,operating_income_growth,net_income_growth,eps_growth,eps_diluted_growth,weighted_average_shares_growth,weighted_average_shares_diluted_growth,operating_cash_flow_growth,free_cash_flow_growth,receivables_growth,inventory_growth,asset_growth,debt_growth)"
////                        + " VALUES (:CodeName,:year,:Revenue_Growth,:Gross_Profit_Growth,:EBIT_Growth,:Operating_Income_Growth,:Net_Income_Growth,:EPS_Growth,:EPS_Diluted_Growth,:Weighted_Average_Shares_Growth,:Weighted_Average_Shares_Diluted_Growth,:Operating_Cash_Flow_growth,:Free_Cash_Flow_growth,:Receivables_growth,:Inventory_Growth,:Asset_Growth,:Debt_Growth)")
////                .dataSource(dataSource).build();
////    }
////
//
//    /*
//    * This part is for Ratios*/
//
////    @Bean
////    public JdbcBatchItemWriter<Ratios> writer(DataSource dataSource) {
////        return new JdbcBatchItemWriterBuilder<Ratios>()
////                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
////                .sql("INSERT INTO ratios (code_name,year,pricebookvalueratio,pricetobookratio,pricetosalesratio,pricetofreecashflowsratio,pricetooperatingcashflowsratio,pricecashflowratio,pricesalesratio,current_ratio,priceearningstogrowthratio,quickratio,priceearningsratio,cashratio,debtratio,debtequityratio,cashflowtodebtratio,payoutratio,operatingcashflowsalesratio,freecashflowoperatingcashflowratio,cashflowcoverageratios,shorttermcoverageratios,capitalexpenditurecoverageratios,dividendpaidandcapexcoverageratios,dividendpayoutratio,pe_ratio,price_to_sales_ratio,pocf_ratio,pfcf_ratio,pb_ratio,ptb_ratio,payout_ratio)"
////                        + " VALUES (:CodeName,:year,:priceBookValueRatio,:priceToBookRatio,:priceToSalesRatio,:priceToFreeCashFlowsRatio,:priceToOperatingCashFlowsRatio,:priceCashFlowRatio,:priceSalesRatio,:currentRatio,:priceEarningsToGrowthRatio,:quickRatio,:priceEarningsRatio,:cashRatio,:debtRatio,:debtEquityRatio,:cashFlowToDebtRatio,:payoutRatio,:operatingCashFlowSalesRatio,:freeCashFlowOperatingCashFlowRatio,:cashFlowCoverageRatios,:shortTermCoverageRatios,:capitalExpenditureCoverageRatios,:dividendpaidAndCapexCoverageRatios,:dividendPayoutRatio,:PE_ratio,:Price_to_Sales_Ratio,:POCF_ratio,:PFCF_ratio,:PB_ratio,:PTB_ratio,:Payout_Ratio)")
////                .dataSource(dataSource).build();
////    }
//
//    /*This part is for secotr*/
////    @Bean
////    public JdbcBatchItemWriter<Sector> writer(DataSource dataSource) {
////        return new JdbcBatchItemWriterBuilder<Sector>()
////                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
////                .sql("INSERT INTO sector (code_name,sector_name)"
////                        + " VALUES (:CodeName,:sectorName)")
////                .dataSource(dataSource).build();
////    }
//
//
//    @Bean
//    public Job importUserJob(JobCompletionNotificationListener listener, Step step1) {
//        return jobBuilderFactory
//                .get("importUserJob")
//                .incrementer(new RunIdIncrementer())
//                .listener(listener)
//                .flow(step1)
//                .end()
//                .build();
//    }
//
//
//    @Bean
//    public Step step1(JdbcBatchItemWriter<PerShare> writer) {
//        return stepBuilderFactory
//                .get("step1")
//                .<InputDataSets, PerShare>chunk(100)
//                .reader(reader())
//                .processor(processor())
//                .writer(writer)
//                .build();
//    }
//}

package team.crapplet.investment_assistant.ProcessData.processWithBatch;


import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import team.crapplet.investment_assistant.Model.Values;

@Configuration
@EnableBatchProcessing
public class BatchConfig {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

//    private  final  String[] FIELD_NAMES =  new String[] {"Name","Revenue"};
    private final String[] FIELD_NAMES = new String[] {  "Name","Revenue","Revenue_Growth","Cost_of_Revenue",
        "Gross_Profit","R_D_Expenses","SG_A_Expense","Operating_Expenses","Operating_Income","Interest_Expense",
        "Earnings_before_Tax","Income_Tax_Expense","Net_Income___Non_Controlling_int","Net_Income___Discontinued_ops",
        "Net_Income","Preferred_Dividends","Net_Income_Com","EPS","EPS_Diluted","Weighted_Average_Shs_Out",
        "Weighted_Average_Shs_Out_Dil","Dividend_per_Share","Gross_Margin","EBITDA_Margin","EBIT_Margin",
        "Profit_Margin","Free_Cash_Flow_margin","EBITDA","EBIT","Consolidated_Income","Earnings_Before_Tax_Margin",
        "Net_Profit_Margin","Cash_and_cash_equivalents","Short_term_investments","Cash_and_short_term_investments",
        "Receivables","Inventories","Total_current_assets","Property_Plant___Equipment_Net",
        "_Goodwill_and_Intangible_Assets","_Long_term_investments","_Tax_assets",
        "_Total_non_current_assets","_Total_assets","_Payables","_Short_term_debt","_Total_current_liabilities",
        "_Long_term_debt","_Total_debt","_Deferred_revenue","_Tax_Liabilities","_Deposit_Liabilities",
        "_Total_non_current_liabilities","_Total_liabilities","_Other_comprehensive_income","_Retained_earnings_deficit","_Total_shareholders_equity","_Investments","_Net_Debt","_Other_Assets","_Other_Liabilities","_Depreciation___Amortization","_Stock_based_compensation","_Operating_Cash_Flow","_Capital_Expenditure","_Acquisitions_and_disposals","_Investment_purchases_and_sales","_Investing_Cash_flow","_Issuance_repayment_of_deb","_Issuance_buybacks_of_share","_Dividend_payments","_Financing_Cash_Flow","_Effect_of_forex_changes_on_cash","_Net_cash_flow_per_Change_in_cash","_Free_Cash_Flow","_Net_Cash_per_Marketcap","_priceBookValueRatio","_priceToBookRatio","_priceToSalesRatio","_priceEarningsRatio","_priceToFreeCashFlowsRatio","_priceToOperatingCashFlowsRatio","_priceCashFlowRatio","_priceEarningsToGrowthRatio","_priceSalesRatio","_dividendYield","_enterpriseValueMultiple","_priceFairValue","_ebitperRevenue","_ebtperEBIT","_niperEBT","_grossProfitMargin","_operatingProfitMargin","_pretaxProfitMargin","_netProfitMargin","_effectiveTaxRate","_returnOnAssets","_returnOnEquity","_returnOnCapitalEmployed","_nIperEBT","_eBTperEBIT","_eBITperRevenue","_payablesTurnover","_inventoryTurnover","_fixedAssetTurnover","_assetTurnover","_currentRatio","_quickRatio","_cashRatio","_daysOfSalesOutstanding","_daysOfInventoryOutstanding","_operatingCycle","_daysOfPayablesOutstanding","_cashConversionCycle","_debtRatio","_debtEquityRatio","_longtermDebtToCapitalization","_totalDebtToCapitalization","_interestCoverage","_cashFlowToDebtRatio","_companyEquityMultiplier","_operatingCashFlowPerShare","_freeCashFlowPerShare","_cashPerShare","_payoutRatio","_operatingCashFlowSalesRatio","_freeCashFlowOperatingCashFlowRatio","_cashFlowCoverageRatios","_shortTermCoverageRatios","_capitalExpenditureCoverageRatios","_dividendpaidAndCapexCoverageRatios","_dividendPayoutRatio","_Revenue_per_Share","_Net_Income_per_Share","_Operating_Cash_Flow_per_Share","_Free_Cash_Flow_per_Share","_Cash_per_Share","_Book_Value_per_Share","_Tangible_Book_Value_per_Share","_Shareholders_Equity_per_Share","_Interest_Debt_per_Share","_Market_Cap","_Enterprise_Value","_PE_ratio","_Price_to_Sales_Ratio","_POCF_ratio","_PFCF_ratio","_PB_ratio","_PTB_ratio","_EV_to_Sales","_Enterprise_Value_over_EBITDA","_EV_to_Operating_cash_flow","_EV_to_Free_cash_flow","_Earnings_Yield","_Free_Cash_Flow_Yield","_Debt_to_Equity","_Debt_to_Assets","_Net_Debt_to_EBITDA","_Current_ratio","_Interest_Coverage","_Income_Quality","_Dividend_Yield","_Payout_Ratio","_SG_A_to_Revenue","_R_D_to_Revenue","_Intangibles_to_Total_Assets","_Capex_to_Operating_Cash_Flow","_Capex_to_Revenue","_Capex_to_Depreciation","_Stock_based_compensation_to_Revenue","_Graham_Number","_ROIC","_Return_on_Tangible_Assets","_Graham_Net_Net","_Working_Capital","_Tangible_Asset_Value","_Net_Current_Asset_Value","_Invested_Capital","_Average_Receivables","_Average_Payables","_Average_Inventory","_Days_Sales_Outstanding","_Days_Payables_Outstanding","_Days_of_Inventory_on_Hand","_Receivables_Turnover","_Payables_Turnover","_Inventory_Turnover","_ROE","_Capex_per_Share","_Gross_Profit_Growth","_EBIT_Growth","_Operating_Income_Growth","_Net_Income_Growth","_EPS_Growth","_EPS_Diluted_Growth","_Weighted_Average_Shares_Growth","_Weighted_Average_Shares_Diluted_Growth","_Dividends_per_Share_Growth","_Operating_Cash_Flow_growth","_Free_Cash_Flow_growth","_10Y_Revenue_Growth_per_Share","_5Y_Revenue_Growth_per_Share","_3Y_Revenue_Growth_per_Share","_10Y_Operating_CF_Growth_per_Share","_5Y_Operating_CF_Growth_per_Share","_3Y_Operating_CF_Growth_per_Share","_10Y_Net_Income_Growth_per_Share","_5Y_Net_Income_Growth_per_Share","_3Y_Net_Income_Growth_per_Share","_10Y_Shareholders_Equity_Growth_per_Share","_5Y_Shareholders_Equity_Growth_per_Share","_3Y_Shareholders_Equity_Growth_per_Share","_10Y_Dividend_per_Share_Growth_per_Share","_5Y_Dividend_per_Share_Growth_per_Share","_3Y_Dividend_per_Share_Growth_per_Share","_Receivables_growth","_Inventory_Growth","_Asset_Growth","_Book_Value_per_Share_Growth","_Debt_Growth","_R_D_Expense_Growth",
        "_SG_A_Expenses_Growth","_Sector","_2018_PRICE_VAR_percent","_Class"};





    @Bean
    public FlatFileItemReader<InputDataSets> reader() {
        return new FlatFileItemReaderBuilder<InputDataSets>().name("InputDataSetsReader")
                .resource(new ClassPathResource("2017_Financial_Data.csv")).delimited().names(FIELD_NAMES)
                .fieldSetMapper(new BeanWrapperFieldSetMapper<InputDataSets>() {
                    {
                        setTargetType(InputDataSets.class);
                    }
                }).build();
    }

    @Bean
    public IntermediateRatioProcessor processor() {
        return new IntermediateRatioProcessor();
    }

    @Bean
    public JdbcBatchItemWriter<Values> writer(DataSource dataSource) {
        return new JdbcBatchItemWriterBuilder<Values>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql("INSERT INTO values (code_name, year)"
                        + " VALUES ( :CodeName, :year)")
                .dataSource(dataSource).build();
    }

    @Bean
    public Job importUserJob(JobCompletionNotificationListener listener, Step step1) {
        return jobBuilderFactory
                .get("importUserJob")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(step1)
                .end()
                .build();
    }

    @Bean
    public Step step1(JdbcBatchItemWriter<Values> writer) {
        return stepBuilderFactory
                .get("step1")
                .<InputDataSets, Values>chunk(10)
                .reader(reader())
                .processor(processor())
                .writer(writer)
                .build();
    }
}

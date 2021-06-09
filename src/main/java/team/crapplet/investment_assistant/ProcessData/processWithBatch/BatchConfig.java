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
import org.springframework.beans.factory.annotation.Value;
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

    private final String[] FIELD_NAMES = new String[] { "Name","Revenue","Revenue Growth","Cost of Revenue",
            "Gross Profit","R&D Expenses","SG&A Expense","Operating Expenses","Operating Income",
            "Interest Expense","Earnings before Tax","Income Tax Expense","Net Income - Non-Controlling int",
            "Net Income - Discontinued ops","Net Income","Preferred Dividends","Net Income Com","EPS","EPS Diluted",
            "Weighted Average Shs Out","Weighted Average Shs Out (Dil)","Dividend per Share","Gross Margin",
            "EBITDA Margin","EBIT Margin","Profit Margin","Free Cash Flow margin","EBITDA","EBIT","Consolidated Income",
            "Earnings Before Tax Margin","Net Profit Margin",
            "Cash and cash equivalents","Short-term investments","Cash and short-term investments","Receivables",
            "Inventories","Total current assets","roperty", "Plant & Equipment Net", "Goodwill and Intangible Assets",
            "Long-term investments", "Tax assets", "Total non-current assets", "Total assets",
            "Payables", "Short-term debt", "Total current liabilities", "Long-term debt",
            "Total debt", "Deferred revenue", "Tax Liabilities", "Deposit Liabilities",
            "Total non-current liabilities", "Total liabilities",
            "Other comprehensive income", "Retained earnings (deficit)",
            "Total shareholders equity", "Investments", "Net Debt", "Other Assets",
            "Other Liabilities", "Depreciation & Amortization", "Stock-based compensation",
            "Operating Cash Flow", "Capital Expenditure", "Acquisitions and disposals",
            "Investment purchases and sales", "Investing Cash flow", "Issuance (repayment) of debt",
            "Issuance (buybacks) of shares", "Dividend payments",
            "Financing Cash Flow",
            "Effect of forex changes on cash",
            "Net cash flow / Change in cash",
            "Free Cash Flow", "Net Cash/Marketcap",
            "priceBookValueRatio", "priceToBookRatio",
            "priceToSalesRatio", "priceEarningsRatio",
            "priceToFreeCashFlowsRatio", "priceToOperatingCashFlowsRatio",
            "priceCashFlowRatio", "priceEarningsToGrowthRatio",
            "priceSalesRatio", "dividendYield", "enterpriseValueMultiple",
            "priceFairValue", "ebitperRevenue", "ebtperEBIT", "niperEBT",
            "grossProfitMargin", "operatingProfitMargin",
            "pretaxProfitMargin", "netProfitMargin", "effectiveTaxRate", "returnOnAssets", "returnOnEquity",
            "returnOnCapitalEmployed", "nIperEBT", "eBTperEBIT", "eBITperRevenue",
            "payablesTurnover", "inventoryTurnover", "fixedAssetTurnover", "assetTurnover",
            "currentRatio", "quickRatio", "cashRatio", "daysOfSalesOutstanding", "daysOfInventoryOutstanding",
            "operatingCycle", "daysOfPayablesOutstanding", "cashConversionCycle", "debtRatio", "debtEquityRatio",
            "longtermDebtToCapitalization", "totalDebtToCapitalization", "interestCoverage", "cashFlowToDebtRatio",
            "companyEquityMultiplier", "operatingCashFlowPerShare", "freeCashFlowPerShare", "cashPerShare",
            "payoutRatio", "operatingCashFlowSalesRatio", "freeCashFlowOperatingCashFlowRatio",
            "cashFlowCoverageRatios", "shortTermCoverageRatios", "capitalExpenditureCoverageRatios",
            "dividendpaidAndCapexCoverageRatios", "dividendPayoutRatio", "Revenue per Share", "Net Income per Share",
            "Operating Cash Flow per Share", "Free Cash Flow per Share", "Cash per Share", "Book Value per Share",
            "Tangible Book Value per Share", "Shareholders Equity per Share", "Interest Debt per Share",
            "Market Cap", "Enterprise Value", "PE ratio", "Price to Sales Ratio", "POCF ratio",
            "PFCF ratio", "PB ratio", "PTB ratio", "EV to Sales", "Enterprise Value over EBITDA",
            "EV to Operating cash flow", "EV to Free cash flow", "Earnings Yield", "Free Cash Flow Yield",
            "Debt to Equity",
            "Debt to Assets", "Net Debt to EBITDA", "Current ratio", "Interest Coverage", "Income Quality", "Dividend Yield",
            "Payout Ratio", "SG&A to Revenue", "R&D to Revenue", "Intangibles to Total Assets", "Capex to Operating Cash Flow",
            "Capex to Revenue", "Capex to Depreciation", "Stock-based compensation to Revenue", "Graham Number", "ROIC",
            "Return on Tangible Assets", "Graham Net-Net", "Working Capital", "Tangible Asset Value",
            "Net Current Asset Value", "Invested Capital", "Average Receivables", "Average Payables",
            "Average Inventory", "Days Sales Outstanding", "Days Payables Outstanding", "Days of Inventory on Hand",
            "Receivables Turnover", "Payables Turnover", "Inventory Turnover", "ROE", "Capex per Share",
            "Gross Profit Growth", "EBIT Growth", "Operating Income Growth", "Net Income Growth", "EPS Growth",
            "EPS Diluted Growth", "Weighted Average Shares Growth", "Weighted Average Shares Diluted Growth",
            "Dividends per Share Growth", "Operating Cash Flow growth", "Free Cash Flow growth",
            "10Y Revenue Growth (per Share)", "5Y Revenue Growth (per Share)", "3Y Revenue Growth (per Share)",
            "10Y Operating CF Growth (per Share)", "5Y Operating CF Growth (per Share)",
            "3Y Operating CF Growth (per Share)", "10Y Net Income Growth (per Share)", "5Y Net Income Growth (per Share)",

            "3Y Net Income Growth (per Share)", "10Y Shareholders Equity Growth (per Share)",
            "5Y Shareholders Equity Growth (per Share)", "3Y Shareholders Equity Growth (per Share)",
            "10Y Dividend per Share Growth (per Share)", "5Y Dividend per Share Growth (per Share)",
            "3Y Dividend per Share Growth (per Share)", "Receivables growth", "Inventory Growth", "Asset Growth",
            "Book Value per Share Growth", "Debt Growth",
            "R&D Expense Growth", "SG&A Expenses Growth", "Sector", "2019 PRICE VAR [%]"};





    @Bean
    public FlatFileItemReader<InputDataSets> reader() {
        return new FlatFileItemReaderBuilder<InputDataSets>().name("InputDataSetsReader")
                .resource(new ClassPathResource("2018_Financial_Data.csv")).delimited().names(FIELD_NAMES)
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
                .sql("INSERT INTO values (code_name, year,enterprise_value_multiple,price_fair_value,enterprise_value, enterprise_value_over_ebitda, tangible_asset_value " +
                        "enterprise_value_over_ebitda,tangible_asset_value,net_current_asset_value) "
                        + " VALUES ( :CodeName,year,:enterpriseValueMultiple,:priceFairValue,:Enterprise_Value,:Enterprise_Value_over_EBITDA,:Tangible_Asset_Value)")
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

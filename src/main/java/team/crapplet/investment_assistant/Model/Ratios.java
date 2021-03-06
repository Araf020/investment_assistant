package team.crapplet.investment_assistant.Model;

import javax.persistence.*;

@Entity
@Table(name = "ratios")
@IdClass(MakeCompositeKey.class)
public class Ratios {

    @Id
    @Column(name = "code_name")
    private  String CodeName;
    @Id
    private  int year;

    @Column(name = "pricebookvalueratio")

    private Double priceBookValueRatio;

    @Column(name = "pricetobookratio")
    private Double priceToBookRatio;

    @Column(name = "pricetosalesratio")

    private Double priceToSalesRatio;

    @Column(name = "pricetofreecashflowsratio")

    private Double priceToFreeCashFlowsRatio;

    @Column(name = "pricetooperatingcashflowsratio")
    private Double priceToOperatingCashFlowsRatio;

    @Column(name = "pricecashflowratio")
    private Double priceCashFlowRatio;

    @Column(name = "pricesalesratio")
    private Double priceSalesRatio;

    @Column(name = "current_ratio")
    private Double currentRatio;
    @Column(name = "priceearningstogrowthratio")
    private Double priceEarningsToGrowthRatio;


    @Column(name = "quickratio")
    private Double quickRatio;

    @Column(name = "priceearningsratio")
    private Double priceEarningsRatio;

    @Column(name = "cashratio")
    private Double cashRatio;

    @Column(name = "debtratio")
    private Double debtRatio;

    @Column(name = "debtequityratio")
    private Double debtEquityRatio;

    @Column(name = "cashflowtodebtratio")
    private Double cashFlowToDebtRatio;

    @Column(name = "payoutratio")
    private Double payoutRatio;

    @Column(name = "operatingcashflowsalesratio")
    private Double operatingCashFlowSalesRatio;

    @Column(name = "freecashflowoperatingcashflowratio")
    private Double freeCashFlowOperatingCashFlowRatio;

    @Column(name = "cashflowcoverageratios")
    private Double cashFlowCoverageRatios;

    @Column(name = "shorttermcoverageratios")
    private Double shortTermCoverageRatios;

    @Column(name = "capitalexpenditurecoverageratios")
    private Double capitalExpenditureCoverageRatios;

    @Column(name = "dividendpaidandcapexcoverageratios")
    private Double dividendpaidAndCapexCoverageRatios;


    @Column(name = "dividendpayoutratio")
    private Double dividendPayoutRatio;

    @Column(name = "pe_ratio")
    private Double PE_ratio;

    @Column(name = "price_to_sales_ratio")
    private Double Price_to_Sales_Ratio;

    @Column(name = "pocf_ratio")
    private Double POCF_ratio;

    @Column(name = "pfcf_ratio")
    private Double PFCF_ratio;

    @Column(name = "pb_ratio")
    private Double PB_ratio;

    @Column(name = "ptb_ratio")

    private Double PTB_ratio;

    @Column(name = "payout_ratio")
    private Double Payout_Ratio;


    public String getCodeName() {
        return CodeName;
    }

    public void setCodeName(String codeName) {
        CodeName = codeName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Double getPriceBookValueRatio() {
        return priceBookValueRatio;
    }

    public void setPriceBookValueRatio(Double priceBookValueRatio) {
        this.priceBookValueRatio = priceBookValueRatio;
    }

    public Double getPriceToBookRatio() {
        return priceToBookRatio;
    }

    public void setPriceToBookRatio(Double priceToBookRatio) {
        this.priceToBookRatio = priceToBookRatio;
    }

    public Double getPriceToSalesRatio() {
        return priceToSalesRatio;
    }

    public void setPriceToSalesRatio(Double priceToSalesRatio) {
        this.priceToSalesRatio = priceToSalesRatio;
    }

    public Double getPriceToFreeCashFlowsRatio() {
        return priceToFreeCashFlowsRatio;
    }

    public void setPriceToFreeCashFlowsRatio(Double priceToFreeCashFlowsRatio) {
        this.priceToFreeCashFlowsRatio = priceToFreeCashFlowsRatio;
    }

    public Double getPriceToOperatingCashFlowsRatio() {
        return priceToOperatingCashFlowsRatio;
    }

    public void setPriceToOperatingCashFlowsRatio(Double priceToOperatingCashFlowsRatio) {
        this.priceToOperatingCashFlowsRatio = priceToOperatingCashFlowsRatio;
    }

    public Double getPriceCashFlowRatio() {
        return priceCashFlowRatio;
    }

    public void setPriceCashFlowRatio(Double priceCashFlowRatio) {
        this.priceCashFlowRatio = priceCashFlowRatio;
    }

    public Double getPriceSalesRatio() {
        return priceSalesRatio;
    }

    public void setPriceSalesRatio(Double priceSalesRatio) {
        this.priceSalesRatio = priceSalesRatio;
    }

    public Double getCurrentRatio() {
        return currentRatio;
    }

    public void setCurrentRatio(Double currentRatio) {
        this.currentRatio = currentRatio;
    }

    public Double getQuickRatio() {
        return quickRatio;
    }

    public void setQuickRatio(Double quickRatio) {
        this.quickRatio = quickRatio;
    }

    public Double getPriceEarningsRatio() {
        return priceEarningsRatio;
    }

    public void setPriceEarningsRatio(Double priceEarningsRatio) {
        this.priceEarningsRatio = priceEarningsRatio;
    }

    public Double getCashRatio() {
        return cashRatio;
    }

    public void setCashRatio(Double cashRatio) {
        this.cashRatio = cashRatio;
    }

    public Double getDebtRatio() {
        return debtRatio;
    }

    public void setDebtRatio(Double debtRatio) {
        this.debtRatio = debtRatio;
    }

    public Double getDebtEquityRatio() {
        return debtEquityRatio;
    }

    public void setDebtEquityRatio(Double debtEquityRatio) {
        this.debtEquityRatio = debtEquityRatio;
    }

    public Double getCashFlowToDebtRatio() {
        return cashFlowToDebtRatio;
    }

    public void setCashFlowToDebtRatio(Double cashFlowToDebtRatio) {
        this.cashFlowToDebtRatio = cashFlowToDebtRatio;
    }

    public Double getPayoutRatio() {
        return payoutRatio;
    }

    public void setPayoutRatio(Double payoutRatio) {
        this.payoutRatio = payoutRatio;
    }

    public Double getOperatingCashFlowSalesRatio() {
        return operatingCashFlowSalesRatio;
    }

    public void setOperatingCashFlowSalesRatio(Double operatingCashFlowSalesRatio) {
        this.operatingCashFlowSalesRatio = operatingCashFlowSalesRatio;
    }

    public Double getPriceEarningsToGrowthRatio() {
        return priceEarningsToGrowthRatio;
    }

    public Ratios setPriceEarningsToGrowthRatio(Double priceEarningsToGrowthRatio) {
        this.priceEarningsToGrowthRatio = priceEarningsToGrowthRatio;
        return this;
    }

    public Double getFreeCashFlowOperatingCashFlowRatio() {
        return freeCashFlowOperatingCashFlowRatio;
    }

    public void setFreeCashFlowOperatingCashFlowRatio(Double freeCashFlowOperatingCashFlowRatio) {
        this.freeCashFlowOperatingCashFlowRatio = freeCashFlowOperatingCashFlowRatio;
    }

    public Double getCashFlowCoverageRatios() {
        return cashFlowCoverageRatios;
    }

    public void setCashFlowCoverageRatios(Double cashFlowCoverageRatios) {
        this.cashFlowCoverageRatios = cashFlowCoverageRatios;
    }

    public Double getShortTermCoverageRatios() {
        return shortTermCoverageRatios;
    }

    public void setShortTermCoverageRatios(Double shortTermCoverageRatios) {
        this.shortTermCoverageRatios = shortTermCoverageRatios;
    }

    public Double getCapitalExpenditureCoverageRatios() {
        return capitalExpenditureCoverageRatios;
    }

    public void setCapitalExpenditureCoverageRatios(Double capitalExpenditureCoverageRatios) {
        this.capitalExpenditureCoverageRatios = capitalExpenditureCoverageRatios;
    }

    public Double getDividendpaidAndCapexCoverageRatios() {
        return dividendpaidAndCapexCoverageRatios;
    }

    public void setDividendpaidAndCapexCoverageRatios(Double dividendpaidAndCapexCoverageRatios) {
        this.dividendpaidAndCapexCoverageRatios = dividendpaidAndCapexCoverageRatios;
    }

    public Double getDividendPayoutRatio() {
        return dividendPayoutRatio;
    }

    public void setDividendPayoutRatio(Double dividendPayoutRatio) {
        this.dividendPayoutRatio = dividendPayoutRatio;
    }

    public Double getPE_ratio() {
        return PE_ratio;
    }

    public void setPE_ratio(Double PE_ratio) {
        this.PE_ratio = PE_ratio;
    }

    public Double getPrice_to_Sales_Ratio() {
        return Price_to_Sales_Ratio;
    }

    public void setPrice_to_Sales_Ratio(Double price_to_Sales_Ratio) {
        Price_to_Sales_Ratio = price_to_Sales_Ratio;
    }

    public Double getPOCF_ratio() {
        return POCF_ratio;
    }

    public void setPOCF_ratio(Double POCF_ratio) {
        this.POCF_ratio = POCF_ratio;
    }

    public Double getPFCF_ratio() {
        return PFCF_ratio;
    }

    public void setPFCF_ratio(Double PFCF_ratio) {
        this.PFCF_ratio = PFCF_ratio;
    }

    public Double getPB_ratio() {
        return PB_ratio;
    }

    public void setPB_ratio(Double PB_ratio) {
        this.PB_ratio = PB_ratio;
    }

    public Double getPTB_ratio() {
        return PTB_ratio;
    }

    public void setPTB_ratio(Double PTB_ratio) {
        this.PTB_ratio = PTB_ratio;
    }

//    public Double getCurrent_ratio() {
//        return Current_ratio;
//    }
//
//    public void setCurrent_ratio(Double current_ratio) {
//        Current_ratio = current_ratio;
//    }

    public Double getPayout_Ratio() {
        return Payout_Ratio;
    }

    public void setPayout_Ratio(Double payout_Ratio) {
        Payout_Ratio = payout_Ratio;
    }
}

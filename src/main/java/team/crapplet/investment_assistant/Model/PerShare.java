package team.crapplet.investment_assistant.Model;

import org.springframework.data.annotation.TypeAlias;

import javax.persistence.*;

@Entity
@Table(name = "per_share")
@IdClass(MakeCompositeKey.class)
public class PerShare {

    @Id
    @Column(name = "code_name")
    private  String CodeName;

    @Id
    private  int year;

    @Column(name = "dividend_per_share")
    private Double dividend_per_Share;
    @Column(name = "cash_per_share")
    private Double cash_per_Share;
    @Column(name = "book_value_per_share")
    private Double Book_Value_per_Share;

    private Double Tangible_Book_Value_per_Share;

    private Double Shareholders_Equity_per_Share;


    private Double Interest_Debt_per_Share;

    private Double Book_Value_per_Share_Growth;

    private Double Capex_per_Share;

    @Column(name = "earnings_per_share")
    private Double Earnings_Per_Share;

    private Double Diluted_Earnings_Per_Share;

    private Double Operating_Cash_Flow_per_Share;

    private Double Free_Cash_Flow_per_Share;


    private Double tenY_Revenue_Growth_per_Share;

    private Double fiveY_Revenue_Growth_per_Share;

    private Double threeY_Revenue_Growth_per_Share;

    private Double tenY_Operating_CF_Growth_per_Share;

    private Double fiveY_Operating_CF_Growth_per_Share;

    private Double threeY_Operating_CF_Growth_per_Share;

    private Double tenY_Net_Income_Growth_per_Share;

    private Double fiveY_Net_Income_Growth_per_Share;

    private Double threeY_Net_Income_Growth_per_Share;

    private Double tenY_Shareholders_Equity_Growth_per_Share;

    private Double fiveY_Shareholders_Equity_Growth_per_Share;

    private Double threeY_Shareholders_Equity_Growth_per_Share;

    private Double tenY_Dividend_per_Share_Growth_per_Share;

    private Double fiveY_Dividend_per_Share_Growth_per_Share;

    private Double threeY_Dividend_per_Share_Growth_per_Share;

    private Double Dividends_per_Share_Growth;





    public String getCodeName() {
        return this.CodeName;
    }

    public void setCodeName(String  codeName) {
        this.CodeName = codeName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Double getDividend_per_Share() {
        return this.dividend_per_Share;
    }

    public void setDividend_per_Share(Double dividend_per_Share) {
        this.dividend_per_Share = dividend_per_Share;
    }

    public Double getCash_per_Share() {
        return this.cash_per_Share;
    }

    public void setCash_per_Share(Double cash_per_Share) {
        this.cash_per_Share = cash_per_Share;
    }

    public Double getBook_Value_per_Share() {
        return Book_Value_per_Share;
    }

    public void setBook_Value_per_Share(Double book_Value_per_Share) {
        Book_Value_per_Share = book_Value_per_Share;
    }

    public Double getTangible_Book_Value_per_Share() {
        return Tangible_Book_Value_per_Share;
    }

    public void setTangible_Book_Value_per_Share(Double tangible_Book_Value_per_Share) {
        Tangible_Book_Value_per_Share = tangible_Book_Value_per_Share;
    }

    public Double getShareholders_Equity_per_Share() {
        return Shareholders_Equity_per_Share;
    }

    public void setShareholders_Equity_per_Share(Double shareholders_Equity_per_Share) {
        Shareholders_Equity_per_Share = shareholders_Equity_per_Share;
    }

    public Double getInterest_Debt_per_Share() {
        return Interest_Debt_per_Share;
    }

    public void setInterest_Debt_per_Share(Double interest_Debt_per_Share) {
        Interest_Debt_per_Share = interest_Debt_per_Share;
    }

    public Double getBook_Value_per_Share_Growth() {
        return Book_Value_per_Share_Growth;
    }

    public void setBook_Value_per_Share_Growth(Double book_Value_per_Share_Growth) {
        Book_Value_per_Share_Growth = book_Value_per_Share_Growth;
    }

    public Double getCapex_per_Share() {
        return Capex_per_Share;
    }

    public void setCapex_per_Share(Double capex_per_Share) {
        Capex_per_Share = capex_per_Share;
    }

    public Double getEarnings_Per_Share() {
        return Earnings_Per_Share;
    }

    public void setEarnings_Per_Share(Double earnings_Per_Share) {
        Earnings_Per_Share = earnings_Per_Share;
    }

    public Double getDiluted_Earnings_Per_Share() {
        return Diluted_Earnings_Per_Share;
    }

    public void setDiluted_Earnings_Per_Share(Double diluted_Earnings_Per_Share) {
        Diluted_Earnings_Per_Share = diluted_Earnings_Per_Share;
    }

    public Double getOperating_Cash_Flow_per_Share() {
        return Operating_Cash_Flow_per_Share;
    }

    public void setOperating_Cash_Flow_per_Share(Double operating_Cash_Flow_per_Share) {
        Operating_Cash_Flow_per_Share = operating_Cash_Flow_per_Share;
    }

    public Double getFree_Cash_Flow_per_Share() {
        return Free_Cash_Flow_per_Share;
    }

    public void setFree_Cash_Flow_per_Share(Double free_Cash_Flow_per_Share) {
        Free_Cash_Flow_per_Share = free_Cash_Flow_per_Share;
    }

    public Double getTenY_Revenue_Growth_per_Share() {
        return tenY_Revenue_Growth_per_Share;
    }

    public void setTenY_Revenue_Growth_per_Share(Double tenY_Revenue_Growth_per_Share) {
        this.tenY_Revenue_Growth_per_Share = tenY_Revenue_Growth_per_Share;
    }

    public Double getFiveY_Revenue_Growth_per_Share() {
        return fiveY_Revenue_Growth_per_Share;
    }

    public void setFiveY_Revenue_Growth_per_Share(Double fiveY_Revenue_Growth_per_Share) {
        this.fiveY_Revenue_Growth_per_Share = fiveY_Revenue_Growth_per_Share;
    }

    public Double getThreeY_Revenue_Growth_per_Share() {
        return threeY_Revenue_Growth_per_Share;
    }

    public void setThreeY_Revenue_Growth_per_Share(Double threeY_Revenue_Growth_per_Share) {
        this.threeY_Revenue_Growth_per_Share = threeY_Revenue_Growth_per_Share;
    }

    public Double getTenY_Operating_CF_Growth_per_Share() {
        return tenY_Operating_CF_Growth_per_Share;
    }

    public void setTenY_Operating_CF_Growth_per_Share(Double tenY_Operating_CF_Growth_per_Share) {
        this.tenY_Operating_CF_Growth_per_Share = tenY_Operating_CF_Growth_per_Share;
    }

    public Double getFiveY_Operating_CF_Growth_per_Share() {
        return fiveY_Operating_CF_Growth_per_Share;
    }

    public void setFiveY_Operating_CF_Growth_per_Share(Double fiveY_Operating_CF_Growth_per_Share) {
        this.fiveY_Operating_CF_Growth_per_Share = fiveY_Operating_CF_Growth_per_Share;
    }

    public Double getThreeY_Operating_CF_Growth_per_Share() {
        return threeY_Operating_CF_Growth_per_Share;
    }

    public void setThreeY_Operating_CF_Growth_per_Share(Double threeY_Operating_CF_Growth_per_Share) {
        this.threeY_Operating_CF_Growth_per_Share = threeY_Operating_CF_Growth_per_Share;
    }

    public Double getTenY_Net_Income_Growth_per_Share() {
        return tenY_Net_Income_Growth_per_Share;
    }

    public void setTenY_Net_Income_Growth_per_Share(Double tenY_Net_Income_Growth_per_Share) {
        this.tenY_Net_Income_Growth_per_Share = tenY_Net_Income_Growth_per_Share;
    }

    public Double getFiveY_Net_Income_Growth_per_Share() {
        return fiveY_Net_Income_Growth_per_Share;
    }

    public void setFiveY_Net_Income_Growth_per_Share(Double fiveY_Net_Income_Growth_per_Share) {
        this.fiveY_Net_Income_Growth_per_Share = fiveY_Net_Income_Growth_per_Share;
    }

    public Double getThreeY_Net_Income_Growth_per_Share() {
        return threeY_Net_Income_Growth_per_Share;
    }

    public void setThreeY_Net_Income_Growth_per_Share(Double threeY_Net_Income_Growth_per_Share) {
        this.threeY_Net_Income_Growth_per_Share = threeY_Net_Income_Growth_per_Share;
    }

    public Double getTenY_Shareholders_Equity_Growth_per_Share() {
        return tenY_Shareholders_Equity_Growth_per_Share;
    }

    public void setTenY_Shareholders_Equity_Growth_per_Share(Double tenY_Shareholders_Equity_Growth_per_Share) {
        this.tenY_Shareholders_Equity_Growth_per_Share = tenY_Shareholders_Equity_Growth_per_Share;
    }

    public Double getFiveY_Shareholders_Equity_Growth_per_Share() {
        return fiveY_Shareholders_Equity_Growth_per_Share;
    }

    public void setFiveY_Shareholders_Equity_Growth_per_Share(Double fiveY_Shareholders_Equity_Growth_per_Share) {
        this.fiveY_Shareholders_Equity_Growth_per_Share = fiveY_Shareholders_Equity_Growth_per_Share;
    }

    public Double getThreeY_Shareholders_Equity_Growth_per_Share() {
        return threeY_Shareholders_Equity_Growth_per_Share;
    }

    public void setThreeY_Shareholders_Equity_Growth_per_Share(Double threeY_Shareholders_Equity_Growth_per_Share) {
        this.threeY_Shareholders_Equity_Growth_per_Share = threeY_Shareholders_Equity_Growth_per_Share;
    }

    public Double getTenY_Dividend_per_Share_Growth_per_Share() {
        return tenY_Dividend_per_Share_Growth_per_Share;
    }

    public void setTenY_Dividend_per_Share_Growth_per_Share(Double tenY_Dividend_per_Share_Growth_per_Share) {
        this.tenY_Dividend_per_Share_Growth_per_Share = tenY_Dividend_per_Share_Growth_per_Share;
    }

    public Double getFiveY_Dividend_per_Share_Growth_per_Share() {
        return fiveY_Dividend_per_Share_Growth_per_Share;
    }

    public void setFiveY_Dividend_per_Share_Growth_per_Share(Double fiveY_Dividend_per_Share_Growth_per_Share) {
        this.fiveY_Dividend_per_Share_Growth_per_Share = fiveY_Dividend_per_Share_Growth_per_Share;
    }

    public Double getThreeY_Dividend_per_Share_Growth_per_Share() {
        return threeY_Dividend_per_Share_Growth_per_Share;
    }

    public void setThreeY_Dividend_per_Share_Growth_per_Share(Double threeY_Dividend_per_Share_Growth_per_Share) {
        this.threeY_Dividend_per_Share_Growth_per_Share = threeY_Dividend_per_Share_Growth_per_Share;
    }

    public Double getDividends_per_Share_Growth() {
        return Dividends_per_Share_Growth;
    }

    public void setDividends_per_Share_Growth(Double dividends_per_Share_Growth) {
        Dividends_per_Share_Growth = dividends_per_Share_Growth;
    }
}

package team.crapplet.investment_assistant.Model;

import org.springframework.data.annotation.TypeAlias;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "per_share")
public class PerShare {

    private  String comapny_code;

    private  int year;

    private String Dividend_per_Share;

    private String Cash_per_Share;

    private String Book_Value_per_Share;

    private String Tangible_Book_Value_per_Share;

    private String Shareholders_Equity_per_Share;

    private String Interest_Debt_per_Share;

    private String Book_Value_per_Share_Growth;

    private String Capex_per_Share;

    private String Earnings_Per_Share;

    private String Diluted_Earnings_Per_Share;

    private String Operating_Cash_Flow_per_Share;

    private String Free_Cash_Flow_per_Share;


    private String tenY_Revenue_Growth_per_Share;

    private String fiveY_Revenue_Growth_per_Share;

    private String threeY_Revenue_Growth_per_Share;

    private String tenY_Operating_CF_Growth_per_Share;

    private String fiveY_Operating_CF_Growth_per_Share;

    private String threeY_Operating_CF_Growth_per_Share;

    private String tenY_Net_Income_Growth_per_Share;

    private String fiveY_Net_Income_Growth_per_Share;

    private String threeY_Net_Income_Growth_per_Share;

    private String tenY_Shareholders_Equity_Growth_per_Share;

    private String fiveY_Shareholders_Equity_Growth_per_Share;

    private String threeY_Shareholders_Equity_Growth_per_Share;

    private String tenY_Dividend_per_Share_Growth_per_Share;

    private String fiveY_Dividend_per_Share_Growth_per_Share;

    private String threeY_Dividend_per_Share_Growth_per_Share;

    private String Dividends_per_Share_Growth;

    public String getcomapny_code() {
        return comapny_code;
    }

    public void setcomapny_code(String comapny_code) {
        comapny_code = comapny_code;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDividend_per_Share() {
        return Dividend_per_Share;
    }

    public void setDividend_per_Share(String dividend_per_Share) {
        Dividend_per_Share = dividend_per_Share;
    }

    public String getCash_per_Share() {
        return Cash_per_Share;
    }

    public void setCash_per_Share(String cash_per_Share) {
        Cash_per_Share = cash_per_Share;
    }

    public String getBook_Value_per_Share() {
        return Book_Value_per_Share;
    }

    public void setBook_Value_per_Share(String book_Value_per_Share) {
        Book_Value_per_Share = book_Value_per_Share;
    }

    public String getTangible_Book_Value_per_Share() {
        return Tangible_Book_Value_per_Share;
    }

    public void setTangible_Book_Value_per_Share(String tangible_Book_Value_per_Share) {
        Tangible_Book_Value_per_Share = tangible_Book_Value_per_Share;
    }

    public String getShareholders_Equity_per_Share() {
        return Shareholders_Equity_per_Share;
    }

    public void setShareholders_Equity_per_Share(String shareholders_Equity_per_Share) {
        Shareholders_Equity_per_Share = shareholders_Equity_per_Share;
    }

    public String getInterest_Debt_per_Share() {
        return Interest_Debt_per_Share;
    }

    public void setInterest_Debt_per_Share(String interest_Debt_per_Share) {
        Interest_Debt_per_Share = interest_Debt_per_Share;
    }

    public String getBook_Value_per_Share_Growth() {
        return Book_Value_per_Share_Growth;
    }

    public void setBook_Value_per_Share_Growth(String book_Value_per_Share_Growth) {
        Book_Value_per_Share_Growth = book_Value_per_Share_Growth;
    }

    public String getCapex_per_Share() {
        return Capex_per_Share;
    }

    public void setCapex_per_Share(String capex_per_Share) {
        Capex_per_Share = capex_per_Share;
    }

    public String getEarnings_Per_Share() {
        return Earnings_Per_Share;
    }

    public void setEarnings_Per_Share(String earnings_Per_Share) {
        Earnings_Per_Share = earnings_Per_Share;
    }

    public String getDiluted_Earnings_Per_Share() {
        return Diluted_Earnings_Per_Share;
    }

    public void setDiluted_Earnings_Per_Share(String diluted_Earnings_Per_Share) {
        Diluted_Earnings_Per_Share = diluted_Earnings_Per_Share;
    }

    public String getOperating_Cash_Flow_per_Share() {
        return Operating_Cash_Flow_per_Share;
    }

    public void setOperating_Cash_Flow_per_Share(String operating_Cash_Flow_per_Share) {
        Operating_Cash_Flow_per_Share = operating_Cash_Flow_per_Share;
    }

    public String getFree_Cash_Flow_per_Share() {
        return Free_Cash_Flow_per_Share;
    }

    public void setFree_Cash_Flow_per_Share(String free_Cash_Flow_per_Share) {
        Free_Cash_Flow_per_Share = free_Cash_Flow_per_Share;
    }

    public String getTenY_Revenue_Growth_per_Share() {
        return tenY_Revenue_Growth_per_Share;
    }

    public void setTenY_Revenue_Growth_per_Share(String tenY_Revenue_Growth_per_Share) {
        this.tenY_Revenue_Growth_per_Share = tenY_Revenue_Growth_per_Share;
    }

    public String getFiveY_Revenue_Growth_per_Share() {
        return fiveY_Revenue_Growth_per_Share;
    }

    public void setFiveY_Revenue_Growth_per_Share(String fiveY_Revenue_Growth_per_Share) {
        this.fiveY_Revenue_Growth_per_Share = fiveY_Revenue_Growth_per_Share;
    }

    public String getThreeY_Revenue_Growth_per_Share() {
        return threeY_Revenue_Growth_per_Share;
    }

    public void setThreeY_Revenue_Growth_per_Share(String threeY_Revenue_Growth_per_Share) {
        this.threeY_Revenue_Growth_per_Share = threeY_Revenue_Growth_per_Share;
    }

    public String getTenY_Operating_CF_Growth_per_Share() {
        return tenY_Operating_CF_Growth_per_Share;
    }

    public void setTenY_Operating_CF_Growth_per_Share(String tenY_Operating_CF_Growth_per_Share) {
        this.tenY_Operating_CF_Growth_per_Share = tenY_Operating_CF_Growth_per_Share;
    }

    public String getFiveY_Operating_CF_Growth_per_Share() {
        return fiveY_Operating_CF_Growth_per_Share;
    }

    public void setFiveY_Operating_CF_Growth_per_Share(String fiveY_Operating_CF_Growth_per_Share) {
        this.fiveY_Operating_CF_Growth_per_Share = fiveY_Operating_CF_Growth_per_Share;
    }

    public String getThreeY_Operating_CF_Growth_per_Share() {
        return threeY_Operating_CF_Growth_per_Share;
    }

    public void setThreeY_Operating_CF_Growth_per_Share(String threeY_Operating_CF_Growth_per_Share) {
        this.threeY_Operating_CF_Growth_per_Share = threeY_Operating_CF_Growth_per_Share;
    }

    public String getTenY_Net_Income_Growth_per_Share() {
        return tenY_Net_Income_Growth_per_Share;
    }

    public void setTenY_Net_Income_Growth_per_Share(String tenY_Net_Income_Growth_per_Share) {
        this.tenY_Net_Income_Growth_per_Share = tenY_Net_Income_Growth_per_Share;
    }

    public String getFiveY_Net_Income_Growth_per_Share() {
        return fiveY_Net_Income_Growth_per_Share;
    }

    public void setFiveY_Net_Income_Growth_per_Share(String fiveY_Net_Income_Growth_per_Share) {
        this.fiveY_Net_Income_Growth_per_Share = fiveY_Net_Income_Growth_per_Share;
    }

    public String getThreeY_Net_Income_Growth_per_Share() {
        return threeY_Net_Income_Growth_per_Share;
    }

    public void setThreeY_Net_Income_Growth_per_Share(String threeY_Net_Income_Growth_per_Share) {
        this.threeY_Net_Income_Growth_per_Share = threeY_Net_Income_Growth_per_Share;
    }

    public String getTenY_Shareholders_Equity_Growth_per_Share() {
        return tenY_Shareholders_Equity_Growth_per_Share;
    }

    public void setTenY_Shareholders_Equity_Growth_per_Share(String tenY_Shareholders_Equity_Growth_per_Share) {
        this.tenY_Shareholders_Equity_Growth_per_Share = tenY_Shareholders_Equity_Growth_per_Share;
    }

    public String getFiveY_Shareholders_Equity_Growth_per_Share() {
        return fiveY_Shareholders_Equity_Growth_per_Share;
    }

    public void setFiveY_Shareholders_Equity_Growth_per_Share(String fiveY_Shareholders_Equity_Growth_per_Share) {
        this.fiveY_Shareholders_Equity_Growth_per_Share = fiveY_Shareholders_Equity_Growth_per_Share;
    }

    public String getThreeY_Shareholders_Equity_Growth_per_Share() {
        return threeY_Shareholders_Equity_Growth_per_Share;
    }

    public void setThreeY_Shareholders_Equity_Growth_per_Share(String threeY_Shareholders_Equity_Growth_per_Share) {
        this.threeY_Shareholders_Equity_Growth_per_Share = threeY_Shareholders_Equity_Growth_per_Share;
    }

    public String getTenY_Dividend_per_Share_Growth_per_Share() {
        return tenY_Dividend_per_Share_Growth_per_Share;
    }

    public void setTenY_Dividend_per_Share_Growth_per_Share(String tenY_Dividend_per_Share_Growth_per_Share) {
        this.tenY_Dividend_per_Share_Growth_per_Share = tenY_Dividend_per_Share_Growth_per_Share;
    }

    public String getFiveY_Dividend_per_Share_Growth_per_Share() {
        return fiveY_Dividend_per_Share_Growth_per_Share;
    }

    public void setFiveY_Dividend_per_Share_Growth_per_Share(String fiveY_Dividend_per_Share_Growth_per_Share) {
        this.fiveY_Dividend_per_Share_Growth_per_Share = fiveY_Dividend_per_Share_Growth_per_Share;
    }

    public String getThreeY_Dividend_per_Share_Growth_per_Share() {
        return threeY_Dividend_per_Share_Growth_per_Share;
    }

    public void setThreeY_Dividend_per_Share_Growth_per_Share(String threeY_Dividend_per_Share_Growth_per_Share) {
        this.threeY_Dividend_per_Share_Growth_per_Share = threeY_Dividend_per_Share_Growth_per_Share;
    }

    public String getDividends_per_Share_Growth() {
        return Dividends_per_Share_Growth;
    }

    public void setDividends_per_Share_Growth(String dividends_per_Share_Growth) {
        Dividends_per_Share_Growth = dividends_per_Share_Growth;
    }
}

package team.crapplet.investment_assistant.Model;

public class Investments {


    private  String CodeName;
    private  int year;

    private String Long_term_investments;

    private String Short_term_investments;

    private String Cash_and_short_term_investments;

    private String Investment;

    private String Investment_purchases_and_sales;

    private String Invested_Capital;

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

    public String getLong_term_investments() {
        return Long_term_investments;
    }

    public void setLong_term_investments(String long_term_investments) {
        Long_term_investments = long_term_investments;
    }

    public String getShort_term_investments() {
        return Short_term_investments;
    }

    public void setShort_term_investments(String short_term_investments) {
        Short_term_investments = short_term_investments;
    }

    public String getCash_and_short_term_investments() {
        return Cash_and_short_term_investments;
    }

    public void setCash_and_short_term_investments(String cash_and_short_term_investments) {
        Cash_and_short_term_investments = cash_and_short_term_investments;
    }

    public String getInvestment() {
        return Investment;
    }

    public void setInvestment(String investment) {
        Investment = investment;
    }

    public String getInvestment_purchases_and_sales() {
        return Investment_purchases_and_sales;
    }

    public void setInvestment_purchases_and_sales(String investment_purchases_and_sales) {
        Investment_purchases_and_sales = investment_purchases_and_sales;
    }

    public String getInvested_Capital() {
        return Invested_Capital;
    }

    public void setInvested_Capital(String invested_Capital) {
        Invested_Capital = invested_Capital;
    }
}

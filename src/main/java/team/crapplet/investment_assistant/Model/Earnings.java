package team.crapplet.investment_assistant.Model;

public class Earnings {


    private  String CodeName;
    private  int year;
    private String Earnings_before_Tax;

    private String Earnings_Before_Tax_Margin;

    private String EBITDA;

    private String Earnings_Yield;

    private String ebtperEBIT;

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

    public String getEarnings_before_Tax() {
        return Earnings_before_Tax;
    }

    public void setEarnings_before_Tax(String earnings_before_Tax) {
        Earnings_before_Tax = earnings_before_Tax;
    }

    public String getEarnings_Before_Tax_Margin() {
        return Earnings_Before_Tax_Margin;
    }

    public void setEarnings_Before_Tax_Margin(String earnings_Before_Tax_Margin) {
        Earnings_Before_Tax_Margin = earnings_Before_Tax_Margin;
    }

    public String getEBITDA() {
        return EBITDA;
    }

    public void setEBITDA(String EBITDA) {
        this.EBITDA = EBITDA;
    }

    public String getEarnings_Yield() {
        return Earnings_Yield;
    }

    public void setEarnings_Yield(String earnings_Yield) {
        Earnings_Yield = earnings_Yield;
    }

    public String getEbtperEBIT() {
        return ebtperEBIT;
    }

    public void setEbtperEBIT(String ebtperEBIT) {
        this.ebtperEBIT = ebtperEBIT;
    }
}

package team.crapplet.investment_assistant.Model;

public class Returns {

    private  String CodeName;
    private  int year;

    private String ROE;
    private String returnOnAssets;

    private String returnOnEquity;

    private String returnOnCapitalEmployed;

    private String Return_on_Tangible_Assets;

    private String Return_On_Invested_Capital;

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

    public String getROE() {
        return ROE;
    }

    public void setROE(String ROE) {
        this.ROE = ROE;
    }

    public String getReturnOnAssets() {
        return returnOnAssets;
    }

    public void setReturnOnAssets(String returnOnAssets) {
        this.returnOnAssets = returnOnAssets;
    }

    public String getReturnOnEquity() {
        return returnOnEquity;
    }

    public void setReturnOnEquity(String returnOnEquity) {
        this.returnOnEquity = returnOnEquity;
    }

    public String getReturnOnCapitalEmployed() {
        return returnOnCapitalEmployed;
    }

    public void setReturnOnCapitalEmployed(String returnOnCapitalEmployed) {
        this.returnOnCapitalEmployed = returnOnCapitalEmployed;
    }

    public String getReturn_on_Tangible_Assets() {
        return Return_on_Tangible_Assets;
    }

    public void setReturn_on_Tangible_Assets(String return_on_Tangible_Assets) {
        Return_on_Tangible_Assets = return_on_Tangible_Assets;
    }

    public String getReturn_On_Invested_Capital() {
        return Return_On_Invested_Capital;
    }

    public void setReturn_On_Invested_Capital(String return_On_Invested_Capital) {
        Return_On_Invested_Capital = return_On_Invested_Capital;
    }
}

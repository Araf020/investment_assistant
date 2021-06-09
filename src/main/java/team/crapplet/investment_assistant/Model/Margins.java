package team.crapplet.investment_assistant.Model;

public class Margins {

    private  String CodeName;
    private  int year;

    private String Gross_Margin;

    private String EBITDA_Margin;

    private String EBIT_Margin;

    private String Profit_Margin;

    private String Net_Profit_Margin;

    private String grossProfitMargin;

    private String operatingProfitMargin;

    private String pretaxProfitMargin;

    private String netProfitMargin;


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

    public String getGross_Margin() {
        return Gross_Margin;
    }

    public void setGross_Margin(String gross_Margin) {
        Gross_Margin = gross_Margin;
    }

    public String getEBITDA_Margin() {
        return EBITDA_Margin;
    }

    public void setEBITDA_Margin(String EBITDA_Margin) {
        this.EBITDA_Margin = EBITDA_Margin;
    }

    public String getEBIT_Margin() {
        return EBIT_Margin;
    }

    public void setEBIT_Margin(String EBIT_Margin) {
        this.EBIT_Margin = EBIT_Margin;
    }

    public String getProfit_Margin() {
        return Profit_Margin;
    }

    public void setProfit_Margin(String profit_Margin) {
        Profit_Margin = profit_Margin;
    }

    public String getNet_Profit_Margin() {
        return Net_Profit_Margin;
    }

    public void setNet_Profit_Margin(String net_Profit_Margin) {
        Net_Profit_Margin = net_Profit_Margin;
    }

    public String getGrossProfitMargin() {
        return grossProfitMargin;
    }

    public void setGrossProfitMargin(String grossProfitMargin) {
        this.grossProfitMargin = grossProfitMargin;
    }

    public String getOperatingProfitMargin() {
        return operatingProfitMargin;
    }

    public void setOperatingProfitMargin(String operatingProfitMargin) {
        this.operatingProfitMargin = operatingProfitMargin;
    }

    public String getPretaxProfitMargin() {
        return pretaxProfitMargin;
    }

    public void setPretaxProfitMargin(String pretaxProfitMargin) {
        this.pretaxProfitMargin = pretaxProfitMargin;
    }

    public String getNetProfitMargin() {
        return netProfitMargin;
    }

    public void setNetProfitMargin(String netProfitMargin) {
        this.netProfitMargin = netProfitMargin;
    }
}

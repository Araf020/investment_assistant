package team.crapplet.investment_assistant.Model;

public class Averages {

    private  String CodeName;
    private  int year;
    private String Weighted_Average_Shs_Out;

    private String Weighted_Average_Shs_Out_Dil;

    private String Average_Receivables;

    private String Average_Payables;

    private String Average_Inventory;

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

    public String getWeighted_Average_Shs_Out() {
        return Weighted_Average_Shs_Out;
    }

    public void setWeighted_Average_Shs_Out(String weighted_Average_Shs_Out) {
        Weighted_Average_Shs_Out = weighted_Average_Shs_Out;
    }

    public String getWeighted_Average_Shs_Out_Dil() {
        return Weighted_Average_Shs_Out_Dil;
    }

    public void setWeighted_Average_Shs_Out_Dil(String weighted_Average_Shs_Out_Dil) {
        Weighted_Average_Shs_Out_Dil = weighted_Average_Shs_Out_Dil;
    }

    public String getAverage_Receivables() {
        return Average_Receivables;
    }

    public void setAverage_Receivables(String average_Receivables) {
        Average_Receivables = average_Receivables;
    }

    public String getAverage_Payables() {
        return Average_Payables;
    }

    public void setAverage_Payables(String average_Payables) {
        Average_Payables = average_Payables;
    }

    public String getAverage_Inventory() {
        return Average_Inventory;
    }

    public void setAverage_Inventory(String average_Inventory) {
        Average_Inventory = average_Inventory;
    }
}

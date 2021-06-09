package team.crapplet.investment_assistant.Model;

public class Liabilities {

    private  String CodeName;
    private  int year;
    private String Total_current_liabilities;

    private String Tax_Liabilities;

    private String Deposit_Liabilities;

    private String Total_non_current_liabilities;

    private String Total_liabilities;

    private String Other_Liabilities;

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

    public String getTotal_current_liabilities() {
        return Total_current_liabilities;
    }

    public void setTotal_current_liabilities(String total_current_liabilities) {
        Total_current_liabilities = total_current_liabilities;
    }

    public String getTax_Liabilities() {
        return Tax_Liabilities;
    }

    public void setTax_Liabilities(String tax_Liabilities) {
        Tax_Liabilities = tax_Liabilities;
    }

    public String getDeposit_Liabilities() {
        return Deposit_Liabilities;
    }

    public void setDeposit_Liabilities(String deposit_Liabilities) {
        Deposit_Liabilities = deposit_Liabilities;
    }

    public String getTotal_non_current_liabilities() {
        return Total_non_current_liabilities;
    }

    public void setTotal_non_current_liabilities(String total_non_current_liabilities) {
        Total_non_current_liabilities = total_non_current_liabilities;
    }

    public String getTotal_liabilities() {
        return Total_liabilities;
    }

    public void setTotal_liabilities(String total_liabilities) {
        Total_liabilities = total_liabilities;
    }

    public String getOther_Liabilities() {
        return Other_Liabilities;
    }

    public void setOther_Liabilities(String other_Liabilities) {
        Other_Liabilities = other_Liabilities;
    }
}

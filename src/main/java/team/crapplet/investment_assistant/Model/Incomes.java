package team.crapplet.investment_assistant.Model;

public class Incomes {


    private  String CodeName;
    private  int year;

    private String Operating_Income;

    private String Net_Income_Non_Controlling_int;

    private String Net_Income_Discontinued_ops;

    private String Net_Income;

    private String Net_Income_Com;

    private String Consolidated_Income;

    private String Other_comprehensive_income;

    private String Net_Income_per_Share;

    private String Income_Quality;

    private String nIperEBT;


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

    public String getOperating_Income() {
        return Operating_Income;
    }


    public void setOperating_Income(String operating_Income) {
        Operating_Income = operating_Income;
    }

    public String getNet_Income_Non_Controlling_int() {
        return Net_Income_Non_Controlling_int;
    }

    public void setNet_Income_Non_Controlling_int(String net_Income_Non_Controlling_int) {
        Net_Income_Non_Controlling_int = net_Income_Non_Controlling_int;
    }

    public String getNet_Income_Discontinued_ops() {
        return Net_Income_Discontinued_ops;
    }

    public void setNet_Income_Discontinued_ops(String net_Income_Discontinued_ops) {
        Net_Income_Discontinued_ops = net_Income_Discontinued_ops;
    }

    public String getNet_Income() {
        return Net_Income;
    }

    public void setNet_Income(String net_Income) {
        Net_Income = net_Income;
    }

    public String getNet_Income_Com() {
        return Net_Income_Com;
    }

    public void setNet_Income_Com(String net_Income_Com) {
        Net_Income_Com = net_Income_Com;
    }

    public String getConsolidated_Income() {
        return Consolidated_Income;
    }

    public void setConsolidated_Income(String consolidated_Income) {
        Consolidated_Income = consolidated_Income;
    }

    public String getOther_comprehensive_income() {
        return Other_comprehensive_income;
    }

    public void setOther_comprehensive_income(String other_comprehensive_income) {
        Other_comprehensive_income = other_comprehensive_income;
    }

    public String getNet_Income_per_Share() {
        return Net_Income_per_Share;
    }

    public void setNet_Income_per_Share(String net_Income_per_Share) {
        Net_Income_per_Share = net_Income_per_Share;
    }

    public String getIncome_Quality() {
        return Income_Quality;
    }

    public void setIncome_Quality(String income_Quality) {
        Income_Quality = income_Quality;
    }

    public String getnIperEBT() {
        return nIperEBT;
    }

    public void setnIperEBT(String nIperEBT) {
        this.nIperEBT = nIperEBT;
    }
}

package team.crapplet.investment_assistant.Model;

public class Debts {


    private  String CodeName;
    private  int year;
    private String Short_term_debt;

    private String Long_term_debt;

    private String Total_debt;

    private String Net_Debt;

    private String Issuance_repayment_of_debt;

    private String longtermDebtToCapitalization;

    private String totalDebtToCapitalization;

    private String Debt_to_Equity;

    private String Debt_to_Assets;

    private String Net_Debt_to_EBITDA;

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

    public String getShort_term_debt() {
        return Short_term_debt;
    }

    public void setShort_term_debt(String short_term_debt) {
        Short_term_debt = short_term_debt;
    }

    public String getLong_term_debt() {
        return Long_term_debt;
    }

    public void setLong_term_debt(String long_term_debt) {
        Long_term_debt = long_term_debt;
    }

    public String getTotal_debt() {
        return Total_debt;
    }

    public void setTotal_debt(String total_debt) {
        Total_debt = total_debt;
    }

    public String getNet_Debt() {
        return Net_Debt;
    }

    public void setNet_Debt(String net_Debt) {
        Net_Debt = net_Debt;
    }

    public String getIssuance_repayment_of_debt() {
        return Issuance_repayment_of_debt;
    }

    public void setIssuance_repayment_of_debt(String issuance_repayment_of_debt) {
        Issuance_repayment_of_debt = issuance_repayment_of_debt;
    }

    public String getLongtermDebtToCapitalization() {
        return longtermDebtToCapitalization;
    }

    public void setLongtermDebtToCapitalization(String longtermDebtToCapitalization) {
        this.longtermDebtToCapitalization = longtermDebtToCapitalization;
    }

    public String getTotalDebtToCapitalization() {
        return totalDebtToCapitalization;
    }

    public void setTotalDebtToCapitalization(String totalDebtToCapitalization) {
        this.totalDebtToCapitalization = totalDebtToCapitalization;
    }

    public String getDebt_to_Equity() {
        return Debt_to_Equity;
    }

    public void setDebt_to_Equity(String debt_to_Equity) {
        Debt_to_Equity = debt_to_Equity;
    }

    public String getDebt_to_Assets() {
        return Debt_to_Assets;
    }

    public void setDebt_to_Assets(String debt_to_Assets) {
        Debt_to_Assets = debt_to_Assets;
    }

    public String getNet_Debt_to_EBITDA() {
        return Net_Debt_to_EBITDA;
    }

    public void setNet_Debt_to_EBITDA(String net_Debt_to_EBITDA) {
        Net_Debt_to_EBITDA = net_Debt_to_EBITDA;
    }
}

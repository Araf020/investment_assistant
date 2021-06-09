package team.crapplet.investment_assistant.Model;

public class Expenses {

    private  String CodeName;
    private  int year;
    private String R_D_Expenses;
    private String SG_A_Expense;
    private String Operating_Expenses;
    private String Interest_Expense;
    private String Income_Tax_Expense;
    private String R_D_Expense_Growth;
    private String SG_A_Expenses_Growth;


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

    public String getR_D_Expenses() {
        return R_D_Expenses;
    }

    public void setR_D_Expenses(String r_D_Expenses) {
        R_D_Expenses = r_D_Expenses;
    }

    public String getSG_A_Expense() {
        return SG_A_Expense;
    }

    public void setSG_A_Expense(String SG_A_Expense) {
        this.SG_A_Expense = SG_A_Expense;
    }

    public String getOperating_Expenses() {
        return Operating_Expenses;
    }

    public void setOperating_Expenses(String operating_Expenses) {
        Operating_Expenses = operating_Expenses;
    }

    public String getInterest_Expense() {
        return Interest_Expense;
    }

    public void setInterest_Expense(String interest_Expense) {
        Interest_Expense = interest_Expense;
    }

    public String getIncome_Tax_Expense() {
        return Income_Tax_Expense;
    }

    public void setIncome_Tax_Expense(String income_Tax_Expense) {
        Income_Tax_Expense = income_Tax_Expense;
    }

    public String getR_D_Expense_Growth() {
        return R_D_Expense_Growth;
    }

    public void setR_D_Expense_Growth(String r_D_Expense_Growth) {
        R_D_Expense_Growth = r_D_Expense_Growth;
    }

    public String getSG_A_Expenses_Growth() {
        return SG_A_Expenses_Growth;
    }

    public void setSG_A_Expenses_Growth(String SG_A_Expenses_Growth) {
        this.SG_A_Expenses_Growth = SG_A_Expenses_Growth;
    }


}

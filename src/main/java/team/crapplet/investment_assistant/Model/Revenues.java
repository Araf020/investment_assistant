package team.crapplet.investment_assistant.Model;

public class Revenues {

    private  String CodeName;
    private  int year;

    private String Cost_of_Revenue;

    private String Revenue;

    private String Deferred_revenue;

    private String ebitperRevenue;

    private String eBITperRevenue;

    private String Revenue_per_Share;

    private String SG_A_to_Revenue;

    private String R_D_to_Revenue;

    private String Capex_to_Revenue;

    private String Stock_based_compensation_to_Revenue;

    public String getCodeName() {
        return CodeName;
    }

    public Revenues setCodeName(String codeName) {
        CodeName = codeName;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Revenues setYear(int year) {
        this.year = year;
        return this;
    }

    public String getCost_of_Revenue() {
        return Cost_of_Revenue;
    }

    public Revenues setCost_of_Revenue(String cost_of_Revenue) {
        Cost_of_Revenue = cost_of_Revenue;
        return this;
    }

    public String getRevenue() {
        return Revenue;
    }

    public Revenues setRevenue(String revenue) {
        Revenue = revenue;
        return this;
    }

    public String getDeferred_revenue() {
        return Deferred_revenue;
    }

    public Revenues setDeferred_revenue(String deferred_revenue) {
        Deferred_revenue = deferred_revenue;
        return this;
    }

    public String getEbitperRevenue() {
        return ebitperRevenue;
    }

    public Revenues setEbitperRevenue(String ebitperRevenue) {
        this.ebitperRevenue = ebitperRevenue;
        return this;
    }

    public String geteBITperRevenue() {
        return eBITperRevenue;
    }

    public Revenues seteBITperRevenue(String eBITperRevenue) {
        this.eBITperRevenue = eBITperRevenue;
        return this;
    }

    public String getRevenue_per_Share() {
        return Revenue_per_Share;
    }

    public Revenues setRevenue_per_Share(String revenue_per_Share) {
        Revenue_per_Share = revenue_per_Share;
        return this;
    }

    public String getSG_A_to_Revenue() {
        return SG_A_to_Revenue;
    }

    public Revenues setSG_A_to_Revenue(String SG_A_to_Revenue) {
        this.SG_A_to_Revenue = SG_A_to_Revenue;
        return this;
    }

    public String getR_D_to_Revenue() {
        return R_D_to_Revenue;
    }

    public Revenues setR_D_to_Revenue(String r_D_to_Revenue) {
        R_D_to_Revenue = r_D_to_Revenue;
        return this;
    }

    public String getCapex_to_Revenue() {
        return Capex_to_Revenue;
    }

    public Revenues setCapex_to_Revenue(String capex_to_Revenue) {
        Capex_to_Revenue = capex_to_Revenue;
        return this;
    }

    public String getStock_based_compensation_to_Revenue() {
        return Stock_based_compensation_to_Revenue;
    }

    public Revenues setStock_based_compensation_to_Revenue(String stock_based_compensation_to_Revenue) {
        Stock_based_compensation_to_Revenue = stock_based_compensation_to_Revenue;
        return this;
    }
}

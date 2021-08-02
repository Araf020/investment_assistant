package team.crapplet.investment_assistant.Model;

import javax.persistence.*;

@Entity
@Table(name = "growths")
@IdClass(MakeCompositeKey.class)
public class Growths {

    @Id
    @Column(name = "code_name")
    private  String CodeName;
    @Id
    private  int year;
    private double Revenue_Growth;


    private double Gross_Profit_Growth;

    private double EBIT_Growth;

    private double Operating_Income_Growth;

    private double Net_Income_Growth;

    private double EPS_Growth;

    private double EPS_Diluted_Growth;

    private double Weighted_Average_Shares_Growth;

    private double Weighted_Average_Shares_Diluted_Growth;

    private double Operating_Cash_Flow_growth;

    private double Free_Cash_Flow_growth;


    private double Receivables_growth;

    private double Inventory_Growth;

    private double Asset_Growth;


    private double Debt_Growth;

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

    public double getRevenue_Growth() {
        return Revenue_Growth;
    }

    public void setRevenue_Growth(double revenue_Growth) {
        Revenue_Growth = revenue_Growth;
    }



    public double getGross_Profit_Growth() {
        return Gross_Profit_Growth;
    }

    public void setGross_Profit_Growth(double gross_Profit_Growth) {
        Gross_Profit_Growth = gross_Profit_Growth;
    }

    public double getEBIT_Growth() {
        return EBIT_Growth;
    }

    public void setEBIT_Growth(double EBIT_Growth) {
        this.EBIT_Growth = EBIT_Growth;
    }

    public double getOperating_Income_Growth() {
        return Operating_Income_Growth;
    }

    public void setOperating_Income_Growth(double operating_Income_Growth) {
        Operating_Income_Growth = operating_Income_Growth;
    }

    public double getNet_Income_Growth() {
        return Net_Income_Growth;
    }

    public void setNet_Income_Growth(double net_Income_Growth) {
        Net_Income_Growth = net_Income_Growth;
    }

    public double getEPS_Growth() {
        return EPS_Growth;
    }

    public void setEPS_Growth(double EPS_Growth) {
        this.EPS_Growth = EPS_Growth;
    }

    public double getEPS_Diluted_Growth() {
        return EPS_Diluted_Growth;
    }

    public void setEPS_Diluted_Growth(double EPS_Diluted_Growth) {
        this.EPS_Diluted_Growth = EPS_Diluted_Growth;
    }

    public double getWeighted_Average_Shares_Growth() {
        return Weighted_Average_Shares_Growth;
    }

    public void setWeighted_Average_Shares_Growth(double weighted_Average_Shares_Growth) {
        Weighted_Average_Shares_Growth = weighted_Average_Shares_Growth;
    }

    public double getWeighted_Average_Shares_Diluted_Growth() {
        return Weighted_Average_Shares_Diluted_Growth;
    }

    public void setWeighted_Average_Shares_Diluted_Growth(double weighted_Average_Shares_Diluted_Growth) {
        Weighted_Average_Shares_Diluted_Growth = weighted_Average_Shares_Diluted_Growth;
    }

    public double getOperating_Cash_Flow_growth() {
        return Operating_Cash_Flow_growth;
    }

    public void setOperating_Cash_Flow_growth(double operating_Cash_Flow_growth) {
        Operating_Cash_Flow_growth = operating_Cash_Flow_growth;
    }

    public double getFree_Cash_Flow_growth() {
        return Free_Cash_Flow_growth;
    }

    public void setFree_Cash_Flow_growth(double free_Cash_Flow_growth) {
        Free_Cash_Flow_growth = free_Cash_Flow_growth;
    }

    public double getReceivables_growth() {
        return Receivables_growth;
    }

    public void setReceivables_growth(double receivables_growth) {
        Receivables_growth = receivables_growth;
    }

    public double getInventory_Growth() {
        return Inventory_Growth;
    }

    public void setInventory_Growth(double inventory_Growth) {
        Inventory_Growth = inventory_Growth;
    }

    public double getAsset_Growth() {
        return Asset_Growth;
    }

    public void setAsset_Growth(double asset_Growth) {
        Asset_Growth = asset_Growth;
    }

    public double getDebt_Growth() {
        return Debt_Growth;
    }

    public void setDebt_Growth(double debt_Growth) {
        Debt_Growth = debt_Growth;
    }
}

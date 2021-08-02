package team.crapplet.investment_assistant.Model;

import javax.persistence.*;


@IdClass(MakeCompositeKey.class)
@Entity
@Table(name = "averages")

public class Averages {

    @Id
    @Column(name = "code_name")
    private  String CodeName;
    @Id
    private  int year;


    @Column(name = "weighted_average_shs_out")
    private double Weighted_Average_Shs_Out;

    @Column(name = "weighted_average_shs_dil")
    private double Weighted_Average_Shs_Out_Dil;

    @Column(name = "average_receivables")
    private double Average_Receivables;

    @Column(name = "average_payables")
    private double Average_Payables;

    @Column(name = "average_inventory")
    private double Average_Inventory;

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

    public double getWeighted_Average_Shs_Out() {
        return Weighted_Average_Shs_Out;
    }

    public void setWeighted_Average_Shs_Out(double weighted_Average_Shs_Out) {
        Weighted_Average_Shs_Out = weighted_Average_Shs_Out;
    }

    public double getWeighted_Average_Shs_Out_Dil() {
        return Weighted_Average_Shs_Out_Dil;
    }

    public void setWeighted_Average_Shs_Out_Dil(double weighted_Average_Shs_Out_Dil) {
        Weighted_Average_Shs_Out_Dil = weighted_Average_Shs_Out_Dil;
    }

    public double getAverage_Receivables() {
        return Average_Receivables;
    }

    public void setAverage_Receivables(double average_Receivables) {
        Average_Receivables = average_Receivables;
    }

    public double getAverage_Payables() {
        return Average_Payables;
    }

    public void setAverage_Payables(double average_Payables) {
        Average_Payables = average_Payables;
    }

    public double getAverage_Inventory() {
        return Average_Inventory;
    }

    public void setAverage_Inventory(double average_Inventory) {
        Average_Inventory = average_Inventory;
    }
}

package team.crapplet.investment_assistant.Model;

import javax.persistence.*;

@Entity
@Table(name="earnings")
//@IdClass(MakeCompositeKey.class)
public class Earnings {


    @Id
    @Column(name = "code_name")
    private  String CodeName;

//    @Id
    private  int year;

    @Column(name="earnings_before_Tax")
    private double Earnings_before_Tax;

    @Column(name = "earnings_before_tax_margin")
    private double Earnings_Before_Tax_Margin;

    @Column(name = "ebitda")
    private double EBITDA;

    @Column(name = "earnings_yield")
    private double Earnings_Yield;

    @Column(name = "ebt_per_ebit")
    private double ebtperEBIT;


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


    public double getEarnings_before_Tax() {
        return Earnings_before_Tax;
    }

    public void setEarnings_before_Tax(double earnings_before_Tax) {
        Earnings_before_Tax = earnings_before_Tax;
    }

    public double getEarnings_Before_Tax_Margin() {
        return Earnings_Before_Tax_Margin;
    }

    public void setEarnings_Before_Tax_Margin(double earnings_Before_Tax_Margin) {
        Earnings_Before_Tax_Margin = earnings_Before_Tax_Margin;
    }

    public double getEBITDA() {
        return EBITDA;
    }

    public void setEBITDA(double EBITDA) {
        this.EBITDA = EBITDA;
    }

    public double getEarnings_Yield() {
        return Earnings_Yield;
    }

    public void setEarnings_Yield(double earnings_Yield) {
        Earnings_Yield = earnings_Yield;
    }

    public double getEbtperEBIT() {
        return ebtperEBIT;
    }

    public void setEbtperEBIT(double ebtperEBIT) {
        this.ebtperEBIT = ebtperEBIT;
    }
}

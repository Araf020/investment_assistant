package team.crapplet.investment_assistant.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "values")

public class Values {


    @Id
    @Column(name = "code_name")
    private  String comapny_code;
    @Column(name = "year")
    private  int year;

    @Column(name = "enterprise_value_multiple")
    private Double enterpriseValueMultiple;

    @Column(name = "price_fair_value")
    private Double priceFairValue;

    @Column(name = "enterprise_value")
    private Double Enterprise_Value;

    @Column(name = "enterprise_value_over_EBITDA")
    private Double Enterprise_Value_over_EBITDA;

    @Column(name = "tangible_asset_value")
    private Double Tangible_Asset_Value;

    @Column(name = "net_current_asset_value")
    private Double Net_Current_Asset_Value;


    public  Values(){}
    public Values(String codeName, int year) {
        comapny_code = codeName;
        this.year = year;
    }

    public String getcomapny_code() {
        return comapny_code;
    }

    public Values setcomapny_code(String codeName) {
        comapny_code = codeName;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Values setYear(int year) {
        this.year = year;
        return this;
    }

    public Double getEnterpriseValueMultiple() {
        return enterpriseValueMultiple;
    }

    public Values setEnterpriseValueMultiple(Double enterpriseValueMultiple) {
        this.enterpriseValueMultiple = enterpriseValueMultiple;
        return this;
    }

    public Double getPriceFairValue() {
        return priceFairValue;
    }

    public Values setPriceFairValue(Double priceFairValue) {
        this.priceFairValue = priceFairValue;
        return this;
    }

    public Double getEnterprise_Value() {
        return Enterprise_Value;
    }

    public Values setEnterprise_Value(Double enterprise_Value) {
        Enterprise_Value = enterprise_Value;
        return this;
    }

    public Double getEnterprise_Value_over_EBITDA() {
        return Enterprise_Value_over_EBITDA;
    }

    public Values setEnterprise_Value_over_EBITDA(Double enterprise_Value_over_EBITDA) {
        Enterprise_Value_over_EBITDA = enterprise_Value_over_EBITDA;
        return this;
    }

    public Double getTangible_Asset_Value() {
        return Tangible_Asset_Value;
    }

    public Values setTangible_Asset_Value(Double tangible_Asset_Value) {
        Tangible_Asset_Value = tangible_Asset_Value;
        return this;
    }

    public Double getNet_Current_Asset_Value() {
        return Net_Current_Asset_Value;
    }

    public Values setNet_Current_Asset_Value(Double net_Current_Asset_Value) {
        Net_Current_Asset_Value = net_Current_Asset_Value;
        return this;
    }


    @Override
    public String toString() {
        return "Values{" +
                "comapny_code='" + comapny_code + '\'' +
                ", year=" + year +
                '}';
    }
}

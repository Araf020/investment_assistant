package team.crapplet.investment_assistant.Model;

public class Values {


    private  String CodeName;
    private  int year;

    private String enterpriseValueMultiple;

    private String priceFairValue;

    private String Enterprise_Value;

    private String Enterprise_Value_over_EBITDA;

    private String Tangible_Asset_Value;

    private String Net_Current_Asset_Value;

    public String getCodeName() {
        return CodeName;
    }

    public Values setCodeName(String codeName) {
        CodeName = codeName;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Values setYear(int year) {
        this.year = year;
        return this;
    }

    public String getEnterpriseValueMultiple() {
        return enterpriseValueMultiple;
    }

    public Values setEnterpriseValueMultiple(String enterpriseValueMultiple) {
        this.enterpriseValueMultiple = enterpriseValueMultiple;
        return this;
    }

    public String getPriceFairValue() {
        return priceFairValue;
    }

    public Values setPriceFairValue(String priceFairValue) {
        this.priceFairValue = priceFairValue;
        return this;
    }

    public String getEnterprise_Value() {
        return Enterprise_Value;
    }

    public Values setEnterprise_Value(String enterprise_Value) {
        Enterprise_Value = enterprise_Value;
        return this;
    }

    public String getEnterprise_Value_over_EBITDA() {
        return Enterprise_Value_over_EBITDA;
    }

    public Values setEnterprise_Value_over_EBITDA(String enterprise_Value_over_EBITDA) {
        Enterprise_Value_over_EBITDA = enterprise_Value_over_EBITDA;
        return this;
    }

    public String getTangible_Asset_Value() {
        return Tangible_Asset_Value;
    }

    public Values setTangible_Asset_Value(String tangible_Asset_Value) {
        Tangible_Asset_Value = tangible_Asset_Value;
        return this;
    }

    public String getNet_Current_Asset_Value() {
        return Net_Current_Asset_Value;
    }

    public Values setNet_Current_Asset_Value(String net_Current_Asset_Value) {
        Net_Current_Asset_Value = net_Current_Asset_Value;
        return this;
    }
}

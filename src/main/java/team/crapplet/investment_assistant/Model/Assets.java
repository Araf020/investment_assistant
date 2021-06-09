package team.crapplet.investment_assistant.Model;

public class Assets {

    private  String CodeName;
    private  int year;

    private String Total_current_assets;

    private String Tax_assets;

    private String Total_non_current_assets;

    private String Total_assets;

    private String Other_Assets;

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

    public String getTotal_current_assets() {
        return Total_current_assets;
    }

    public void setTotal_current_assets(String total_current_assets) {
        Total_current_assets = total_current_assets;
    }

    public String getTax_assets() {
        return Tax_assets;
    }

    public void setTax_assets(String tax_assets) {
        Tax_assets = tax_assets;
    }

    public String getTotal_non_current_assets() {
        return Total_non_current_assets;
    }

    public void setTotal_non_current_assets(String total_non_current_assets) {
        Total_non_current_assets = total_non_current_assets;
    }

    public String getTotal_assets() {
        return Total_assets;
    }

    public void setTotal_assets(String total_assets) {
        Total_assets = total_assets;
    }

    public String getOther_Assets() {
        return Other_Assets;
    }

    public void setOther_Assets(String other_Assets) {
        Other_Assets = other_Assets;
    }
}

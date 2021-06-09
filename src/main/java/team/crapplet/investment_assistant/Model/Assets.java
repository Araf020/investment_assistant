package team.crapplet.investment_assistant.Model;

public class Assets {

    private  String CodeName;
    private  int year;

    private Double Total_current_assets;

    private Double Tax_assets;

    private Double Total_non_current_assets;

    private Double Total_assets;

    private Double Other_Assets;

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

    public Double getTotal_current_assets() {
        return Total_current_assets;
    }

    public void setTotal_current_assets(Double total_current_assets) {
        Total_current_assets = total_current_assets;
    }

    public Double getTax_assets() {
        return Tax_assets;
    }

    public void setTax_assets(Double tax_assets) {
        Tax_assets = tax_assets;
    }

    public Double getTotal_non_current_assets() {
        return Total_non_current_assets;
    }

    public void setTotal_non_current_assets(Double total_non_current_assets) {
        Total_non_current_assets = total_non_current_assets;
    }

    public Double getTotal_assets() {
        return Total_assets;
    }

    public void setTotal_assets(Double total_assets) {
        Total_assets = total_assets;
    }

    public Double getOther_Assets() {
        return Other_Assets;
    }

    public void setOther_Assets(Double other_Assets) {
        Other_Assets = other_Assets;
    }
}

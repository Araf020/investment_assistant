package team.crapplet.investment_assistant.Model;

public class TurnOvers {

    private  String CodeName;
    private  int year;

    private String fixedAssetTurnover;

    private String payablesTurnover;

    private String inventoryTurnover;

    private String Receivables_Turnover;

    private String Payables_Turnover;

    private String Inventory_Turnover;

    private String assetTurnover;

    public String getCodeName() {
        return CodeName;
    }

    public TurnOvers setCodeName(String codeName) {
        CodeName = codeName;
        return this;
    }

    public int getYear() {
        return year;
    }

    public TurnOvers setYear(int year) {
        this.year = year;
        return this;
    }

    public String getFixedAssetTurnover() {
        return fixedAssetTurnover;
    }

    public TurnOvers setFixedAssetTurnover(String fixedAssetTurnover) {
        this.fixedAssetTurnover = fixedAssetTurnover;
        return this;
    }

    public String getPayablesTurnover() {
        return payablesTurnover;
    }

    public TurnOvers setPayablesTurnover(String payablesTurnover) {
        this.payablesTurnover = payablesTurnover;
        return this;
    }

    public String getInventoryTurnover() {
        return inventoryTurnover;
    }

    public TurnOvers setInventoryTurnover(String inventoryTurnover) {
        this.inventoryTurnover = inventoryTurnover;
        return this;
    }

    public String getReceivables_Turnover() {
        return Receivables_Turnover;
    }

    public TurnOvers setReceivables_Turnover(String receivables_Turnover) {
        Receivables_Turnover = receivables_Turnover;
        return this;
    }

    public String getPayables_Turnover() {
        return Payables_Turnover;
    }

    public TurnOvers setPayables_Turnover(String payables_Turnover) {
        Payables_Turnover = payables_Turnover;
        return this;
    }

    public String getInventory_Turnover() {
        return Inventory_Turnover;
    }

    public TurnOvers setInventory_Turnover(String inventory_Turnover) {
        Inventory_Turnover = inventory_Turnover;
        return this;
    }

    public String getAssetTurnover() {
        return assetTurnover;
    }

    public TurnOvers setAssetTurnover(String assetTurnover) {
        this.assetTurnover = assetTurnover;
        return this;
    }
}

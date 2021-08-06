package team.crapplet.investment_assistant.Model;


import java.io.Serializable;

public class MakeCompositeKey implements Serializable {

    private String CodeName;
    private int year;

    public MakeCompositeKey() {
    }

    public MakeCompositeKey(String CodeName, int year) {
        this.CodeName = CodeName;
        this.year = year;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

package team.crapplet.investment_assistant.Model;

import javax.persistence.*;

@Entity
@Table(name = "sector")
public class Sector {
    @Id
    @Column(name = "code_name")
    String CodeName;
    @Column(name = "sector_name")
    String sectorName;

    public String getCodeName() {
        return CodeName;
    }

    public Sector setCodeName(String codeName) {
        CodeName = codeName;
        return this;
    }

    public String getSectorName() {
        return sectorName;
    }

    public Sector setSectorName(String sectorName) {
        this.sectorName = sectorName;
        return this;
    }
}

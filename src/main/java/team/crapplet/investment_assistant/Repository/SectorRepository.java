package team.crapplet.investment_assistant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import team.crapplet.investment_assistant.Model.Sector;

public interface SectorRepository extends JpaRepository<Sector, String> {
}

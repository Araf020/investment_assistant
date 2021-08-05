package team.crapplet.investment_assistant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import team.crapplet.investment_assistant.Model.Growths;

public interface GrowthRepository extends JpaRepository<Growths, String> {

}

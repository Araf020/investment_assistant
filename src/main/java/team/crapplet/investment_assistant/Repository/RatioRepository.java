package team.crapplet.investment_assistant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import team.crapplet.investment_assistant.Model.Ratios;

@Repository
public interface RatioRepository extends JpaRepository<Ratios, String> {

}

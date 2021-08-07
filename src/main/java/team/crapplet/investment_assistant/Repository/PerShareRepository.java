package team.crapplet.investment_assistant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import team.crapplet.investment_assistant.Model.MakeCompositeKey;
import team.crapplet.investment_assistant.Model.PerShare;

public interface PerShareRepository extends JpaRepository<PerShare, String> {

}

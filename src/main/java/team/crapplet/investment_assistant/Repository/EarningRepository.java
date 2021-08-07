package team.crapplet.investment_assistant.Repository;

import org.springframework.data.repository.CrudRepository;
import team.crapplet.investment_assistant.Model.Earnings;

public interface EarningRepository extends CrudRepository<Earnings, String> {

}

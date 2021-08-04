package team.crapplet.investment_assistant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import team.crapplet.investment_assistant.Model.Values;

public interface ValueRepository extends JpaRepository<Values, String> {

//    Values getByComapny_code(String company_code);
}

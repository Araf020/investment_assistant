package team.crapplet.investment_assistant.Repository;

import org.springframework.data.repository.CrudRepository;
import team.crapplet.investment_assistant.Model.User;
import team.crapplet.investment_assistant.Model.Values;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User,  Long> {
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}

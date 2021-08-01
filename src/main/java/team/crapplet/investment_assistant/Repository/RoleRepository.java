package team.crapplet.investment_assistant.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import team.crapplet.investment_assistant.Model.ERole;
import team.crapplet.investment_assistant.Model.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}

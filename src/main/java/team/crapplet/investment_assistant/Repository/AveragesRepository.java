package team.crapplet.investment_assistant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import team.crapplet.investment_assistant.Model.Averages;

public interface AveragesRepository extends JpaRepository<Averages, String> {

}

package team.crapplet.investment_assistant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import team.crapplet.investment_assistant.Model.PerShare;

import java.util.List;

public interface PerShareRepository extends JpaRepository<PerShare, String> {

//    @Query(value = "select new team.crapplet.investment_assistant.Repository.Name_EPS(e.CodeName, e.Earnings_Per_Share) from PerShare e order by e.Earnings_Per_Share DESC")

    @Query(value = "select code_name,avg(earnings_per_share) as earnings_per_share  from per_share group by code_name order by earnings_per_share desc",nativeQuery = true)
    public List<Name_EPS> getEPSandName();


}

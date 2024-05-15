package prj321x.assignment2.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import prj321x.assignment2.backend.entities.companies.Company;

import java.util.Optional;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
    @Query("select c from Company c join Recruitment r on c.id = r.company.id group by c.id order by count(r.id) " +
            "limit 1")
    Optional<Company> findByMostRecruitments();
}
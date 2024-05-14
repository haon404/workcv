package prj321x.assignment2.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import prj321x.assignment2.backend.entities.companies.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
}
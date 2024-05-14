package prj321x.assignment2.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import prj321x.assignment2.backend.entities.recruitments.Recruitment;

public interface RecruitmentRepository extends JpaRepository<Recruitment, Integer> {
}
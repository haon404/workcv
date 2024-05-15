package prj321x.assignment2.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import prj321x.assignment2.backend.entities.recruitments.Recruitment;

import java.util.Optional;

public interface RecruitmentRepository extends JpaRepository<Recruitment, Integer> {
    @Query("select r from Recruitment r join RecruitmentApply ra on r.id = ra.recruitment.id group by r.id order by " +
            "count(ra.id) limit 1")
    Optional<Recruitment> findByMostApplies();
}
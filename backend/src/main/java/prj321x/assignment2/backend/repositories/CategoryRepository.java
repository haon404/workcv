package prj321x.assignment2.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import prj321x.assignment2.backend.entities.recruitments.Category;

import java.util.Set;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    @Query("select c from Category c join RecruitmentCategory rc on c.id = rc.categories.id group by c.id order " +
            "by " +
            "count(rc.id) limit 4")
    Set<Category> findByMostRecruitment();
}
package prj321x.assignment2.backend.entities.utils;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import prj321x.assignment2.backend.entities.recruitments.Category;
import prj321x.assignment2.backend.entities.recruitments.Recruitment;

@Getter
@Setter
@Entity
@Table(name = "recruitment_categories")
public class RecruitmentCategory {
    @EmbeddedId
    private RecruitmentCategoryId id;
    
    @MapsId("categoriesId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "categories_id", nullable = false)
    private Category categories;
    
    @MapsId("recruitmentId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "recruitment_id", nullable = false)
    private Recruitment recruitment;
    
}
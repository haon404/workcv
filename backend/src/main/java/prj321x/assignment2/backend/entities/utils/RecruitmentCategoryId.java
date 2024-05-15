package prj321x.assignment2.backend.entities.utils;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class RecruitmentCategoryId implements Serializable {
    @Serial
    private static final long serialVersionUID = -1636148838814856211L;
    @NotNull
    @Column(name = "categories_id", nullable = false)
    private Integer categoriesId;
    
    @NotNull
    @Column(name = "recruitment_id", nullable = false)
    private Integer recruitmentId;
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RecruitmentCategoryId entity = (RecruitmentCategoryId) o;
        return Objects.equals(this.categoriesId, entity.categoriesId) &&
                Objects.equals(this.recruitmentId, entity.recruitmentId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(categoriesId, recruitmentId);
    }
    
}
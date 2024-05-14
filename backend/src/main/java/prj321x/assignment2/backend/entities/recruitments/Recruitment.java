package prj321x.assignment2.backend.entities.recruitments;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.proxy.HibernateProxy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import prj321x.assignment2.backend.entities.companies.Company;

import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@Entity
@ToString
@RequiredArgsConstructor
@Table(name = "recruitment")
@EntityListeners(AuditingEntityListener.class)
public class Recruitment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    
    @Column(name = "address", nullable = false)
    private String address;
    
    @CreatedDate
    @Column(name = "created_date")
    private LocalDateTime createdDate;
    
    @Column(name = "description", nullable = false)
    private String description;
    
    @Column(name = "experience", nullable = false)
    private String experience;
    
    @Column(name = "recruit_quantity", nullable = false)
    private Integer recruitQuantity;
    
    @Column(name = "salary", nullable = false)
    private String salary;
    
    @Column(name = "title", nullable = false)
    private String title;
    
    @Column(name = "due_date", nullable = false)
    private String dueDate;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;
    
    @OneToMany(mappedBy = "recruitment", orphanRemoval = true)
    private Set<RecruitmentApply> recruitmentApplies = new LinkedHashSet<>();
    
    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Recruitment that = (Recruitment) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }
    
    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
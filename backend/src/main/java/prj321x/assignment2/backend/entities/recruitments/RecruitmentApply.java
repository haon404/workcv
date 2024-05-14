package prj321x.assignment2.backend.entities.recruitments;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import prj321x.assignment2.backend.entities.users.Cv;
import prj321x.assignment2.backend.entities.users.User;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "recruitment_apply")
@EntityListeners(AuditingEntityListener.class)
public class RecruitmentApply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    
    @CreatedDate
    @Column(name = "created_date")
    private LocalDateTime createdDate;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "recruitment_id", nullable = false)
    private Recruitment recruitment;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "cv_id", nullable = false)
    private Cv cv;
    
    @Column(name = "status", nullable = false)
    private Integer status;
    
}
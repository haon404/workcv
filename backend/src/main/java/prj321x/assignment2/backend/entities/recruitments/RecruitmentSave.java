package prj321x.assignment2.backend.entities.recruitments;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import prj321x.assignment2.backend.entities.users.User;

@Getter
@Setter
@Entity
@Table(name = "recruitment_save")
public class RecruitmentSave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "recruitment_id", nullable = false)
    private Recruitment recruitment;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    
}
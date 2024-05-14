package prj321x.assignment2.backend.entities.companies;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import prj321x.assignment2.backend.entities.users.User;

@Getter
@Setter
@Entity
@Table(name = "company_follow")
public class CompanyFollow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    
}
package prj321x.assignment2.backend.entities.companies;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import prj321x.assignment2.backend.entities.recruitments.Recruitment;
import prj321x.assignment2.backend.entities.users.User;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    
    @Column(name = "address", nullable = false)
    private String address;
    
    @Column(name = "description", nullable = false)
    private String description;
    
    @Column(name = "email", nullable = false)
    private String email;
    
    @Column(name = "logo", nullable = false)
    private String logo;
    
    @Column(name = "name", nullable = false)
    private String name;
    
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;
    
    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Set<Recruitment> recruitments = new LinkedHashSet<>();
    
    @OneToMany(mappedBy = "company", orphanRemoval = true, fetch = FetchType.LAZY)
    private Set<CompanyFollow> companyFollows = new LinkedHashSet<>();
    
    @OneToMany(mappedBy = "company", orphanRemoval = true, fetch = FetchType.LAZY)
    private Set<User> recruiters = new LinkedHashSet<>();
    
}
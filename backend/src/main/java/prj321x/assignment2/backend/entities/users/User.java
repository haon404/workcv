package prj321x.assignment2.backend.entities.users;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import prj321x.assignment2.backend.entities.companies.Company;
import prj321x.assignment2.backend.entities.companies.CompanyFollow;
import prj321x.assignment2.backend.entities.recruitments.RecruitmentApply;
import prj321x.assignment2.backend.entities.recruitments.RecruitmentSave;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    
    @Column(name = "description", nullable = false)
    private String description;
    
    @Column(name = "email", nullable = false)
    private String email;
    
    @Column(name = "password", nullable = false)
    private String password;
    
    @Column(name = "full_name", nullable = false)
    private String full_name;
    
    @Column(name = "address", nullable = false)
    private String address;
    
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;
    
    @Column(name = "pfp", nullable = false)
    private String pfp;
    
//    ROLE_APPLICANT, ROLE_RECRUITER
    @Column(name = "role", nullable = false)
    private String role;
    
    //    applicant exclusive
    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "cv_id")
    private Cv cv;
    
    @OneToMany(mappedBy = "user", orphanRemoval = true)
    private Set<CompanyFollow> companyFollows = new LinkedHashSet<>();
    
    @OneToMany(mappedBy = "user", orphanRemoval = true)
    private Set<RecruitmentSave> recruitmentSaves = new LinkedHashSet<>();
    
    @OneToMany(mappedBy = "user", orphanRemoval = true)
    private Set<RecruitmentApply> recruitmentApplies = new LinkedHashSet<>();
    
//    recruiter exclusive
    @Column(name = "status", nullable = false)
    private Integer status;
    
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
}
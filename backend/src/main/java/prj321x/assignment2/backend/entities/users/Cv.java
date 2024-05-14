package prj321x.assignment2.backend.entities.users;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cv")
public class Cv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    
    @Column(name = "file_name", nullable = false)
    private String fileName;
    
    @OneToOne(mappedBy = "cv", optional = false, orphanRemoval = true)
    private User user;
    
}
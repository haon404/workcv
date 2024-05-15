package prj321x.assignment2.backend.entities.recruitments;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    
    @Column(name = "name", nullable = false)
    private String name;
    
    @ManyToMany(mappedBy = "categories")
    private Set<Recruitment> recruitments = new LinkedHashSet<>();
    
}
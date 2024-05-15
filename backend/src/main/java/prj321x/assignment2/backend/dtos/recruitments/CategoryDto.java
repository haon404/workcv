package prj321x.assignment2.backend.dtos.recruitments;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Set;

/**
 * DTO for {@link prj321x.assignment2.backend.entities.recruitments.Category}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class CategoryDto implements Serializable {
    private Integer id;
    private String name;
    private Set<Integer> recruitmentIds;
}
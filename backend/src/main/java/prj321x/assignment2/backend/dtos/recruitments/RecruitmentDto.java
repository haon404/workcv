package prj321x.assignment2.backend.dtos.recruitments;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * DTO for {@link prj321x.assignment2.backend.entities.recruitments.Recruitment}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class RecruitmentDto implements Serializable {
    private Integer id;
    private String address;
    private LocalDateTime createdDate;
    private String description;
    private String experience;
    private Integer recruitQuantity;
    private String salary;
    private String title;
    private String dueDate;
    private Integer companyId;
    private Set<RecruitmentApplyDto> recruitmentApplies = new LinkedHashSet<>();
    private Set<CategoryDto> categories = new LinkedHashSet<>();
}
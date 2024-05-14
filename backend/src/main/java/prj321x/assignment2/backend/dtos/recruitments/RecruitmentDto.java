package prj321x.assignment2.backend.dtos.recruitments;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import prj321x.assignment2.backend.dtos.companies.CompanyDto;
import prj321x.assignment2.backend.entities.recruitments.Recruitment;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link Recruitment}
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
    private CompanyDto company;
}
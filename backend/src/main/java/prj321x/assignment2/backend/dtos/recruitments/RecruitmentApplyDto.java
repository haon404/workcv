package prj321x.assignment2.backend.dtos.recruitments;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import prj321x.assignment2.backend.dtos.users.ApplicantDto;
import prj321x.assignment2.backend.dtos.users.CvDto;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link prj321x.assignment2.backend.entities.recruitments.RecruitmentApply}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class RecruitmentApplyDto implements Serializable {
    private Integer id;
    private LocalDateTime createdDate;
    private RecruitmentDto recruitment;
    private ApplicantDto user;
    private CvDto cv;
    private Integer status;
}
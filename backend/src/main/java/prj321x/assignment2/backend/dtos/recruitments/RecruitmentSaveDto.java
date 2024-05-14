package prj321x.assignment2.backend.dtos.recruitments;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import prj321x.assignment2.backend.dtos.users.ApplicantDto;

import java.io.Serializable;

/**
 * DTO for {@link prj321x.assignment2.backend.entities.recruitments.RecruitmentSave}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class RecruitmentSaveDto implements Serializable {
    private Integer id;
    private RecruitmentDto recruitment;
    private ApplicantDto user;
}
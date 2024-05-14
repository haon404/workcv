package prj321x.assignment2.backend.dtos.users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import prj321x.assignment2.backend.dtos.companies.CompanyFollowDto;
import prj321x.assignment2.backend.dtos.recruitments.RecruitmentApplyDto;
import prj321x.assignment2.backend.dtos.recruitments.RecruitmentSaveDto;
import prj321x.assignment2.backend.entities.users.User;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * DTO for {@link User}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class ApplicantDto implements Serializable {
    private Integer id;
    private String description;
    private String email;
    private String full_name;
    private String address;
    private String phoneNumber;
    private String pfp;
    private Integer role;
    private CvDto cv;
    private Set<CompanyFollowDto> companyFollows = new LinkedHashSet<>();
    private Set<RecruitmentSaveDto> recruitmentSaves = new LinkedHashSet<>();
    private Set<RecruitmentApplyDto> recruitmentApplies = new LinkedHashSet<>();
}
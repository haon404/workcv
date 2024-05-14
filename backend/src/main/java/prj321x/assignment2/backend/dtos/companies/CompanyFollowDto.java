package prj321x.assignment2.backend.dtos.companies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import prj321x.assignment2.backend.dtos.users.ApplicantDto;
import prj321x.assignment2.backend.entities.companies.CompanyFollow;

import java.io.Serializable;

/**
 * DTO for {@link CompanyFollow}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class CompanyFollowDto implements Serializable {
    private Integer id;
    private CompanyDto company;
    private ApplicantDto user;
}
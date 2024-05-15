package prj321x.assignment2.backend.dtos.companies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * DTO for {@link prj321x.assignment2.backend.entities.companies.CompanyFollow}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class CompanyFollowDto implements Serializable {
    private Integer id;
    private Integer companyId;
    private Integer userId;
}
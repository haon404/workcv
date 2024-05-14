package prj321x.assignment2.backend.dtos.users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import prj321x.assignment2.backend.dtos.companies.CompanyDto;

import java.io.Serializable;

/**
 * DTO for {@link prj321x.assignment2.backend.entities.users.User}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class RecruiterDto implements Serializable {
    private Integer id;
    private String description;
    private String email;
    private String fullName;
    private String address;
    private String phoneNumber;
    private String pfp;
    private String role;
    private Integer status;
    private CompanyDto company;
}
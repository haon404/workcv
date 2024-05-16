package prj321x.assignment2.backend.dtos.users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * DTO for {@link prj321x.assignment2.backend.entities.users.User}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class RegisterDto implements Serializable {
    String email;
    String password;
    String fullName;
    String role;
}
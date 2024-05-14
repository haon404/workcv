package prj321x.assignment2.backend.dtos.users;

import java.io.Serializable;

/**
 * DTO for {@link prj321x.assignment2.backend.entities.users.User}
 */
public record LoginDto(String email, String password) implements Serializable {
}
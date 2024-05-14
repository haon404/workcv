package prj321x.assignment2.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;
import prj321x.assignment2.backend.entities.users.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(@Nullable String email);
}
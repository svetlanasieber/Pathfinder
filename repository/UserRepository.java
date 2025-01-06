package bg.kukuruku.Pathfinder.repository;

import bg.kukuruku.Pathfinder.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

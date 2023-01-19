package mg.cloud.enchere_back_end.Repository;

import mg.cloud.enchere_back_end.Model.App_user;
import mg.cloud.enchere_back_end.Model.V_app_user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface App_userRepository extends JpaRepository<App_user,Long> {
    Optional<App_user> findByUsernameOrEmailAndPassword(String username, String email, String password);

    @Override
    Optional<App_user> findById(Long id);

}

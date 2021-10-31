/**
 * Project:Well-Being System
 * Creation Date: 22-10-21
 * Author: Sai Anushka
 * Package Created: Sai Anushka
 */

package ie.wellbeing.model.dao;

import ie.wellbeing.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserDetailsDao extends JpaRepository<UserDetails, Integer> {

    Optional<UserDetails> findByEmail(String email);
    UserDetails findByVerificationCode(String verificationCode);

}

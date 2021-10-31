/**
 * Project:Well-Being System
 * Creation Date: 22-10-21
 * Author: Sai Anushka
 * Package Created: Sai Anushka
 */

package ie.wellbeing.model.dao;

import ie.wellbeing.model.Membership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembershipDao extends JpaRepository<Membership, Integer> {
    Membership findByMembershipName(String mName);

}

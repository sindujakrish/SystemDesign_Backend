package ie.wellbeing.service.impl;

import ie.wellbeing.model.dao.MembershipDao;
import ie.wellbeing.service.MembershipServiceState;
import org.springframework.beans.factory.annotation.Autowired;


public class SilverMembershipServiceImpl implements MembershipServiceState {

    @Autowired
    MembershipDao membershipDao;

    @Override
    public Integer handleMembership() {
        return 1;
    }

    @Override
    public Integer membershipPrice() {
        return 99;
    }

}

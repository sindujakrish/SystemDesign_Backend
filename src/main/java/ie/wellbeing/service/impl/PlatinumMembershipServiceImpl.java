package ie.wellbeing.service.impl;

import ie.wellbeing.model.dao.MembershipDao;
import ie.wellbeing.service.MembershipServiceState;
import org.springframework.beans.factory.annotation.Autowired;


public class PlatinumMembershipServiceImpl implements MembershipServiceState {

    @Autowired
    private MembershipDao membershipDao;

    @Override
    public Integer handleMembership() {
        return 3;
    }

    @Override
    public Integer membershipPrice() {
        return 199;
    }

}

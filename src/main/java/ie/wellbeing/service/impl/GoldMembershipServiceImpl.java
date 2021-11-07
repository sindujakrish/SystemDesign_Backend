package ie.wellbeing.service.impl;

import ie.wellbeing.model.dao.MembershipDao;
import ie.wellbeing.service.MembershipServiceState;
import org.springframework.beans.factory.annotation.Autowired;


public class GoldMembershipServiceImpl implements MembershipServiceState {
    @Autowired
    private MembershipDao membershipDao;

    @Override
    public Integer handleMembership() {
        return 2;
    }

    @Override
    public Integer membershipPrice() {
        return 149;
    }

}

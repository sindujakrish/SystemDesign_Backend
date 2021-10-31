package ie.wellbeing.service.impl;


import ie.wellbeing.model.Membership;
import ie.wellbeing.model.dao.MembershipDao;
import ie.wellbeing.model.dao.UserDetailsDao;
import ie.wellbeing.service.MembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembershipServiceImpl implements MembershipService {

    @Autowired
    private MembershipDao membershipDao;

    @Autowired
    private UserDetailsDao userDetailsDao;


    @Override
    public List<Membership> getMembershipDetails() {
        return membershipDao.findAll();
    }

}

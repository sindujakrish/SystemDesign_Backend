package ie.wellbeing.service.impl;

import ie.wellbeing.model.UserDetails;
import ie.wellbeing.service.MembershipService;
import ie.wellbeing.service.MembershipServiceState;
import org.springframework.stereotype.Service;

@Service
public class MembershipServiceContext implements MembershipService {

    private MembershipServiceState membershipServiceState;

    public MembershipServiceContext(){
        membershipServiceState = new NoMembershipServiceImpl(this   );
    }


    UserDetails userDetails=new UserDetails();

    public void changeStateTo(MembershipServiceState newState){
        if(userDetails.getMid()==0){
            userDetails.setMid(newState.handleMembership());
        }
    }

    public Integer handle(){
        return this.membershipServiceState.handleMembership();
    }

}

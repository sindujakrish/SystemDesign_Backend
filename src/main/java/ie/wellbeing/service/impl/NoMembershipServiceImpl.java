package ie.wellbeing.service.impl;

import ie.wellbeing.service.MembershipServiceState;


public class NoMembershipServiceImpl implements MembershipServiceState {

    private final MembershipServiceContext membershipServiceContext;

    public NoMembershipServiceImpl(MembershipServiceContext membershipServiceContext){
        this.membershipServiceContext=membershipServiceContext;
    }

    @Override
    public Integer handleMembership() {
        //Set user membership initially to null
        return 0;
    }

    @Override
    public Integer membershipPrice() {
        return 0;
    }

}

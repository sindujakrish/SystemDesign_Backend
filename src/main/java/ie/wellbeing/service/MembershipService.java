package ie.wellbeing.service;


public interface MembershipService {

    public void changeStateTo(MembershipServiceState newState);
    public Integer handle();
}

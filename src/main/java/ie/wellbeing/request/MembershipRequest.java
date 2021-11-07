package ie.wellbeing.request;

public class MembershipRequest {

    private String mName;

    private String uId;

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    @Override
    public String toString() {
        return "MembershipRequest{" +
                "mName='" + mName + '\'' +
                ", uId='" + uId + '\'' +
                '}';
    }
}

package ie.wellbeing.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "membership")
public class Membership {

    @Id
    @Column(name = "membership_id")
    private Integer membershipId;

    @Column(name = "membership_name")
    private String membershipName;

    @Column(name = "membership_price")
    private int membershipPrice;

    public Integer getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(Integer membershipId) {
        this.membershipId = membershipId;
    }

    public String getMembershipName() {
        return membershipName;
    }

    public void setMembershipName(String membershipName) {
        this.membershipName = membershipName;
    }

    public int getMembershipPrice() {
        return membershipPrice;
    }

    public void setMembershipPrice(int membershipPrice) {
        this.membershipPrice = membershipPrice;
    }
}

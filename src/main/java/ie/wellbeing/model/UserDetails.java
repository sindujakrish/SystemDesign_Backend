package ie.wellbeing.model;

import javax.persistence.*;
import javax.validation.constraints.Email;


@Entity
@Table(name = "userdetails")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "UID")
    private Integer id;

    @Column(name = "UName")
    private String name;

    @Column(name = "Uemail")
    @Email(message="Please enter a valid email")
    private String email;

    @Column(name = "Uphone")
    private Integer phone;

    @Column(name = "Ucity")
    private String city;

    @Column(name = "Ucountry")
    private String country;

    @Column(name = "Uage")
    private Integer age;

    @Column(name = "UCreatePassword")
    private String CreatePassword;

    @Column(name = "UConfirmPassword")
    private String ConfirmPassword;

    @Column(name = "accountStatus")
    private boolean accountVerified;

    public boolean isAccountVerified() {
        return accountVerified;
    }

    public void setAccountVerified(boolean accountVerified) {
        this.accountVerified = accountVerified;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCreatePassword() {
        return CreatePassword;
    }

    public void setCreatePassword(String createPassword) {
        CreatePassword = createPassword;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        ConfirmPassword = confirmPassword;
    }
}

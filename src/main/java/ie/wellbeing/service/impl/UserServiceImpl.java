package ie.wellbeing.service.impl;

import ie.wellbeing.model.UserDetails;
import ie.wellbeing.model.dao.UserDetailsDao;
import ie.wellbeing.request.UserRequest;
import ie.wellbeing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDetailsDao userDao;
    private PasswordEncoder passwordEncoder;

    @Override
    public void registrationUser(UserRequest userRequest) throws IllegalStateException {
            passwordEncoder=new BCryptPasswordEncoder();
            Optional<UserDetails> useroptional = userDao.findByEmail(userRequest.getuEmail());
            if (!useroptional.isPresent()) {
                UserDetails userdetails = new UserDetails();
                userdetails.setName(userRequest.getuName());
                userdetails.setEmail(userRequest.getuEmail());
                userdetails.setPhone(userRequest.getuPhone());
                userdetails.setAge(userRequest.getuAge());
                userdetails.setCity(userRequest.getuCity());
                if(userRequest.getuCreatePassword().equals(userRequest.getuConfirmPassword())){
                        String encodedPassword=this.passwordEncoder.encode(userRequest.getuConfirmPassword());
                        userdetails.setConfirmPassword(encodedPassword);
                        userdetails.setCreatePassword(encodedPassword);
                    //userdetails.setConfirmPassword((passwordEncoder.encode(userRequest.getuConfirmPassword())));
                    //setting password using setConfirm, should we set create also?
                }
                else{
                    throw new IllegalStateException("Password Mismatch");
                }
                //userdetails.setCreatePassword(userRequest.getuCreatePassword());
                //userdetails.setConfirmPassword(userRequest.getuConfirmPassword());
                userDao.save(userdetails);
            }
            else{
            throw new IllegalStateException("User Already registered please login");
            }
    }

    @Override
    public List<UserDetails> getAllUsers() {
        return userDao.findAll();
    }
}

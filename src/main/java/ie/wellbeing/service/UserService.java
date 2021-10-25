package ie.wellbeing.service;


import ie.wellbeing.model.UserDetails;
import ie.wellbeing.request.UserRequest;

import java.util.List;

public interface UserService {

    void registrationUser(UserRequest userRequest);

    List<UserDetails> getAllUsers();
}

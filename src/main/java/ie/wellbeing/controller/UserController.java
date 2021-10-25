package ie.wellbeing.controller;

import ie.wellbeing.common.ApiResponse;
import ie.wellbeing.common.ApiResponseBuilder;
import ie.wellbeing.request.UserRequest;
import ie.wellbeing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/registerUser")
    public ApiResponse createUserRegistration(@RequestBody UserRequest userRequest) {
        userService.registrationUser(userRequest);
        return ApiResponseBuilder.success().build();
    }

    @GetMapping("/getUsers")
    public ApiResponse getAllUsers() {
        return ApiResponseBuilder.success().data(userService.getAllUsers()).build();
    }
}

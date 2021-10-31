package ie.wellbeing.controller;


import ie.wellbeing.common.ApiResponse;
import ie.wellbeing.common.ApiResponseBuilder;
import ie.wellbeing.service.MembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("membership")
public class MembershipController {

    @Autowired
    private MembershipService membershipService;

    @GetMapping("/membershipDetails")
    public ApiResponse getMembershipDetails() {
        return ApiResponseBuilder.success().data(membershipService.getMembershipDetails()).build();
    }


}

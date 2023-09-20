package com.aaronbujatin.beaems.user;

import com.aaronbujatin.beaems.security.UserDetailsServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;
    private final UserDetailsServiceImpl userDetailsService;

    @PostMapping("/sign-in")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        return new ResponseEntity<>(userDetailsService.saveUser(user), HttpStatus.CREATED);
    }

}

package com.example.demo.controller;

import com.example.demo.enity.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public User getUserById(@RequestParam("id") int id) {
        return userService.getUser(id);
    }

    @PostMapping
    public User getUserByJson(@RequestBody UserRequest request) {
        return userService.getUser(request.getId());
    }

    public static class UserRequest {
        private int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}

package com.example.userservice;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  @RequestMapping("/list")
  public HashMap<String, String> getAllUsersList() {
    return new HashMap<String, String>() {
      {
        put("user1", "Alice");
        put("user2", "Bob");
        put("user3", "Charlie");
      }
    };
  }

}

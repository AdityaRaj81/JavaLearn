package com.example.roleservice;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roles")
public class HomeController {

  @Value("${myapp.message}")
  private String message;

  @RequestMapping("/list")
  public HashMap<String, String> getAllRoles() {

    HashMap<String, String> roles = new HashMap<>();
    roles.put("1", "Admin");
    roles.put("2", "User");
    roles.put("3", "Guest");
    roles.put("message", "message");
    return roles;

  }

}

package com.arms.org.Controller;


import com.arms.org.dto.UsersDto;
import com.arms.org.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

  
    @PostMapping
    public ResponseEntity<UsersDto> createUser(@RequestBody UsersDto usersDto) {
        UsersDto savedUser = userService.createUser(usersDto);
        return ResponseEntity.ok(savedUser);
    }

   
    @GetMapping
    public ResponseEntity<List<UsersDto>> getAllUsers() {
    	
        List<UsersDto> users = userService.getAllDetails();
        return ResponseEntity.ok(users);
    }

 
    @GetMapping("/{id}")
    public ResponseEntity<UsersDto> getUserById(@PathVariable Long id) {
        try {
            UsersDto user = userService.getById(id); 
            return ResponseEntity.ok(user);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }


   
    @PutMapping("/{id}")
    public ResponseEntity<UsersDto> updateUserById(@RequestBody UsersDto updatedUser,
                                                       @PathVariable Long id) {
        UsersDto user = userService.updateById(updatedUser, id);
        return ResponseEntity.ok(user);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUserById(@PathVariable Long id) {
        userService.deleteById(id);
        return ResponseEntity.ok("User with ID " + id + " deleted successfully.");
    }
}

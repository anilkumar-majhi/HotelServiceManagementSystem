//package com.arms.org.Controller;
//
//import com.arms.org.Entity.UsersDetails;
//import com.arms.org.userService.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/users")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    // CREATE - Save user details
//    @PostMapping
//    public ResponseEntity<UsersDetails> createUser(@RequestBody UsersDetails userDetails) {
//        UsersDetails savedUser = userService.saveAllDetails(userDetails);
//        return ResponseEntity.ok(savedUser);
//    }
//
//    // READ - Get all users
//    @GetMapping
//    public ResponseEntity<List<UsersDetails>> getAllUsers() {
//        List<UsersDetails> users = userService.getAllUsers();
//        return ResponseEntity.ok(users);
//    }
//
//    // READ - Get user by ID
//    @GetMapping("/{id}")
//    public ResponseEntity<UsersDetails> getUserById(@PathVariable Long id) {
//        Optional<UsersDetails> userOpt = userService.getById(id);
//        return userOpt.map(ResponseEntity::ok)
//                      .orElse(ResponseEntity.notFound().build());
//    }
//
//    // UPDATE - Update user by ID
//    @PutMapping("/{id}")
//    public ResponseEntity<UsersDetails> updateUserById(@RequestBody UsersDetails updatedUser,
//                                                       @PathVariable Long id) {
//        UsersDetails user = userService.updateById(updatedUser, id);
//        return ResponseEntity.ok(user);
//    }
//
//    // DELETE - Delete user by ID
//    @DeleteMapping("/{id}")
//    public ResponseEntity<String> deleteUserById(@PathVariable Long id) {
//        userService.deleteById(id);
//        return ResponseEntity.ok("User with ID " + id + " deleted successfully.");
//    }
//}

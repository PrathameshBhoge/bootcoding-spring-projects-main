package com.example.User.cotroller;

import com.example.User.model.ModelUser;
import com.example.User.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userlogin")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public String  createUser(@RequestBody ModelUser modelUser) {
        userService.createUser(modelUser);
        return "Data added sucessfully";
    }

    @GetMapping("getuser/{userId}")
    public ResponseEntity<ModelUser> getUserById(@PathVariable Long userId) {
        // Implement logic to retrieve the user by ID from your service
        ModelUser modelUser = userService.getUserById(userId);

        if (modelUser != null) {
            return ResponseEntity.ok(modelUser);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PutMapping("updateuser/{userId}")
    public ResponseEntity<Object> updateUserById(@PathVariable Long userId, @RequestBody ModelUser updatedUser) {
        ModelUser existingUser = userService.getUserById(userId);

        if (existingUser == null) {
            return ResponseEntity.notFound().build();
        }

        // Update user data with the new values
        existingUser.setName(updatedUser.getName());
        existingUser.setUsername(updatedUser.getUsername());
        existingUser.setEmail(updatedUser.getEmail());
        existingUser.setPhone(updatedUser.getPhone());
        existingUser.setAge(updatedUser.getAge());
        existingUser.setPassword(updatedUser.getPassword());
        existingUser.setConfirm_password(updatedUser.getConfirm_password());

        // Save the updated user
        ModelUser savedUser = userService.updateUser(existingUser);
        return ResponseEntity.ok(savedUser);
    }
    @DeleteMapping("deleteuser/{userId}")
    public ResponseEntity<?> deleteUserById(@PathVariable Long userId) {
        ModelUser existingUser = userService.getUserById(userId);

        if (existingUser == null) {
            return ResponseEntity.notFound().build();
        }

        userService.deleteUserById(userId);
        return ResponseEntity.ok("User with ID " + userId + " has been deleted.");
    }




}

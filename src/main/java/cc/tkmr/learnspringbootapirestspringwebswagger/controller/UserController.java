package cc.tkmr.learnspringbootapirestspringwebswagger.controller;

import cc.tkmr.learnspringbootapirestspringwebswagger.model.User;
import cc.tkmr.learnspringbootapirestspringwebswagger.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users") // Centralize the URL prefix. This means URL's start with /users. So no need to specify /users in the mappings below.
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping() // Map the HTTP GET request to the getUsers() method
        public List<User> getUsers(){
        return userRepository.findAll();
    }

@GetMapping("/{username}") // or @GetMapping("/users/{username}") if NOT using @RequestMapping("/users")
    public User getUserByUsername(@PathVariable("username") String username){
        return userRepository.findByUsername(username);
    }

    @DeleteMapping("/{id}") // Use HTTP client like Postman.
    public void deleteUserById(Long id){
        userRepository.deleteById(id);
    }

    @PostMapping()
    public void postUser(@RequestBody User user){ // RequestBody annotation is used to map the HTTP request body to the User object
        userRepository.save(user);
    }
    @PutMapping
    public void putUser(@RequestBody User user){ // RequestBody annotation is used to map the HTTP request body to the User object
        userRepository.save(user);
    }
}

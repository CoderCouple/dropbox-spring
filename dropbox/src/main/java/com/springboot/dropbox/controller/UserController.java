package com.springboot.dropbox.controller;

import com.springboot.dropbox.model.User;
import com.springboot.dropbox.repository.UserRepo;
import com.springboot.dropbox.repository.UserRepository;
import com.springboot.dropbox.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class UserController {

    private Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Autowired
    StorageService storageService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRepo userRepo;


//    @RequestMapping(path="/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
//    public User add (@RequestBody User user){
//        return userRepo.save(user);
//    }

    @RequestMapping(path="/signup", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
    public User signUp (@RequestBody User user){

        return userRepository.save(user);
    }
}


package com.example.demo.service;

import com.example.demo.dto.UserRequest;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.models.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * Here iam using builder design pattern, read about it once.instead of builder you can use User user = new User(); but these are the advantages with builder design pattern.
     * 1.immutability : builder design pattern will constructs object once all data provided so you can't modify. but if you use User user = new User();, the state can be changed. for example in service layer you have set one parmeter, you can replace the same in Dao layer so it is mutable
     * 2.Avoid Telescoping Constructors : if you want to set data to User with constuctor, you have to define multiple constructors to provide data. if you using setter this point not applicable.
     */
    public User saveUser(UserRequest userRequest) {
        User user = User.build(0,userRequest.getUserName(), userRequest.getEmail(),
                userRequest.getMobile(), userRequest.getGender(), userRequest.getAge(), userRequest.getNationality());
        return userRepository.save(user);
    }

    public List<User> getALlUsers() {
        return userRepository.findAll();
    }

    /**
     * Here iam throwing an error, if user is not found in DB. the error you are throwing will print on log, but user does not know what is the mistake he is doing.
     * So if the user is not found, you have to delegate(or redirect) the exception to ControllerAdvice class (because all exceptions are handled here) and you have to handle there.
     */
    public User getUser(int id) throws UserNotFoundException {
        User user = userRepository.findByUserId(id);
        if (user != null) {
            return user;
        } else {
            throw new UserNotFoundException("the user is not found in DB");
        }
    }
}

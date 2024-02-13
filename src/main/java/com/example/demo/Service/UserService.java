package com.example.demo.Service;


import com.example.demo.Entities.User;
import com.example.demo.ExceptionClasess.UserException;
import com.example.demo.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {



    @Autowired
    UserRepository userRepository;


    public void addUser(User user) throws UserException {
        if(userRepository.findByEmailAndUsername(user.getEmail(), user.getUsername()) != null){
            throw new UserException("The email and username provided already exist");
        }else userRepository.save(user);

    }


}

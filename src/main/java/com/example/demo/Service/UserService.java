package com.example.demo.Service;
import org.apache.commons.validator.routines.EmailValidator;

import com.example.demo.Entities.User;
import com.example.demo.ExceptionClasess.UserException;
import com.example.demo.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Objects;


@Service
public class UserService {



    @Autowired
    UserRepository userRepository;



    public boolean emailValidator(String domain) {


        boolean isValidFormat = EmailValidator.getInstance().isValid(domain);
        System.out.println(isValidFormat);
        if (isValidFormat) {
            try {
                // Perform DNS lookup to check if domain exists
                InetAddress inetAddress = InetAddress.getByName(domain.split("@")[1]);
                System.out.println(inetAddress);
                System.out.println("Domain exists and can receive emails");
                return true;
            } catch (UnknownHostException e) {
                System.out.println("Invalid email");
                return false;
            }
        } else {
            System.out.println("Email format is invalid");
            return false;
        }


    }


    public User returnUser(String email){
        return userRepository.findByEmail(email);
    }



    public boolean login(String email, String password){

        User user = userRepository.findByEmail(email);

        if (user != null){
            return Objects.equals(user.getPassword(), password);
        }
        return false;
    }



    public void addUser(User user) throws UserException {
        if(userRepository.findByEmail(user.getEmail()) != null || userRepository.findByUsername(user.getUsername()) != null  && !emailValidator(user.getEmail())) {
            throw new UserException("The data provided already exists");
        }else userRepository.save(user);

    }


    public boolean checkIfUserExists(String email) {
        return userRepository.findByEmail(email) != null;
    }
}

package my.examples.blog.service;

import my.examples.blog.domain.User;
import my.examples.blog.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getUserAll(){
        return userRepository.findAll();
    }
}

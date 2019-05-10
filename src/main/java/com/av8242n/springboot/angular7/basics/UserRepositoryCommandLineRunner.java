package com.av8242n.springboot.angular7.basics;

import com.av8242n.springboot.angular7.basics.jpain10steps.entity.User;
import com.av8242n.springboot.angular7.basics.jpain10steps.service.UserDAOService;
import com.av8242n.springboot.angular7.basics.jpain10steps.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger logger =
            Logger.getLogger(UserRepositoryCommandLineRunner.class.getName());

    @Autowired
    UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User jack = new User("Jack","Admin");
        userRepository.save(jack);
        User jill = new User("Jill", "Admin");
        userRepository.save(jill);
        logger.info("User created " + jack);

        Optional<User> userWithId1 = userRepository.findById(1l);
        logger.info("User with id 1 " + userWithId1);

        List<User> all = userRepository.findAll();
        logger.info("All users :: " + all);

    }
}

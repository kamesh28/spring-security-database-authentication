// Reference youtube = https://www.youtube.com/watch?v=LgN25B9Xyv4&t=1512s

package com.springboot.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.springboot.springmvc.model.User;
import com.springboot.springmvc.repository.UserRepository;

@SpringBootApplication
public class SpringSecurityDatabaseAuthencitationExampleApplication implements CommandLineRunner{

	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

	
	@Autowired
	private UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityDatabaseAuthencitationExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		userRepository.save(new User("ramky", bCryptPasswordEncoder.encode("sunny")));
		
	}

}

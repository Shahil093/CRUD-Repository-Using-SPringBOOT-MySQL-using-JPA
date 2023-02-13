package com.jpa.test;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.entities.User;
import com.jpa.test.repo.UserRepository;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);

		UserRepository UserRepository = context.getBean(UserRepository.class);

		/*
		 * User user=new User();
		 * 
		 * user.setName("Md Shahil"); user.setCity("Patna");
		 * user.setStatus("I am a Java Programmer");
		 * 
		 * User user1 = UserRepository.save(user);
		 * 
		 * System.out.println(user1);
		 */

		// create object of user

		User user1 = new User();
		user1.setName("Md");
		user1.setCity("delhi");
		user1.setStatus("listener");

		User user2 = new User();
		user2.setName("shahil");
		user2.setCity("mumbai");
		user2.setStatus("singer");
		
		User user3 = new User();
		user3.setName("raza");
		user3.setCity("kkr");
		user3.setStatus("entrepreneur");

//		
//		  // saving single user
//		   User resultuser = UserRepository.save(user2);
//		  
//		  System.out.println("saved user deatils is" +user2);
//		  System.out.println("Done...");

//		  // saving multiple user
//		  List<User> users = List.of(user1,user2,user3);
//		  Iterable<User> result = UserRepository.saveAll(users);
//		   result.forEach(user->{
//		    System.out.print(users); });

//		//update in user's deatils
//		Optional<User> optional = UserRepository.findById(53);
//		User user = optional.get();
//		user.setName("Md Shahil");
//		System.out.println(user);

		Iterable<User> itr = UserRepository.findAll();

		// lengthy method
//		itr.forEach(new Consumer<User>() {
//
//			@Override
//			public void accept(User t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//			
//		});

		
//		//easy one --- lambda function
//		itr.forEach(User -> {
//			System.out.println(User);
//			});
		
//		// deleting user
//		UserRepository.deleteById(153);
//		System.out.println("Deleted");
//		delete all by each user
//		Iterable<User> allusers = UserRepository.findAll();
//		allusers.forEach(user-> System.out.println(user));
//		UserRepository.deleteAll(allusers);
			
		
		
	}

}

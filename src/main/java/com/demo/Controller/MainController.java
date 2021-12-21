package com.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Entity.ClientDetails;
import com.demo.Entity.Client_Additional_Details;
import com.demo.Entity.EsbGroupMemberUploadReq;
import com.demo.Entity.User;
import com.demo.Service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class MainController {

	public static final String CLASS_NAME = MainController.class.getName();
	ObjectMapper mapper = new ObjectMapper();

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String Home() {
		return "Hello";
	}

	@GetMapping("/users")
	public List<User> getUsers() {
		return this.userService.getAllUsers();

	}

	@PostMapping("/add")
	public User addUser(@RequestBody User user) {

		User u = this.userService.addUser(user);
		System.out.println(user);
		return u;

	}

	@PostMapping("/addClientDetails")
	public String addClientDetails(@RequestBody EsbGroupMemberUploadReq esbGroupMemberUploadReq)
			throws JsonProcessingException {

		System.out.println("----------inside addClientDetails() method ------------"+esbGroupMemberUploadReq.getClientDetails());
		
		ClientDetails clientDetails = new ClientDetails();

		clientDetails = esbGroupMemberUploadReq.getClientDetails();
		
		esbGroupMemberUploadReq.setClientDetails(clientDetails);

		System.out.println("EsbGroupMemberUploadReq:" + clientDetails);

		String jsonReq = mapper.writeValueAsString(clientDetails);
		
		log.info(CLASS_NAME + "----------JSON esbGroupMemberUploadReq--------" + jsonReq);

		return userService.addClient(clientDetails);

	}

	@PostMapping(value = "/addClientadditionalDetails", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public Client_Additional_Details addClientAdditionalDetails(
			@RequestBody @Validated(EsbGroupMemberUploadReq.class) Client_Additional_Details clientadditionaldetails) {

		return userService.addClientAdditionalDetails(clientadditionaldetails);

	}

	@DeleteMapping(value = "/delete/{userId}")
	public void deleteUser(@PathVariable("userId") int userId) {
		this.userService.deleteById(userId);
		System.out.println("Deleted successfully");

	}

	@PutMapping(value = "/update/{userId}")
	public User updateUser(@RequestBody User user, @PathVariable("userId") int userId) {

		this.userService.update(user, userId);
		System.out.println("User is updated successfully.....");
		return user;

	}

}

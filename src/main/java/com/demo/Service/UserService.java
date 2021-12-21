package com.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Component;

import com.demo.Entity.ClientDetails;
import com.demo.Entity.Client_Additional_Details;
import com.demo.Entity.User;



@Component
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class UserService {
	
	private static List<User> list = new ArrayList<>();
	
	static {
		list.add(new User(101,"PAWAN","7208440220"));
		list.add(new User(102,"John","4578698765"));
		list.add(new User(103,"David","78451398657"));
		list.add(new User(104,"Nelson","7856239875"));
	}

	public List<User> getAllUsers(){
		return list;
		
	}
	
	
	public User addUser(User u) {
		list.add(u);
		return u;
		
	}
	
	public String addClient(ClientDetails cd) {
		return "Data saved Successfully!!!";
	}
	
	public Client_Additional_Details addClientAdditionalDetails (Client_Additional_Details cad) {
			

		Client_Additional_Details additonaldetails = new Client_Additional_Details();
		
		additonaldetails.setEmailID(cad.getEmailID());
		additonaldetails.setFAXNo(cad.getFAXNo());
		additonaldetails.setMobileNo(cad.getMobileNo());
		additonaldetails.setPagerNumber(cad.getPagerNumber());
		additonaldetails.setPANNumber(cad.getPANNumber());
		additonaldetails.setSpecialIndicator(cad.getSpecialIndicator());
		additonaldetails.setStaffFlag(cad.getStaffFlag());
		additonaldetails.setTelephoneNo(cad.getTelephoneNo());
		
		return  additonaldetails;
		
	}
	
	
	public void deleteById(int uid) {
		 list =this.list.stream().filter(user->user.getId()!=uid).collect(Collectors.toList());
		
	}
	
	
	public void update(User user, int uId)   {  
	
		list = list.stream().map(users->{
			if (users.getId()==uId) {
				users.setUsername(user.getUsername());
				users.setMobile(user.getMobile());
			}
			return users;
		}).collect(Collectors.toList());
	}


	 
}

package com.niit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.dao.UserDao;
import com.niit.model.ErrorClazz;
import com.niit.model.User;

@RestController
public class UserController {

	@Autowired
	private UserDao userDao;
	
	@GetMapping(value="/demo")
	public ResponseEntity<String> demoPurpose(){
		
		return new ResponseEntity<String>("Demo Data",HttpStatus.OK);
	}
	@PostMapping(value="/postdemo")
	public ResponseEntity<?> postdemo(@RequestBody User user){
		user.setOnline(false);//bhanoo
		user.setRole("USER");//bhanoo

		if(!userDao.isEmailValid(user.getEmail())){
			ErrorClazz error=new ErrorClazz(2,"Email Id already exists.. please enter different email address");
			return new ResponseEntity<ErrorClazz>(error, HttpStatus.CONFLICT);//409 //2nd callback func(error)
		}
		try{
		userDao.registration(user);
		return new ResponseEntity<String>("Post Demo Data",HttpStatus.OK);//1st callback fun (success)
		}catch(Exception e){
			ErrorClazz error=new ErrorClazz(1,"Unable to register user details "+e.getMessage());
			return new ResponseEntity<ErrorClazz>(error,HttpStatus.INTERNAL_SERVER_ERROR);//2nd callback func
		
		
		
	}
	}
}


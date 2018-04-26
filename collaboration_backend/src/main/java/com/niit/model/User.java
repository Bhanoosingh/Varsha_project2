package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="user_s180233")
public class User {
	//login credentials - email,password
			@Id
		private String email;//login id
			@Column(name="pswd")
		private String password;
			
		private String firstname;
		private String lastname;
		private String phonenumber;
		@Column(name="userrole")
		private String role; //ADMIN,STUDENT,ALUMNI,EMPLOYEE
		
		private boolean isonline;

		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public String getPhonenumber() {
			return phonenumber;
		}
		public void setPhonenumber(String phonenumber) {
			this.phonenumber = phonenumber;
		}
		public boolean isIsonline() {
			return isonline;
		}
		public void setIsonline(boolean isonline) {
			this.isonline = isonline;
		}
		
}

		
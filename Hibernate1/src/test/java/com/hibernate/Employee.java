package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import com.hibernate.model.Entity;
//import com.hibernate.model.GeneratedValue;
//import com.hibernate.model.Id;
//import com.hibernate.model.Table;


	
	@Table(name="HibernateCRUD")
	@Entity
	public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

		private int empid;
		private String firstName;
		private String lastName;
		private String address;
		private String contact;
		private String username;
		
		
		public Employee() {
			
		}
		
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		@Override
		public String toString() {
			return "Employee [empid=" + empid + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
					+ address + ", contact=" + contact + ", username=" + username + "]";
		}
		
		

	}



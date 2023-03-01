package hibernatemapping;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.criteria.Join;

import org.hibernate.annotations.Cascade;



@Entity
@Table(name="Student")
public class Student implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lid;
	private String firstName;
	private String lastName;
	private String department;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn
    private Account account;

public Student() {
	//super();
	// TODO Auto-generated constructor stub
}


public int getLid() {
	return lid;
}


public void setLid(int lid) {
	this.lid = lid;
}


public Account getAccount() {
	return account;
}


public void setAccount(Account account) {
	this.account = account;
}


public int getSid() {
	return lid;
}
public void setSid(int sid) {
	this.lid = lid;
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
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
@Override
public String toString() {
	return "Student [sid=" + lid + ", firstName=" + firstName + ", lastName=" + lastName + "]";
}








	

}


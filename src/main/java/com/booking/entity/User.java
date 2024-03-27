package com.booking.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private Long userId;
   private String userName;
   private String email;
   private String password;
public Long getUserId() {
	return userId;
}
public void setUserId(Long userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
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
@Override
public int hashCode() {
	return Objects.hash(email, password, userId, userName);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	User other = (User) obj;
	return Objects.equals(email, other.email) && Objects.equals(password, other.password)
			&& Objects.equals(userId, other.userId) && Objects.equals(userName, other.userName);
}
@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", password=" + password + "]";
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(Long userId, String userName, String email, String password) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.email = email;
	this.password = password;
}
   
   
   
}

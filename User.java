package com.joshua.library_app;


public class User {
	private int user_id;
	private String user_email;
	private String user_password;
	private String role;
	
	User (String user_email, String user_password, String role){
		
			
				this.user_id = user_id++;
				this.user_email = user_email;
				this.user_password = user_password;
				this.role = role.toLowerCase();
	}
	
	public int get_id() {
		return user_id;
	}
	public String get_email() {
		return user_email;
	}
	public String get_password() {
		return user_password;
	}
	public String get_role() {
		return role;
	}
	public void set_id(int user_id) {
		this.user_id = user_id;
	}
	public void set_email(String user_email) {
		this.user_email = user_email;
	}
	public void set_password(String user_password) {
		this.user_password = user_password;
	}
	
	@Override
	public String toString() {
			return "Your id is: " + user_id + "\n" +
					"Your email is: " + user_email + "\n" ;
	}
	
}

package com.pb.entity;

public class Login {
	private int id;
	private String username;
	private String Password;
	private String gender;
	private String mail;
	
	public Login() {
		// TODO Auto-generated constructor stub
	}

	public Login(int id, String username, String password, String gender, String mail) {
		super();
		this.id = id;
		this.username = username;
		Password = password;
		this.gender = gender;
		this.mail = mail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Login [id=" + id + ", username=" + username + ", Password=" + Password + ", gender=" + gender
				+ ", mail=" + mail + "]";
	}
	
}

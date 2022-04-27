package com.springrest;

public class User {

    private String Username;
    private String Password;
    
    public User() {
    	super();
    }
    
    public User(String Username, String Password) {
    	super();
    	this.Username = Username;
    	this.Password = Password;
    }

    public String getUsername() {
		return Username;
	}
	public void setUsername(String Username) {
		this.Username = Username;
	}

    public String getPassword() {
		return Password;
	}
	public void setPassword(String Password) {
		this.Password = Password;
	}
    
	@Override
	public String toString() {
		return "Customers [Username=" + Username + ", Password=" + Password + "]";
	}
    
}

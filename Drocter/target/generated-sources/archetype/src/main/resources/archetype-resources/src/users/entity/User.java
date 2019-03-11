#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package users.entity;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
    private String name;
    private String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
	
}

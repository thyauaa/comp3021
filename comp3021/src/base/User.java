package base;

public class User {
	private int user_id;
	private String username;
	private String email;
	
	public User(int user_id, String username, String email){
		this.setUser_id(user_id);
		this.setUsername(username);
		this.email = email;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getemail(){
		return email;
	}
	
	public void setemail(String email){
		this.email = email;
	}
}

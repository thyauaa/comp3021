package blog;

import java.util.ArrayList;

import base.Post;
import base.User;

public class Blog {

	private User user;
	private ArrayList<Post> allposts;

	public Blog(User user){
		this.user = user;
		this.allposts = new ArrayList<Post>();
	}

	public User getUser(){
		return user;
	}

	public void setUser(User user){
		this.user = user;
	}

	public void post(Post p){
		allposts.add(p);
		if(allposts.contains(p)){
			System.out.println("A new Post:");
			System.out.println(p.getDate());
			System.out.println(p.getContent());
		}
	}

	public void list(){
		System.out.println("Current posts:");
		for(int i = 0; i < allposts.size(); i++){
			int postNum = i + 1;
			System.out.println("Post[" + postNum +"]:" + allposts.get(i).getDate());
			System.out.println(allposts.get(i).getContent());
		}
	}

	public void delete(int index){
		if(index < 0 || index > allposts.size())
			System.out.println("Illegal deletion.");
		else{
			allposts.remove(--index);	
		}
	}

	//@Override 
	//public String toString(){
	//}

	@Override
	public boolean equals(Object o){
		boolean ans = true;
		if(this == o)
			return ans;
		else if(o == null)
			return false;
		else if(this.getClass() != o.getClass())
			return false;

		return ans;
	}

	@Override
	public int hashCode(){
		int hashCode = 21;

		hashCode = hashCode + user.hashCode();
		hashCode = hashCode + allposts.hashCode();

		return hashCode;
	}

	public boolean contains(String keyword){
		if(allposts.contains(keyword))
			return true;
		return false;
	}
}

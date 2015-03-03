package base;

import java.util.Date;

public class Post {

	private Date date;
	private String content;
	/**
	 * Constructor
	 * @param date
	 * @param content
	 */
	public Post(Date date, String content){
		this.date = date;
		this.content = content;
		
	}
	
	public Date getDate(){
		return date;
	}
	
	public void setDate(Date date){
		this.date = date;
	}
	
	public String getContent(){
		return content;
	}
	
	public void setContent(String content){
		this.content = content;
	}
	
	@Override 
	public String toString(){
		return this.content;
	}
	
	@Override
	public boolean equals(Object o){
		boolean ans = true;
		if(this == o)
			return ans;
		else if(o == null)
			return false;
		else if(this.getClass() != o.getClass())
			return false;
		
		Post post = (Post) o;
		
		Post postB = new Post(date, content);
		if(post.date == postB.date)
			if(post.content == postB.content)
				return ans;
		return ans;
	}
	
	@Override
	public int hashCode(){
		int hashCode = 21;
		
		hashCode = hashCode + date.hashCode();
		hashCode = hashCode + content.hashCode();
		
		return hashCode;
	}
	
	public boolean contains(String keyword){
		if(getContent().contains(keyword))
			return true;
		return false;
	}
}

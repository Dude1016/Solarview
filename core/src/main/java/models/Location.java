package models;

public class Location 
{
	private int locationId;
	private int type;
	private String user;
	


	public Location(int type, String user)
	{
		this.type = type;
		this.user = user;
	}
	
	public int getType()
	{
		return type;
	}
	
	public String getUser()
	{
		return user;
	}
	
	public void setType(int type)
	{
		this.type = type;
	}
	
}
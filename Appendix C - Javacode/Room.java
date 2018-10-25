import java.io.Serializable;

public abstract class Room implements Serializable
{
	private double price;
	private int roomNumber;

	public Room(int roomNumber) 
	{
		this.roomNumber=roomNumber;
	}
	public int getRoomNumber() 
	{
		return roomNumber;
	}
	
	public double getPrice() 
	{
		return price;
	}
	
	public void setPrice(double price) 
	{
		this.price = price;
	}
	
	public abstract String getType();
	
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Room))
			return false;
		Room other=(Room)obj;
		return price==other.price&&roomNumber==other.roomNumber;
	}

	public String toString() {
		return  " Room number: " + roomNumber+", Price: " + price+" euro\n";
	}
}

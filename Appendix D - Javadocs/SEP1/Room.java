package SEP1;
import java.io.Serializable;
/**
 * An abstract class, containing information about a room.
 * @author Group3
 * @version 1.0
 */
public abstract class Room implements Serializable
{
	private double price;
	private int roomNumber;
	/**
	 * An one-argument constructor, creating a room with the given number.
	 * @param roomNumber number given to the room
	 */
	public Room(int roomNumber) 
	{
		this.roomNumber=roomNumber;
	}
	/**
	 * A mothod, returning the number of the room.
	 * @return the number of the room
	 */
	public int getRoomNumber() 
	{
		return roomNumber;
	}
	/**
	 * A method, returning the price of the room.
	 * @return price of the room
	 */
	public double getPrice() 
	{
		return price;
	}
	/**
	 * A method, set the price of the room.
	 */
	public void setPrice(double price) 
	{
		this.price = price;
	}
	/**
	 * An abstract method, returning the type of the room.
	 * @return
	 */
	public abstract String getType();
	/**
	 * The method checks if the taken object is the same as the room.
	 * @param obj an object we compare with the room
	 * @return true if they are the same, false if not
	 */
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
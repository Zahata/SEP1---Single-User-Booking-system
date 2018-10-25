package SEP1;
/**
 * A class, which contains information a room of type Single bedroom.
 * @author Group3
 * @version 1.0
 */
public class SingleRoom extends Room
{
	/**
	 * An one-argument constructor, creating a Single bedroom type of room with the given room number and the price of 125.
	 * @param roomNumber the number,given to the room
	 */
	public SingleRoom(int roomNumber)
	{
		super(roomNumber);
		super.setPrice(125);
	}
	/**
	 * A method returning the type of the room.
	 */
	public String getType()
	{
		return "Single";
	}
	/**
	 * A method returning information about the room.
	 */
	public String toString()
	{
		return "Type: Single bedroom." + super.toString();
	}
}


package SEP1;
/**
 * A class, which contains information a room of type Double bedroom suite.
 * @author Group3
 * @version 1.0
 */
public class DoubleBedroomSuite extends Room 
{
	/**
	 * An one-argument constructor, creating a Double bedroom suite type of room with the given room number and the price of 229.
	 * @param roomNumber the number,given to the room
	 */
	public DoubleBedroomSuite(int roomNumber)
	{
		super(roomNumber);
		super.setPrice(229);
	}
	/**
	 * A method returning the type of the room.
	 */
	public String getType()
	{
		return "Double Suite";
	}
	/**
	 * A method returning information about the room.
	 */
	public String toString()
	{
		return "Type: Double bedroom suite." + super.toString();
	}
}

package SEP1;
/**
 * A class, which contains information a room of type Triple bedroom suite.
 * @author Group3
 * @version 1.0
 */
public class ThreeBedroomSuite extends Room
{
	/**
	 * An one-argument constructor, creating a Triple bedroom suite type of room with the given room number and the price of 399.
	 * @param roomNumber the number,given to the room
	 */
	public ThreeBedroomSuite(int roomNumber)
	{
		super(roomNumber);
		super.setPrice(399);
	}
	/**
	 * A method returning the type of the room.
	 */
	public String getType()
	{
		return "Triple Suite";
	}
	/**
	 * A method returning information about the room.
	 */
	public String toString()
	{
		return "Type: Three bedroom suite." + super.toString();
	}
}

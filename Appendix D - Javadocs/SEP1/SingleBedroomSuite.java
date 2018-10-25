package SEP1;
/**
 * A class, which contains information a room of type Single bedroom suite.
 * @author Group3
 * @version 1.0
 */
public class SingleBedroomSuite extends Room
{
	/**
	 * An one-argument constructor, creating a Single bedroom suite type of room with the given room number and the price of 249.
	 * @param roomNumber the number,given to the room
	 */
	public SingleBedroomSuite(int roomNumber)
	{
		super(roomNumber);
		super.setPrice(249);
	}
	/**
	 * A method returning the type of the room.
	 */
	public String getType()
	{
		return "Single Suite";
	}
	/**
	 * A method returning information about the room.
	 */
	public String toString()
	{
		return "Type: Single bedroom suite." + super.toString();
	}
}

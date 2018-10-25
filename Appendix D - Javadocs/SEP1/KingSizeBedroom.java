package SEP1;
/**
 * A class, which contains information a room of type King-size bedroom.
 * @author Group3
 * @version 1.0
 */
public class KingSizeBedroom extends Room
{
	/**
	 * An one-argument constructor, creating a King-size bedroom type of room with the given room number and the price of 165.
	 * @param roomNumber the number,given to the room
	 */
	public KingSizeBedroom(int roomNumber)
	{
		super(roomNumber);
		super.setPrice(165);
	}
	/**
	 * A method returning the type of the room.
	 */
	public String getType()
	{
		return "King-Size";
	}
	/**
	 * A method returning information about the room.
	 */
	public String toString()
	{
		return "Type: King-size bedroom." + super.toString();
	}
}

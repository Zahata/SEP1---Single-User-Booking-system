package SEP1;
/**
 * A class, which contains information a room of type Twin bedroom.
 * @author Group3
 * @version 1.0
 */
public class TwinBedroom extends Room
{
	/**
	 * An one-argument constructor, creating a Twin bedroom type of room with the given room number and the price of 165.
	 * @param roomNumber the number,given to the room
	 */
	public TwinBedroom(int roomNumber)
	{
		super(roomNumber);
		super.setPrice(165);
	}
	/**
	 * A method returning the type of the room.
	 */
	public String getType()
	{
		return "Twin";
	}
	/**
	 * A method returning information about the room.
	 */
	public String toString()
	{
		return "Type: Twin-bed bedroom." + super.toString();
	}
}

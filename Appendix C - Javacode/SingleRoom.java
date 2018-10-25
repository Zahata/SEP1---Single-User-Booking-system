public class SingleRoom extends Room
{
	
	public SingleRoom(int roomNumber)
	{
		super(roomNumber);
		super.setPrice(125);
	}

	public String getType()
	{
		return "Single";
	}

	public String toString()
	{
		return "Type: Single bedroom." + super.toString();
	}
}
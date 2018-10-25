public class KingSizeBedroom extends Room
{
	
	public KingSizeBedroom(int roomNumber)
	{
		super(roomNumber);
		super.setPrice(165);
	}
	
	public String getType()
	{
		return "King-Size";
	}
	
	public String toString()
	{
		return "Type: King-size bedroom." + super.toString();
	}
}
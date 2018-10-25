
public class ThreeBedroomSuite extends Room
{
	
	public ThreeBedroomSuite(int roomNumber)
	{
		super(roomNumber);
		super.setPrice(399);
	}
	
	public String getType()
	{
		return "Triple Suite";
	}
	
	public String toString()
	{
		return "Type: Three bedroom suite." + super.toString();
	}
}

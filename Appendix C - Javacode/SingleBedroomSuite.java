
public class SingleBedroomSuite extends Room
{
	
	public SingleBedroomSuite(int roomNumber)
	{
		super(roomNumber);
		super.setPrice(249);
	}
	
	public String getType()
	{
		return "Single Suite";
	}
	
	public String toString()
	{
		return "Type: Single bedroom suite." + super.toString();
	}
}
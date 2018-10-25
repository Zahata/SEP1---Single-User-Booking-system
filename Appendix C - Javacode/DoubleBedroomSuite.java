package SEP1;

public class DoubleBedroomSuite extends Room 
{
	
	public DoubleBedroomSuite(int roomNumber)
	{
		super(roomNumber);
		super.setPrice(229);
	}
	
	public String getType()
	{
		return "Double Suite";
	}
	
	public String toString()
	{
		return "Type: Double bedroom suite." + super.toString();
	}
}

public class TwinBedroom extends Room
{
	
	public TwinBedroom(int roomNumber)
	{
		super(roomNumber);
		super.setPrice(165);
	}
	
	public String getType()
	{
		return "Twin";
	}
	
	public String toString()
	{
		return "Type: Twin-bed bedroom." + super.toString();
	}
}
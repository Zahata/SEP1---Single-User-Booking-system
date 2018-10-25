import java.io.Serializable;
import java.util.ArrayList;

public class GuestList implements Serializable
{
	private ArrayList<Guest> guests;
	
	public GuestList()
	{
		guests=new ArrayList<Guest>(0);
	}
	
	public void addGuest(Guest guest)
	{
		guests.add(guest);
	}
	
	public void removeGuest(Guest guest)
	{
		guests.remove(guest);
	}
	
	public Guest getGuestByName(String name)
	{
		Guest g=new Guest("", "", "", "", null);
		for (int i = 0; i < guests.size(); i++) {
			if(guests.get(i).getName().equals(name))
				g=guests.get(i);
		}
		return g;
	}
	
	public String toString()
	{
		String str="";
		for(int i=0;i<guests.size();i++)
		{
			str+=guests.get(i)+"\n";
		}
		return str;
	}
}


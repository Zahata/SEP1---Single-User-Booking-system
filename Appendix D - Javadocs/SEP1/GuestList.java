package SEP1;
import java.io.Serializable;
import java.util.ArrayList;
/**
 * A class, containing a list of guests.
 * @author Group3
 * @version 1.0
 */
public class GuestList implements Serializable
{
	private ArrayList<Guest> guests;
	/**
	 * A no-argument constructor, creating a blank list.
	 */
	public GuestList()
	{
		guests=new ArrayList<Guest>(0);
	}
	/**
	 * A method, which adds a guest, of type Guest, to the list.
	 * @param guest the guest, of type Guest, being added
	 */
	public void addGuest(Guest guest)
	{
		guests.add(guest);
	}
	/**
	 * A method, which removes a guest, of type Guest, from the list.
	 * @param guest the guest, of type Guest, being removed
	 */
	public void removeGuest(Guest guest)
	{
		guests.remove(guest);
	}
	/**
	 * A method, returning a guest by their name.
	 * @param name the name of the guest
	 * @return the guest with the name, of type Guest.
	 */
	public Guest getGuestByName(String name)
	{
		Guest g=new Guest("", "", "", "", null);
		for (int i = 0; i < guests.size(); i++) {
			if(guests.get(i).getName().equals(name))
				g=guests.get(i);
		}
		return g;
	}
	/**
	 * A method, returning all information about the guests.
	 */
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

package SEP1;

import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * A class that saves and manipulates information about guests.
 * @author Group3
 * @version 1.0
 */
public class GuestFileAdapter 
{
	private MyFileIO mfio;
	private String filename;
/**
 * An one-argument constructor, which initializes the adapter for the given file.
 * @param filename the name of the file, the adapter works with
 */
	public GuestFileAdapter(String filename) {
		mfio = new MyFileIO();
		this.filename = filename;
	}
	/**
	 * A method, which saves a list of guests, of type GuestList, to the file.
	 * @param guests the list of guests, of type GuestList, being saved
	 */
	public void saveList(GuestList guests)
	{
		try {
			mfio.writeToFile(filename, guests);
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("IO Error writing to file");
		}
	}
	/**
	 * A method, which returns a list of guests, of type GuestList, from the file.
	 * @return list of all guests of type GuestList
	 */
	public GuestList getAllGuests()
	{
		Object guests =null;

		try {
			guests = mfio.readObjectFromFile((filename));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("IO Error reading file");
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found");
		}
		return (GuestList)guests;
	}
	/**
	 * A method, which saves a guest, of type Guest, in the file.
	 * @param guest the guest, of type Guest, being saved
	 */
	public void saveGuest(Guest guest){
		
		GuestList temp=new GuestList();
		GuestList result =getAllGuests();
		
		if(result!=null)
			temp=result;
		temp.addGuest(guest);
		saveList(temp);
	}
	/**
	 * A method, which removes a guest, of type Guest, from the file.
	 * @param guest the guest, of type Guest, being removed
	 */
	public void removeGuest(Guest guest){
		
		GuestList temp=new GuestList();
		GuestList result =getAllGuests();
		
		if(result!=null)
			temp=result;
		temp.removeGuest(guest);
		saveList(temp);
	}
}

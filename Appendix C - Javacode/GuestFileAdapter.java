import java.io.FileNotFoundException;
import java.io.IOException;

public class GuestFileAdapter 
{
	private MyFileIO mfio;
	private String filename;

	public GuestFileAdapter(String filename) {
		mfio = new MyFileIO();
		this.filename = filename;
	}
	
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
	
	public void saveGuest(Guest guest){
		
		GuestList temp=new GuestList();
		GuestList result =getAllGuests();
		
		if(result!=null)
			temp=result;
		temp.addGuest(guest);
		saveList(temp);
	}
	
	public void removeGuest(Guest guest){
		
		GuestList temp=new GuestList();
		GuestList result =getAllGuests();
		
		if(result!=null)
			temp=result;
		temp.removeGuest(guest);
		saveList(temp);
	}
}

package SEP1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
/**
 * A class, initializing all data needed to start the program
 * @author Group3
 * @version 1.0
 */
public class RoomInitialData implements Serializable
{

	public static void main(String[] args) 
	{
		RoomList rooms=new RoomList();
		RoomFileAdapter adapter = new RoomFileAdapter("rooms.bin");
		adapter.saveRooms(rooms);
		
		BookingFileAdapter ad=new BookingFileAdapter("bookings.bin");
		ad.saveList(new BookingList());
		
		GuestFileAdapter guest=new GuestFileAdapter("guests.bin");
		guest.saveList(new GuestList());
		
		System.out.println("Done");
	}
}

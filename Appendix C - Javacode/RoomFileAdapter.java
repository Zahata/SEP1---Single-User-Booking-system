import java.io.FileNotFoundException;
import java.io.IOException;

public class RoomFileAdapter 
{
	private MyFileIO mfio;
	private String filename;
	
	public RoomFileAdapter(String filename) 
	{
		mfio = new MyFileIO();
		this.filename = filename;
	}
	
	public void saveRooms(RoomList rooms) {

		try 
		{
			mfio.writeToFile(filename, rooms);
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File not found");
		} 
		catch (IOException e) 
		{
			System.out.println("IO Error writing to file");
		}
	}

	public RoomList getAllRooms() {
		Object rooms =null;

		try 
		{
			rooms = mfio.readObjectFromFile((filename));
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File not found");
		} 
		catch (IOException e) 
		{
			System.out.println("IO Error reading file");
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println("Class Not Found");
		}
		return (RoomList)rooms;
	}

	public void changeRoom(Room room)
	{
		RoomList rooms=new RoomList();
		rooms=getAllRooms();
		rooms.changeRoom(room);
		saveRooms(rooms);
	}
	
	public Room getRoom(int i)
	{
		return getAllRooms().getRoomByNumber(i);
	}
}

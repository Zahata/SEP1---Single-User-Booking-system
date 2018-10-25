package SEP1;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
* A class that saves and manipulates information about rooms.
* @author Group3
* @version 1.0
*/
public class RoomFileAdapter 
{
	private MyFileIO mfio;
	private String filename;
	/**
	 * An one argument constructor, initializing the file adapter.
	 * @param filename is the name of the file used by the adapter
	 */
	public RoomFileAdapter(String filename) 
	{
		mfio = new MyFileIO();
		this.filename = filename;
	}
	/**
	 * A method that saves a list of rooms.
	 * @param rooms is an object of type RoomList, which is being saved
	 */
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
	/**
	 * A method that returns a list of all rooms.
	 * @return all rooms in an object of type RoomList
	 */
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
	/**
	 * A method that puts the given room in the place of the existing room with the same number.
	 * @param room the room, of type Room, being added
	 */
	public void changeRoom(Room room)
	{
		RoomList rooms=new RoomList();
		rooms=getAllRooms();
		rooms.changeRoom(room);
		saveRooms(rooms);
	}
	/**
	 * A method, returning the room with the given number.
	 * @param i the number of the room
	 * @return the room with the given number
	 */
	public Room getRoom(int i)
	{
		return getAllRooms().getRoomByNumber(i);
	}
}

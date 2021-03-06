package SEP1;
import java.io.Serializable;
/**
 * A class, containing information about all rooms.
 * @author Group3
 * @version 1.0
 */
public class RoomList implements Serializable
{

	protected Room[] rooms;
	/**
	 * A no-argument constructor, creating a list of all rooms.
	 */
	public RoomList() {
		rooms = new Room[42];
		for(int i=0;i<11;i++)
		{
			rooms[i]=new KingSizeBedroom((i+101));
		}
		for(int i=11;i<14;i++)
		{
			rooms[i]=new TwinBedroom(i+101);
		}
		for(int i=14;i<19;i++)
		{
			rooms[i]=new SingleRoom(i+101);
		}
		for(int i=19;i<21;i++)
		{
			rooms[i]=new SingleBedroomSuite(i+101);
		}
		
		for(int i=21;i<32;i++)
		{
			rooms[i]=new KingSizeBedroom((i+180));
		}
		for(int i=32;i<35;i++)
		{
			rooms[i]=new TwinBedroom(i+180);
		}
		for(int i=35;i<40;i++)
		{
			rooms[i]=new SingleRoom(i+180);
		}
		rooms[40]=new DoubleBedroomSuite(220);
		rooms[41]=new ThreeBedroomSuite(221);
	}
	/**
	 * A method, returning a the room with the given number.
	 * @param number the number of the room
	 * @return the room with the given number, of type Room
	 */
	public Room getRoomByNumber(int number) {
		
			if (number > 200&& number<222) 
			{
				return rooms[number - 180];
			}
			if (number > 100&& number<122)
			{
				return rooms[number - 101];
			}
			else return rooms[42];

	}
	/**
	 * A method, returning information about all rooms.
	 */
	public String toString() {
		String allrooms = "";
		for (int i = 0; i < 42; i++) {
			if (i < 21) {
				allrooms += rooms[i];
			} else if (i >= 21) {
				allrooms += rooms[i];
			}

		}
		return allrooms;

	}
	/**
	 * A method that puts the given room in the place of the existing room with the same number.
	 * @param room the room, of type Room, being added
	 */
	public void changeRoom(Room room)
	{
		if (room.getRoomNumber() > 200&& room.getRoomNumber()<222) 
		{
			rooms[room.getRoomNumber() - 180]=room;
		}
		if (room.getRoomNumber() > 100&& room.getRoomNumber()<122)
		{
			rooms[room.getRoomNumber() - 101]=room;
		}
	}
}
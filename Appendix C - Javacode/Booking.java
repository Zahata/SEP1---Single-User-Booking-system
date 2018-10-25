import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.*;

public class Booking implements Serializable
{
	private MyDate checkIn;
	private MyDate checkOut;
	protected Guest guest;
	private Room room;

	public Booking(MyDate checkIn, MyDate checkOut, Guest guest, Room room) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.guest = guest;
		this.room = room;
	}

	public MyDate getCheckIn() {
		return checkIn;
	}

	public MyDate getCheckOut() {
		return checkOut;
	}

	public Guest getGuest() {
		return guest;
	}

	public Room getRoom() {
		return room;
	}

	public String toString() {
		return guest + "\nCheckIn: " + checkIn + "\nCheckOut: "
				+ checkOut + "\nRoom " + room;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Booking)) 
		{
			return false;
		}
		Booking other = (Booking) obj;
		
		return checkIn.equals(other.checkIn) && checkOut.equals(other.checkOut)
				&& guest.equals(other.guest) && room.equals(other.room);
	}
}

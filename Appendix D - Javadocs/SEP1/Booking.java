package SEP1;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.*;
/**
 * A class containing information about a booking.
 * @author Group 3
 * @version 1.0
 */
public class Booking implements Serializable
{
	private MyDate checkIn;
	private MyDate checkOut;
	protected Guest guest;
	private Room room;
/**
 * A four-argument constructor, creating a booking with the given information.
 * @param checkIn the check-in date
 * @param checkOut the check-out date
 * @param guest the guest, who is booking
 * @param room the room, which is being booked
 */
	public Booking(MyDate checkIn, MyDate checkOut, Guest guest, Room room) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.guest = guest;
		this.room = room;
	}
/**
 * Method returning the check-in date.
 * @return the check-in date
 */
	public MyDate getCheckIn() {
		return checkIn;
	}
/**
 * The method returns the check-out date.
 * @return the check out date
 */
	public MyDate getCheckOut() {
		return checkOut;
	}
/**
 * A method, which returns the guest, who made the booking
 * @return the guest, who made the booking
 */
	public Guest getGuest() {
		return guest;
	}
/**
 * The method returns the room booked
 * @return the booked room
 */
	public Room getRoom() {
		return room;
	}
/**
 * The method returns a string with all the information about the booking
 */
	public String toString() {
		return guest + "\nCheckIn: " + checkIn + "\nCheckOut: "
				+ checkOut + "\nRoom " + room;
	}
/**
 * The method checks if the taken object is the same as the booking.
 * @param obj an object we compare with the booking
 * @return true if they are the same, false if not
 */
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
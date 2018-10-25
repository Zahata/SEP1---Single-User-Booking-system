package SEP1;

import java.io.Serializable;
import java.util.ArrayList;
/**
 * A class that holds bookings.
 * @author Group3
 * @version 1.0
 */
public class BookingList implements Serializable
{
 private ArrayList<Booking> bookings;
 /**
  * A no-argument constructor, creating a blank list.
  */
 public BookingList(){
	 bookings = new ArrayList();
 }
 /**
  * A method that adds a booking to the list.
  * @param book a booking of type Booking, which is being added
  */
 public void addBooking(Booking book){
	 bookings.add(book);
 }
 /**
  * A method that removes a booking from the list.
  * @param book a booking of type Booking, which is being added
  */
 public void removeBooking(Booking book){
 	bookings.remove(book);
 }
 /**
  * A method that returns a particular booking from the list.
  * @param booking a booking of type Booking, searched in the list
  * @return the chosen booking of type Booking, from the list
  */
 public Booking getBooking(Booking booking)
 {
	 int index=5;
	 for (int i = 0; i < bookings.size(); i++) 
	 {
		if(bookings.get(i).equals(booking))
		{
				index=i;
				break;
		}
	}
	 return bookings.get(index);
 }
 /**
  * A method that returns a booking by its index.
  * @param index is the index of the booking in the list
  * @return the booking of type Booking, with the chosen index
  */
 public Booking getBookingByIndex(int index)
 {
	 return bookings.get(index);
 }
 /**
  * A method that returns the number of current bookings
  * @return the number of current bookings
  */
 public int getSize()
 {
	 return bookings.size();
 }
 /**
  * A method that returns all bookings by a person
  * @param name the name of the person, who made the the bookings
  * @return a list of type BookingList with all bookings by the person
  */
 public BookingList getBookingByName(String name){
	BookingList bookingByName = new BookingList();
	 for (int i = 0; i < bookings.size(); i++) {
		if(bookings.get(i).guest.getName().equals(name)){
			bookingByName.addBooking(bookings.get(i));
		}
	}
	 return bookingByName;
 }
/**
 * A method that checks the availability of a room in a particular time period
 * @param date1 the desired check-in date of type MyDate
 * @param date2 the desired check-out date of type MyDate
 * @param number the number of the desired room
 * @return true if available, false if not
 */
 	public boolean isAvailable(MyDate date1, MyDate date2, int number)
 	{
 		MyDate A=new MyDate(1,1,1);
 		MyDate B=new MyDate(1,1,1);
 		boolean free=true;
 		if(number<101&&number>221||number>121&&number<201)
 			return false;
 		for (int i = 0; i < bookings.size(); i++) 
 		 {
 			if(number==bookings.get(i).getRoom().getRoomNumber())
 			{
 				A=bookings.get(i).getCheckIn();
 				B=bookings.get(i).getCheckOut();
 				free=!(A.isBetween(date1, date2)||B.isBetween(date1, date2)||date1.isBetween(A, B)||date2.isBetween(A, B)||A.equals(date1)||A.equals(date2));
 			}
 		}
 		 return free;
 	}
 	/**
 	 * A method that prints out a list of all available rooms of a particular type for a particular time period
 	 * @param dateIn the desired check-in date of type MyDate
 	 * @param dateOut the desired check-out date of type MyDate
 	 * @param type type of the room
 	 * @return String of all available rooms of the chosen type for the desired time period
 	 */
 	public String getAllAvailable(MyDate dateIn,MyDate dateOut, String type)
 	{
 		RoomFileAdapter roomad=new RoomFileAdapter("rooms.bin");
 		ArrayList<Room> rooms=new ArrayList<Room>();
 		String str="";
 		for (int i = 101; i <= 121; i++) {
			if(isAvailable(dateIn, dateOut, i)&&type.equalsIgnoreCase(roomad.getRoom(i).getType()))
			{
				rooms.add(roomad.getRoom(i));
			}
		}
 		for (int i = 201; i <= 221; i++) {
 			if(isAvailable(dateIn, dateOut, i)&&type.equalsIgnoreCase(roomad.getRoom(i).getType()))
 			{
				rooms.add(roomad.getRoom(i));
 			}
 		}
 		for (int i = 0; i < rooms.size(); i++) {
			str+=rooms.get(i);
		}
 		return str;
 	}
 	/**
 	 * The method returns a String with all bookings
 	 */
 	public String toString()
 	{
 		String str="";
 		for (int i = 0; i < bookings.size(); i++) {
			str+=bookings.get(i)+"\n";
		}
 		return str;
 	}
}

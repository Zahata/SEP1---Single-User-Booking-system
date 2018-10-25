import java.io.Serializable;
import java.util.ArrayList;

public class BookingList implements Serializable
{
 private ArrayList<Booking> bookings;

 public BookingList(){
	 bookings = new ArrayList();
 }
 
 public void addBooking(Booking book){
	 bookings.add(book);
 }
 
 public void removeBooking(Booking book){
 	bookings.remove(book);
 }
 
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
 
 public Booking getBookingByIndex(int index)
 {
	 return bookings.get(index);
 }
 
 public int getSize()
 {
	 return bookings.size();
 }

 public BookingList getBookingByName(String name){
	BookingList bookingByName = new BookingList();
	 for (int i = 0; i < bookings.size(); i++) {
		if(bookings.get(i).guest.getName().equals(name)){
			bookingByName.addBooking(bookings.get(i));
		}
	}
	 return bookingByName;
 }

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
 
 	public String toString()
 	{
 		String str="";
 		for (int i = 0; i < bookings.size(); i++) {
			str+=bookings.get(i)+"\n";
		}
 		return str;
 	}
}



package SEP1;

import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * A class that saves and manipulates information about bookings.
 * @author Group3
 * @version 1.0
 */
public class BookingFileAdapter 
{
	private MyFileIO mfio;
	private String filename;
/**
 * An one argument constructor, initializing the file adapter.
 * @param filename is the name of the file used by the adapter
 */
	public BookingFileAdapter(String filename) {
		mfio = new MyFileIO();
		this.filename = filename;
		
	}
	/**
	 * A method that saves a list of bookings.
	 * @param books is an object of type BookingList, which is being saved
	 */
	public void saveList(BookingList books) {

		try {
			mfio.writeToFile(filename, books);
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("IO Error writing to file");
		}
	}
	/**
	 * A method that returns a list of all bookings.
	 * @return all bookings in an object of type BookingList
	 */
	public BookingList getAllBookings() {
		Object bookings =null;

		try {
			bookings = mfio.readObjectFromFile((filename));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("IO Error reading file");
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found");
		}
		return (BookingList)bookings;
	}
	/**
	 * A method that saves a booking.
	 * @param book is a booking of type Booking, which is being saved
	 */
	public void saveBooking(Booking book){
		
		BookingList temp=new BookingList();
		BookingList result =getAllBookings();
		
		if(result!=null)
			temp=result;
		temp.addBooking(book);
		saveList(temp);
		
	}
	/**
	 * A method that removes a booking.
	 * @param book is a booking of type Booking, which is being removed
	 */
	public void removeBooking(Booking book)
	{
		BookingList temp=new BookingList();
		BookingList result =getAllBookings();
		
		if(result!=null)
			temp=result;
		temp.removeBooking(book);
		saveList(temp);
	}
}

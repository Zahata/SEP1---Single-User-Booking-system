import java.io.FileNotFoundException;
import java.io.IOException;

public class BookingFileAdapter 
{
	private MyFileIO mfio;
	private String filename;

	public BookingFileAdapter(String filename) {
		mfio = new MyFileIO();
		this.filename = filename;
		
	}

	public void saveList(BookingList books) {

		try {
			mfio.writeToFile(filename, books);
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("IO Error writing to file");
		}
	}

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
	
	public void saveBooking(Booking book){
		
		BookingList temp=new BookingList();
		BookingList result =getAllBookings();
		
		if(result!=null)
			temp=result;
		temp.addBooking(book);
		saveList(temp);
		
	}
	
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

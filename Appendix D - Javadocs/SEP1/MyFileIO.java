package SEP1;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 * A class, used for writing and reading information from a file.
 * @author Group3
 * @version 1.0
 */
public class MyFileIO 
{
	/**
	 * A method, writing an object to a file.
	 * @param fileName the name of the file, saving the object
	 * @param obj the object, being saved
	 * @throws FileNotFoundException if the file is not found
	 * @throws IOException if there is an error reading from the file
	 */
	public void writeToFile(String fileName, Object obj)
			throws FileNotFoundException, IOException 
	{
		ObjectOutputStream writeToFile = null;

		try 
		{
			FileOutputStream fileOutStream = new FileOutputStream(fileName);
			writeToFile = new ObjectOutputStream(fileOutStream);

			writeToFile.writeObject(obj);
		} 
		finally {
			if (writeToFile != null) {
				try 
				{
					writeToFile.close();
				} catch (IOException e) 
				{
					System.out.println("IO Error closing file " + fileName);
				}
			}
		}
	}
	/**
	 * A method, reading an object from a file.
	 * @param fileName name of the file, being read from
	 * @return the first read object from the file
	 * @throws FileNotFoundException if the file is not found
	 * @throws IOException if there is an error reading from the file
	 * @throws ClassNotFoundException if the class of the object is not found
	 */
	public Object readObjectFromFile(String fileName)
			throws FileNotFoundException, IOException, ClassNotFoundException 
	{
		Object obj = null;
		ObjectInputStream readFromFile = null;
		try {
				FileInputStream fileInStream = new FileInputStream(fileName);
				readFromFile = new ObjectInputStream(fileInStream);
				try 
				{
					obj = readFromFile.readObject();
				} 
				catch (EOFException eof) 
				{}
			} 
		finally 
		{
			if (readFromFile != null) {
				try 
				{
					readFromFile.close();
				} 
				catch (IOException e) 
				{
					System.out.println("IO Error closing file " + fileName);
				}
			}
		}
		return obj;
	}
}

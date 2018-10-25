package SEP1;

import java.io.Serializable;
/**
 * A class, containing information about a guest.
 * @author Group3
 * @version 1.0
 */
public class Guest implements Serializable
{
	private String address,nationality,name,phone;
	private MyDate birthday;
	/**
	 * A five-argument constructor, creating a guest with the given information.
	 * @param name name of the guest
	 * @param address address of the guest
	 * @param nationality nationality if the guest
	 * @param phone phone number of the guest
	 * @param birthday birthday of the guest of type MyDate
	 */
	public Guest(String name,String address, String nationality, String phone, MyDate birthday)
	{
		this.name=name;
		this.address=address;
		this.nationality=nationality;
		this.phone=phone;
		this.birthday=birthday;
	}
	/**
	 * A method, which returns the name of the guest.
	 * @return name of the guest
	 */
	public String getName() {
		return name;
	}
	/**
	 * A method, which returns the address of the guest.
	 * @return address of the guest
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * A method, which returns the nationality of the guest.
	 * @return nationality of the guest
	 */
	public String getNationality() {
		return nationality;
	}
	/**
	 * A method, which returns the phone of the guest.
	 * @return phone of the guest
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * A method returning information about the guest.
	 */
	public String toString()
	{
		return "-----------------------------------------------------------------------------------------------------------\nName: " + name + "\nAddress: "+address+"\nNationality: "+nationality+"\nPhone number: "+phone+"\nBorn: "+birthday;
	}
	
	/**
	 * A method, which returns the birthday of the guest.
	 * @return birthday of the guest of type MyDate
	 */
	public MyDate getBirthday() {
		return birthday;
	}
	/**
	 * A method, which checks if the given object is the same as the guest.
	 */
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Guest))
			return false;
		
		Guest other=(Guest)obj;
		return name.equals(other.name)&&phone.equals(other.phone)&&address.equals(other.address)&&nationality.equals(other.nationality)&&birthday.equals(other.birthday);
	}
}

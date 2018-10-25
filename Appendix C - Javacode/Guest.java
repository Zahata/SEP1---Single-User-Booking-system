import java.io.Serializable;

public class Guest implements Serializable
{
	private String address,nationality,name,phone;
	private MyDate birthday;
	
	public Guest(String name,String address, String nationality, String phone, MyDate birthday)
	{
		this.name=name;
		this.address=address;
		this.nationality=nationality;
		this.phone=phone;
		this.birthday=birthday;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getNationality() {
		return nationality;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String toString()
	{
		return "-----------------------------------------------------------------------------------------------------------\nName: " + name + "\nAddress: "+address+"\nNationality: "+nationality+"\nPhone number: "+phone+"\nBorn: "+birthday;
	}
	
	
	public MyDate getBirthday() {
		return birthday;
	}
	
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Guest))
			return false;
		
		Guest other=(Guest)obj;
		return name.equals(other.name)&&phone.equals(other.phone)&&address.equals(other.address)&&nationality.equals(other.nationality)&&birthday.equals(other.birthday);
	}
}

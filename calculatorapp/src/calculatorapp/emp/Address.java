package calculatorapp.emp;

/**
 * 
 * @author UD SYSTEMS
 *	Address class is referring to address object
 *In Java a class can have properties or fields, contructors,
 *getter and setter methods, user defined methods you can have it
 */
public class Address {
	//Fields or properties
	int addressId; // primitive data types
	int houseNo; // primitive data types
	String street;//String class type
	String city;//String class type
	String state;//String class type
	String country;//String class type
	int pinCode;// primitive data types
	
	/**
	 * Default constructor of Address class
	 */
	public Address() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Parameterized Constructor
	 * @param addressId
	 * @param houseNo
	 * @param street
	 * @param city
	 * @param state
	 * @param country
	 * @param pinCode
	 */
	public Address(int addressId, int houseNo, String street, String city, String state, String country, int pinCode) {
		this.addressId = addressId;
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	/**
	 * a string representation of the object.
	 */

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", houseNo=" + houseNo + ", street=" + street + ", city=" + city
				+ ", state=" + state + ", country=" + country + ", pinCode=" + pinCode + "]";
	}
	
	
	
}

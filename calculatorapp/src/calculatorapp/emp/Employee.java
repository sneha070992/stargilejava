package calculatorapp.emp;

import java.time.LocalDate;
/**
For example employee object will have properties 
like name,dateOfBirth,address,empId
**/
public class Employee {
	int empId; //primitive data
	String name; // String class type
	LocalDate dateOfBirth; // LocalDate class type
	Address address;//Address class
	/**
	 * Default constructor of Employee class
	 * Constructor is required to create an object this class
	 */
	public Employee() {
		
	}
	/**
	 * Parameterized Contructor
	 * @param empId
	 * @param name
	 * @param dateOfBirth
	 * @param address
	 */
	public Employee(int empId, String name, LocalDate dateOfBirth, Address address) {
		this.empId = empId;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	/**
	 * a string representation of the object.
	 */
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", address=" + address
				+ "]";
	}
	
	
}

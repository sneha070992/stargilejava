package calculatorapp.emp;

import java.time.LocalDate;

public class EmployeeMain {

	public static void main(String[] args) {
		/**
		 * Here we are creating an employee class object using new keword and 
		 * calling the constructor(Employee())
		 */
		Employee emp = new Employee();
		emp.setEmpId(1); //We are calling setter method to set data for a particular filed of a class
		emp.setName("Rahul");
		emp.setDateOfBirth(LocalDate.now());
		
		Address address = new Address();
		System.out.println(address);
		address.setAddressId(1);
		address.setHouseNo(11);
		address.setStreet("R T Nagar");
		address.setCity("Bengaluru");
		address.setState("Karnataka");
		address.setCountry("India");
		address.setPinCode(560001);
		emp.setAddress(address);
		
		System.out.println(emp);
		

	}

}

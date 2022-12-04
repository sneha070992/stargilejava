//First line in the java program is Name of the package
package helloworld.mainapp;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hi");
		System.out.println("Hello Everyone");
		// greetings is a variable of type String (String is a class which is 
		//referring
		//to an object whose value is a group of characters)
		String greetings = "Good Afternoon"; //At runtime means when we execute program it will create an object of type String and referred by a variable greetings 
		System.out.println(greetings);
		int index; // Decalring the variable index of type integer
		index =1; //initializing the variable index
		
		//Primitive datatypes
		int num = 10; 
		double num2=10.5054543; // 64 bits
		float num3 = 10.25f; //size is 32 bits
		char singleCharacter = 'h';
		boolean isClassBoring = false; // boolean will have value either true or false
		System.out.println(num);
		
		double results = num+num2; // I am using here + operator which is also known as Arithmetic operator
		
		System.out.println(results);
		
		float sum = num+num3;
		//float num4 = 10.25f; 
		System.out.println(sum);
	}

}

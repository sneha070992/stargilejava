package calculatorapp.mainapp;

import calculatorapp.add.Addition;
import calculatorapp.div.Division;
import calculatorapp.mod.ModDivision;
import calculatorapp.mul.Multiplication;
import calculatorapp.sub.Subtraction;

public class CalculatorMainApp {

	public static void main(String[] args) {
		int number1 = 15;
		int number2 = 5;
		int number3 = 4;
		int output =0;
		Addition add = new Addition();
		System.out.println(add.sum(number1, number2));
		Subtraction sub = new Subtraction();
		output = sub.subtract(number1, number2);
		System.out.println("Subtraction output-- "+output);
		Multiplication mul = new Multiplication();
		output= mul.multiply(number1, number2);
		System.out.println("Multiplication output-- "+output);
		Division div = new Division();
		output = div.division(number1, number2);
		System.out.println("Division output-- "+output);
		ModDivision moddiv = new ModDivision();
		output = moddiv.moddivision(number1, number2);
		System.out.println("ModDivision or Remainder output-- "+output);
		output = moddiv.moddivision(number1, number3);
		System.out.println("ModDivision or Remainder output-- "+output);
	}

}

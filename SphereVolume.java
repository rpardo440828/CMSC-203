//Program will calculate the volume of a sphere
import java.util.Scanner;

public class SphereVolume
{
	public static void main(String[] args)
	{
		//Declare variables
		Scanner Input = new Scanner(System.in);
		double diameter;
		double radius;
		double volume;
		
		//Print purpose of program
		System.out.println("Program will calculate the volume of a sphere.");
		
		//Prompt and input for diameter
		System.out.println("Enter the diamter of the sphere: ");
		diameter = Input.nextDouble();
		
		//Read the diameter
		System.out.println("Diameter entered is " + diameter + " units.");
		
		//Calculate radius
		radius = diameter / 2;
		
		//Calculate volume
		volume = (4 / 3.0) * Math.PI * (Math.pow(radius, 3));
		
		//Print volume
		System.out.println("Volume of sphere is " + volume + " units cubed.");
	}
}

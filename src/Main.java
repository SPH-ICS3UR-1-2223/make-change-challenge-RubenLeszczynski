import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		// Your challenge is to read in a price
		System.out.println("How much did it cost?");
		double cash = in.nextDouble();
		// Read in the amount paid
		System.out.println("How much did you spend?");
		double boi = in.nextDouble();
		// Print out the amount of change
		double change = (boi - cash);

		int cake = (int) ((change * 100) % 10);
		if (cake == 1 || cake == 2) {
			change = change - (cake / 100.0);
		} else if (cake == 3 || cake == 4) {
			change = change + ((5 - cake) / 100.0);
		}
		change = Math.round(change*100)/100.0;
		System.out.println("Your change is $" + change);
		// Break the change into all denominations:
		// $100,$50,$20,$10,$5,$2,$1,$0.25,$0.10,$0.05
		int hundy = (int) (change / 100);
		change -= hundy * 100;
		int fifty = (int) (change / 50);
		change -= fifty * 50;
		int tweny = (int) (change / 20);
		change -= tweny * 20;
		int ten = (int) (change / 10);
		change -= ten * 10;
		int five = (int) (change / 5);
		change -= five * 5;
		int two = (int) (change / 2);
		change -= two * 2;
		int one = (int) (change / 1);
		change -= one * 1;
		double quarters = (change / 0.25);
		change -= quarters * 0.25;
		double dimes = (change / 0.1);
		change -= dimes * 0.1;
		double nickles = (change / 0.05);
		change -= nickles * 0.05;
		int quarter = (int) (quarters);
		int dime = (int) (dimes);
		int nickle = (int) (nickles);
		// As a bonus, make your project round to the nearest $0.05 like actual stores.
		System.out.println("You have " + hundy + " 100's");
		System.out.println("You have " + fifty + " 50's");
		System.out.println("You have " + tweny + " 20's");
		System.out.println("You have " + ten + " 10's");
		System.out.println("You have " + five + " 5's");
		System.out.println("You have " + two + " 2's");
		System.out.println("You have " + one + " 1's");
		System.out.println("You have " + Math.round(quarter * 100) / 100.0 + " quarters");
		System.out.println("You have " + dime + " dimes");
		System.out.println("You have " + nickle + " nickles");

	}
}

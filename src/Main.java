import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double f;
		double k;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Fahrenheit: ");
		f = scanner.nextDouble();
		
		k = (f + 459.67) * 5/9;
		
		double roundoff = Math.floor(k*100) / 100;
		
		System.out.println(f + " Fahrenheit is equal to: " + roundoff + "Kelvin");
	}

}

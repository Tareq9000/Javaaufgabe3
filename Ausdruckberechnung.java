import java.util.Scanner;

public class Ausdruckberechnung {
	Scanner scan = new Scanner(System.in);	
	public static void main(String[] args) {
		Ausdruckberechnung program = new Ausdruckberechnung();
        program.run();

	}
	
	public void run() {
		
		double[] Rechnung = new double[8];
		
		double a = 5;
		double x = -7;
		
		
		Rechnung[0] = 7 + 3 * 5;
		Rechnung[1] = 16 % 3;
		Rechnung[2] = 4 * 3 + (3 + 4) * 2;
		Rechnung[3] = 1 % 15;
		
		Rechnung[4] = (-x) + (2 - 1 - 1) * 6;
		Rechnung[5] = a + x * a;
		Rechnung[6] = a % (x + 9);
		if (x + 12 == a) {
			Rechnung[7] = 5;
		}
		
		System.out.println(Rechnung[0]);
		System.out.println(Rechnung[1]);
		System.out.println(Rechnung[2]);
		System.out.println(Rechnung[3]);
		System.out.println(Rechnung[4]);
		System.out.println(Rechnung[5]);
		System.out.println(Rechnung[6]);
		System.out.println(Rechnung[7]);
		
	}
	
}

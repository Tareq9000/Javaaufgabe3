
import java.util.Scanner;

public class Bitsrechnung {
	Scanner scan = new Scanner(System.in);	
	public static void main(String[] args) {
		Bitsrechnung program = new Bitsrechnung();
        program.run();

	}

	public void run() {
		
//		1 bit = 2
//		2 bit = 4
//		3 bit = 8
//		4 bit = 16
//		5 bit = 32
//		6 bit = 64
//		7 bit = 128
//		8 bit = 256
//		9 bit = 512
//		10 bit = 1024
		
		int wert;
		int bit = 0;
		
		System.out.println("Geben Sie Ihre Werte ein >");
		wert = scan.nextInt();
		
		if(wert <= 2) {
			bit = 1;
		}
		else if(wert <= 4) {
			bit = 2;
		}
		else if(wert <= 8) {
			bit = 3;
		}
		else if(wert <= 16) {
			bit = 4;
		}
		else if(wert <= 32) {
			bit = 5;
		}
		else if(wert <= 64) {
			bit = 6;
		}
		else if(wert <= 128) {
			bit = 7;
		}
		else if(wert <= 256) {
			bit = 8;
		}
		else if(wert <= 512) {
			bit = 9;
		}
		else if(wert <= 1024) {
			bit = 10;
		}
		else if(wert <= 2048) {
			bit = 11;
		}
		else if(wert <= 4096) {
			bit = 12;
		}
		else if(wert > 4096) {
			System.out.print("Sie benötigen mehr als 12 Bits");
		}
		
		if(bit > 0) {
		System.out.print("Anzahl Bits >");
		System.out.print(bit);
		}
	}
	
}
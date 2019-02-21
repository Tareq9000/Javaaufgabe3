
import java.util.Scanner;

public class Binaerdarstellung {
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Binaerdarstellung program = new Binaerdarstellung();
		program.run();

	}

	int dezimal = 0;
	int total = 0;
	int total2 = 0;
	int[] bin�r = new int[8];
	int[] bin�r3 = new int[8];
	int[] dez = new int[8];

	int dezimal2 = 0;
	int total3 = 0;
	int total4 = 0;
	int[] bin�r2 = new int[8];
	int[] dez2 = new int[8];

	int enddezimal = 0;
	int[] endbin�r = new int[8];
	int[] dez3 = new int[8];
	int dezimal3 = 0;

	public void run() {

		System.out.print("Geben Sie eine Dezimalzahl ein > ");
		dezimal = scan.nextInt();

		System.out.print("Geben Sie eine Dezimalzahl ein > ");
		dezimal2 = scan.nextInt();

		vonDezinBin();

		ausrechnen();

		ausgebenBin�r();

		vonBininDez();
		ausgebenDez();

	}

	public void vonDezinBin() {
		total2 = dezimal * 2;

		for (int i = 7; i >= 0; i--) {
			total2 = total2 / 2;
			total = total2 % 2;

			bin�r[i] = total;
		}

		total4 = dezimal2 * 2;

		for (int i = 7; i >= 0; i--) {
			total4 = total4 / 2;
			total3 = total4 % 2;

			bin�r2[i] = total3;
		}
	}

	public void ausgebenBin�r() {
		System.out.print("Zahl 1 in Bin�r > ");
		
		for (int s : bin�r) {
			System.out.print(s);
		}
		System.out.println();


		System.out.print("Zahl 2 in Bin�r > ");

		for (int s : bin�r2) {
			System.out.print(s);
		}
		System.out.println();

		System.out.print("Zahl 1 + Zahl 2 in Bin�r > ");

		for (int s : endbin�r) {
			System.out.print(s);
		}
		System.out.println();
	}

	public void ausrechnen() {

		for (int i = 7; i >= 0; i--) {
			endbin�r[i] = 0;
			if (bin�r[i] + bin�r2[i] + bin�r3[i] == 1) {
				endbin�r[i] = endbin�r[i] + 1;
			} else if (bin�r[i] + bin�r2[i] + bin�r3[i] == 2) {
				endbin�r[i] = endbin�r[i] + 0;
				bin�r3[i - 1] = bin�r3[i - 1] + 1;
			} else if (bin�r[i] + bin�r2[i] + bin�r3[i] == 3) {
				endbin�r[i] = endbin�r[i] + 1;
				bin�r3[i - 1] = bin�r3[i - 1] + 1;
			} else if (bin�r[i] + bin�r2[i] + bin�r3[i] == 4) {
				endbin�r[i] = endbin�r[i] + 1;
				bin�r3[i - 1] = bin�r3[i - 1] + 2;
			}
		}
	}

	public void vonBininDez() {
		dez[7] = bin�r[7] * 1;
		dez[6] = bin�r[6] * 2;
		dez[5] = bin�r[5] * 4;
		dez[4] = bin�r[4] * 8;
		dez[3] = bin�r[3] * 16;
		dez[2] = bin�r[2] * 32;
		dez[1] = bin�r[1] * 64;
		dez[0] = bin�r[0] * 128;

		dezimal = dez[7] + dez[6] + dez[5] + dez[4] + dez[3] + dez[2] + dez[1] + dez[0];

		dez2[7] = bin�r2[7] * 1;
		dez2[6] = bin�r2[6] * 2;
		dez2[5] = bin�r2[5] * 4;
		dez2[4] = bin�r2[4] * 8;
		dez2[3] = bin�r2[3] * 16;
		dez2[2] = bin�r2[2] * 32;
		dez2[1] = bin�r2[1] * 64;
		dez2[0] = bin�r2[0] * 128;

		dezimal2 = dez2[7] + dez2[6] + dez2[5] + dez2[4] + dez2[3] + dez2[2] + dez2[1] + dez2[0];

		dez3[7] = endbin�r[7] * 1;
		dez3[6] = endbin�r[6] * 2;
		dez3[5] = endbin�r[5] * 4;
		dez3[4] = endbin�r[4] * 8;
		dez3[3] = endbin�r[3] * 16;
		dez3[2] = endbin�r[2] * 32;
		dez3[1] = endbin�r[1] * 64;
		dez3[0] = endbin�r[0] * 128;

		dezimal3 = dez3[7] + dez3[6] + dez3[5] + dez3[4] + dez3[3] + dez3[2] + dez3[1] + dez3[0];
	}

	public void ausgebenDez() {
		System.out.print("\nZahl 1 in Dezimal > ");
		System.out.println(dezimal);

		System.out.print("Zahl 2 in Dezimal > ");
		System.out.println(dezimal2);

		System.out.print("Zahl 1 + Zahl 2 in Dezimal > ");
		System.out.println(dezimal3);
	}
}
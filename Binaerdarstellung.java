
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
	int[] binär = new int[8];
	int[] binär3 = new int[8];
	int[] dez = new int[8];

	int dezimal2 = 0;
	int total3 = 0;
	int total4 = 0;
	int[] binär2 = new int[8];
	int[] dez2 = new int[8];

	int enddezimal = 0;
	int[] endbinär = new int[8];
	int[] dez3 = new int[8];
	int dezimal3 = 0;

	public void run() {

		System.out.print("Geben Sie eine Dezimalzahl ein > ");
		dezimal = scan.nextInt();

		System.out.print("Geben Sie eine Dezimalzahl ein > ");
		dezimal2 = scan.nextInt();

		vonDezinBin();

		ausrechnen();

		ausgebenBinär();

		vonBininDez();
		ausgebenDez();

	}

	public void vonDezinBin() {
		total2 = dezimal * 2;

		for (int i = 7; i >= 0; i--) {
			total2 = total2 / 2;
			total = total2 % 2;

			binär[i] = total;
		}

		total4 = dezimal2 * 2;

		for (int i = 7; i >= 0; i--) {
			total4 = total4 / 2;
			total3 = total4 % 2;

			binär2[i] = total3;
		}
	}

	public void ausgebenBinär() {
		System.out.print("Zahl 1 in Binär > ");
		
		for (int s : binär) {
			System.out.print(s);
		}
		System.out.println();


		System.out.print("Zahl 2 in Binär > ");

		for (int s : binär2) {
			System.out.print(s);
		}
		System.out.println();

		System.out.print("Zahl 1 + Zahl 2 in Binär > ");

		for (int s : endbinär) {
			System.out.print(s);
		}
		System.out.println();
	}

	public void ausrechnen() {

		for (int i = 7; i >= 0; i--) {
			endbinär[i] = 0;
			if (binär[i] + binär2[i] + binär3[i] == 1) {
				endbinär[i] = endbinär[i] + 1;
			} else if (binär[i] + binär2[i] + binär3[i] == 2) {
				endbinär[i] = endbinär[i] + 0;
				binär3[i - 1] = binär3[i - 1] + 1;
			} else if (binär[i] + binär2[i] + binär3[i] == 3) {
				endbinär[i] = endbinär[i] + 1;
				binär3[i - 1] = binär3[i - 1] + 1;
			} else if (binär[i] + binär2[i] + binär3[i] == 4) {
				endbinär[i] = endbinär[i] + 1;
				binär3[i - 1] = binär3[i - 1] + 2;
			}
		}
	}

	public void vonBininDez() {
		dez[7] = binär[7] * 1;
		dez[6] = binär[6] * 2;
		dez[5] = binär[5] * 4;
		dez[4] = binär[4] * 8;
		dez[3] = binär[3] * 16;
		dez[2] = binär[2] * 32;
		dez[1] = binär[1] * 64;
		dez[0] = binär[0] * 128;

		dezimal = dez[7] + dez[6] + dez[5] + dez[4] + dez[3] + dez[2] + dez[1] + dez[0];

		dez2[7] = binär2[7] * 1;
		dez2[6] = binär2[6] * 2;
		dez2[5] = binär2[5] * 4;
		dez2[4] = binär2[4] * 8;
		dez2[3] = binär2[3] * 16;
		dez2[2] = binär2[2] * 32;
		dez2[1] = binär2[1] * 64;
		dez2[0] = binär2[0] * 128;

		dezimal2 = dez2[7] + dez2[6] + dez2[5] + dez2[4] + dez2[3] + dez2[2] + dez2[1] + dez2[0];

		dez3[7] = endbinär[7] * 1;
		dez3[6] = endbinär[6] * 2;
		dez3[5] = endbinär[5] * 4;
		dez3[4] = endbinär[4] * 8;
		dez3[3] = endbinär[3] * 16;
		dez3[2] = endbinär[2] * 32;
		dez3[1] = endbinär[1] * 64;
		dez3[0] = endbinär[0] * 128;

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
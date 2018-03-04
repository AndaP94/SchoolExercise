import java.util.Scanner;

public class Temperaturerfassung {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double kg, temp;

		System.out.println("Geben Sie die Temperatur in Grad an: ");

		temp = scan.nextDouble();

		System.out.println("Geben Sie die Kilogramm an: ");

		kg= scan.nextDouble();

		double gramm=kg*1000;

		if (temp<20) {          //5g = 100% unter 20 Grad   Luftfeuchtigkeit

			final int hundertProzent=5;

			double prozent=(gramm/hundertProzent)*100;

			System.out.printf("Die relative Luftfeuchtigkeit betraegt %.2f %%, wobei fuer %.2f die errechneten Prozent eingesetzt werden.\n", prozent, prozent);

				if(prozent<40) {

					System.out.println("Luftfeuchtigkeit ist zu gering");
				}

				else if(prozent>=40 && prozent <=60) {

					System.out.println("Optimale Luftfeuchtigkeit\" (40 - 60 %)");
				}

				else if(prozent > 60) {

					System.out.println("Luftfeuchtigkeit ist zu hoch!");
				}
			}
		if (temp >= 20 && temp <30) {

			final int hunderProzent2=17;    		// 17g = 100 % zwischen 20 und 30 Grad Luftfeuchtigkeit

			double prozent=(gramm/hunderProzent2)*100;

			System.out.printf("Die relative Luftfeuchtigkeit betraegt %.2f %%, wobei fuer %.2f die errechneten Prozent eingesetzt werden.\n", prozent, prozent);

			if(prozent<40) {

				System.out.println("Luftfeuchtigkeit ist zu gering");
			}

			else if(prozent>=40 && prozent <=60) {

				System.out.println("Optimale Luftfeuchtigkeit\" (40 - 60 %)");
			}

			else if(prozent > 60) {

				System.out.println("Luftfeuchtigkeit ist zu hoch!");
			}
		}

		if (temp >30 ) {								// 30g = 100% ueber 30 Grad Luftfeuchtigkeit

			final int hunderProzent3=30;

			double prozent=(gramm/hunderProzent3)*100;

			System.out.printf("Die relative Luftfeuchtigkeit betreagt %.2f %%, wobei fuer %.2f die errechneten Prozent eingesetzt werden.\n", prozent, prozent);

			if(prozent<40) {

				System.out.println("Luftfeuchtigkeit ist zu gering");
			}

			else if(prozent>=40 && prozent <=60) {

				System.out.println("Optimale Luftfeuchtigkeit\" (40 - 60 %)");
			}

			else if(prozent > 60) {

				System.out.println("Luftfeuchtigkeit ist zu hoch!");
			}
		}
	}
}

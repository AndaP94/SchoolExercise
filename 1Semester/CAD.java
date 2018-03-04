import java.util.Scanner;
public class CAD {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

		int x1, y1, x2, y2;

		double a;  //Flaeche

		boolean b = true;

		System.out.println("CAD Programm..");

		System.out.println("Berechnung der Flaeche des Dreiecks:");

		System.out.println("Bitte Geben Sie die Koordinaten fuer den erste Punkt (x1,y1) an:  ");

		x1 = scan.nextInt();

		y1 = scan.nextInt();

		System.out.println("Bitte Geben Sie die Koordinaten fuer den zweiten Punkt (x2,y2) an:  ");

		x2 = scan.nextInt();

		y2 = scan.nextInt();

		if(x1 < 0 || y1 < 0) {

			System.out.println("Bitte geben Sie einen posetive Wert an von dem ersten Punkt!!");

			b = false;
		}
		if(x2 < 0 || y2 < 0 ) {

				System.out.println("Bitte geben Sie einen posetive Wert an von dem zweiten Punkt!!");
				b = false;
			}
		if((y2-y1)<0 || (x2-x1)<0) {

			System.out.println("Geben Sie gueltige werte ein!!");

			b = false;
		}
		a=((x2-x1) * (y2-y1))/2;   //Flaeche =  (a x h) /2

		if(b==true) {

			System.out.println("Die Faeche des Dreiecks ist: " + a + "mm2" );
		}
	}
}

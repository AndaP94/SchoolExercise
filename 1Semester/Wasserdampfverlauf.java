import java.util.Scanner;
import java.util.ArrayList;
public class Wasserdampfverlauf {

	public static void main(String[] args) {

		int n ;   	//Anzahl der Wiederholungen
		ArrayList<Double> list=new ArrayList<>();
		double prozent=0, ges=0, minimal=200, maximal=0, trend =0;
		Scanner scan = new Scanner (System.in);
		System.out.println("Wie viele Wasserdampf Werte wollen Sie eingeben?");
		n = scan.nextInt();

		int i = 0;
		do {
			System.out.println((i+1) + ". Geben Sie den Wasserdampfwert ein in Prozent: ");

			prozent = scan.nextDouble();
			list.add(prozent);
			ges+= prozent;
			//Erste Eingabe keinen Trend
			if(i !=0){
				if(list.get(i)>list.get(i-1)){
					trend++;
				}
				else if(list.get(i)<list.get(i-1)){
					trend--;
				}
			}
			if(prozent<minimal) {
				minimal=prozent;
			}
			if(prozent>maximal) {
				maximal=prozent;
			}
			i++;
		}while(i<n);
		double mittelwert = ges/n;

		System.out.println("Der Mitterlwert ist " + mittelwert +" der Tiefstwert ist: " + minimal + " der Hoechstwert ist: " + maximal + trend);

		if(trend<0) {

			System.out.println("Sie haben einen negativen Trend ");
		}
		else if(trend>0) {

			System.out.println("Sie haben einen postiven Trend");
		}
		else if(trend==0) {
			System.out.println("Sie habe einen neutralen Trend");
		}
	}
}

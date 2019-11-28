/*FASE 2 (2 punts)
● Un cop tenim els noms de les ciutats guardats en variables haurem de pasar l’informacio a un array
(arrayCiutats). (1 punt)
● Quan tinguem l’array ple, haurem de mostrar per consola el nom de les ciutats ordenadas per ordre
alfabetic. (1 punt)
 */
import java.util.*;

public class CiutatsFase2 {

	public static void main(String[] args) {
		/*Scanner input = new Scanner(System.in);
		String a="";
		String b="";
		String c="";
		String d="";
		String e="";
		String f="";
		System.out.println("Si us plau, introdueix el nom de les ciutats:"
				+ "(Barcelona, Madrid, Valencia, Malaga, Cadis, Santander)");
		a=input.nextLine();
		b=input.nextLine();
		c=input.nextLine();
		d=input.nextLine();
		e=input.nextLine();
		f=input.nextLine();*/
		String a="Barcelona";
		String b="Madrid";
		String c="Valencia";
		String d="Malaga";
		String e="Cadis";
		String f="Santander";
		List<String> arrayCiutats = new ArrayList<String>(6);
		arrayCiutats.add(a);
		arrayCiutats.add(b);
		arrayCiutats.add(c);
		arrayCiutats.add(d);
		arrayCiutats.add(e);
		arrayCiutats.add(f);
		Collections.sort(arrayCiutats);
		for(String temp: arrayCiutats){
		    System.out.print(" "+temp);
			}
	}
}	


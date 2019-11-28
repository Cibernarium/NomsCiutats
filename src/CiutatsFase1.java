import java.util.*;

public class CiutatsFase1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String a="";
		String b="";
		String c="";
		String d="";
		String e="";
		String f="";
		System.out.println("Si us plau, introdueix el nom de les ciutats:"
				+ "(Barcelona, Madrid, Valencia, Malaga, Cadis, Santander)");
		a=entrada.nextLine();
		b=entrada.nextLine();
		c=entrada.nextLine();
		d=entrada.nextLine();
		e=entrada.nextLine();
		f=entrada.nextLine();
		//a="Barcelona";
		//b="Madrid";
		//c="Valencia";
		//d="Malaga";
		//e="Cadis";
		//f="Santander";
		System.out.println("Les ciutats son: "+a+" "+b+" "+c+" "+d+" "+e+" "+f); 
	}

}

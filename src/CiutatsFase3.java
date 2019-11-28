import java.util.*;


public class CiutatsFase3 {

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
		String temp="";
		String a="Barcelona";
		String b="Madrid";
		String c="Valencia";
		String d="Malaga";
		String e="Cadis";
		String f="Santander";
		System.out.println("Les ciutats son: "+a+" "+b+" "+c+" "+d+" "+e+" "+f);
		List<String> arrayCiutats = new ArrayList<String>(6);
		List<String> ArrayCiutatsModificades = new ArrayList<String>(6);
		arrayCiutats.add(a);
		arrayCiutats.add(b);
		arrayCiutats.add(c);
		arrayCiutats.add(d);
		arrayCiutats.add(e);
		arrayCiutats.add(f);
		Collections.sort(arrayCiutats);
		for (int i=0;i<arrayCiutats.size();i++) {
			temp=arrayCiutats.get(i);
			temp = temp.replace('a','4');
			ArrayCiutatsModificades.add(temp);
			}
		Collections.sort(ArrayCiutatsModificades);
		for (String temp2: ArrayCiutatsModificades) {
			System.out.print(" "+temp2);
			}
		
		}
}	

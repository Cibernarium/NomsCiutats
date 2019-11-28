/*Creeu un nou array per cada una de les ciutats que tenim. La mida dels nous arrays sera la
llargada de cada string ( string nomCiutat.Length). (0,5 punts)
● Ompliu els nous arrays lletra per lletra.(2 punts)
● Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB). (0,5 punts)*/

import java.util.*;

public class CiutatsFase4 {

	public static void main(String[] args) {
		char Barcelona[], Madrid[], Valencia[], Malaga[], Cadis[], Santander[];
		Barcelona = new char[9] ;
		Madrid = new char[6];
		Valencia = new char[8];
		Malaga = new char[6];
		Cadis = new char[5];
		Santander = new char[9];
		
		String stringBarcelona = "Barcelona";
		Barcelona = stringBarcelona.toCharArray();
		for (int i = 0; i <stringBarcelona.length(); i++) {
			Barcelona[i]=stringBarcelona.charAt(i);
		}
		String stringMadrid = "Madrid";
		Madrid = stringMadrid.toCharArray();
		for (int i = 0; i <stringMadrid.length(); i++) {
			Madrid[i]=stringMadrid.charAt(i);
		}
		String stringValencia = "Valencia";
		Valencia = stringValencia.toCharArray();
		for (int i = 0; i <stringValencia.length(); i++) {
			Valencia[i]=stringValencia.charAt(i);
		}
		String stringMalaga = "Malaga";
		Malaga = stringMalaga.toCharArray();
		for (int i = 0; i <stringMalaga.length(); i++) {
			Malaga[i]=stringMalaga.charAt(i);
		}
		String stringCadis = "Cadis";
		Cadis = stringCadis.toCharArray();
		for (int i = 0; i <stringCadis.length(); i++) {
			Cadis[i]=stringCadis.charAt(i);
		}
		String stringSantader = "Santander";
		Santander = stringSantader.toCharArray();
		for (int i = 0; i <stringSantader.length(); i++) {
			Santander[i]=stringSantader.charAt(i);
		}

		
		
		for(int i=0;i<Barcelona.length;i++){
		System.out.print(Barcelona[Barcelona.length-i-1]);
		}
		System.out.println();
		for(int i=0;i<Madrid.length;i++){
		System.out.print(Madrid[Madrid.length-i-1]);
		}	
		System.out.println();
		for(int i=0;i<Valencia.length;i++){
		System.out.print(Valencia[Valencia.length-i-1]);
		}	
		System.out.println();
		for(int i=0;i<Malaga.length;i++){
		System.out.print(Malaga[Malaga.length-i-1]);
		}	
		System.out.println();
		for(int i=0;i<Cadis.length;i++){
		System.out.print(Cadis[Cadis.length-i-1]);
		}	
		System.out.println();	
		for(int i=0;i<Santander.length;i++){
		System.out.print(Santander[Santander.length-i-1]);
		}
			
	}	
}		




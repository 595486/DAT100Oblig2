package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		/*Denne metoden tar inn ein tabell og skriv den ut i konsoll vinduet på formatet:
		 * [ <tall> .. <tall> ]
		 * 
		 * MERK! Den vil skrive det på same linja som forrige utskrift om den ikkje er skrive ut med println
		 */
		System.out.print("[ ");
		for (int t : tabell) {
			System.out.print(t + " ");
		}
		System.out.print("]\n");				
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String resultat = "[";
		
		for (int i=0; i<tabell.length; i++) {
			resultat += tabell[i];
			
			if (i<tabell.length-1) {
				resultat += ",";
			}

		}
		resultat += "]";
		return resultat;	}
	// c)
	public static int summer(int[] tabell) {
		/* Denne funksjonen summerer alle verdiane i ein tabell (innverdi) til ein sum(utverdi(int)).
		 */
		int sum = 0;
		for (int t : tabell) {
			sum = sum + t;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		/* Denne funksjonen sjekker om eit tall(innverdi) finnes i ein tabell (innverdi) 
		 * og returnerer ein sannheitsverdi for resultatet. 
		 */
		boolean finnes = false;
		int index = 0;
		while (finnes == false && index != tabell.length) { // Med ein gong me finner at tallet eksisterer i tabellen går me vidare
			if (tabell[index] == tall) {
				finnes = true;
			}
			index++;
		}
		return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		/* Denne metoden finner posisjonen til eit tall(innverdi), 
		 * i eit tabell (innverdi), og returnerer den fyrste verdien den finner.
		 * 
		 * MERK! Dersom tallet ikkje eksisterer i tabellen returnerer metoden verdien -1.
		 */
		int pos = -1, index = 0;
		while (pos == -1 && index != tabell.length) { /* om me finner at tallet har ein posisjon i tabellen går me
														 vidare (ellers går den gjennom heile tabellen)*/
			if (tabell[index] == tall) {
				pos = index;
			}
			index++;
		}
		return pos;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		/* Denne metoden reverserer rekkefølgen av verdiar presentert i ein tabell(innverdi) og gir ut den nye tabellen.
		 * 
		 * MERK! Det opprettes ein ny tabell (metoden gjør altså ikkje endringar på eksiterande tabeller)
		 */
		int[] rev = new int[tabell.length];
		for (int i = tabell.length - 1; i >= 0; i--) {
			rev[i] = tabell[Math.abs((tabell.length - 1) - i)];
		}
		return rev;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i=0; i < tabell.length-1; i++) {
			if (tabell[i] > tabell[i+1]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		/* Denne metoden setter sammen to tabeller(innverdier) og gir ut 
		 * ein ny tabell som består av begge tabellane
		 * 
		 * MERK! Metoden setter tabell1 fyrst i den nye tabellen etterfulgt av tabell2
		 */
		int lengde = tabell1.length + tabell2.length, index = 0;
		int[] sammen1 = new int[lengde], sammen2 = new int[lengde];

		for (int t : tabell1) {
			sammen1[index] = t;
			index++;
		}
		for (int t : tabell2) {
			sammen1[index] = t;
			index++;
		}

		return sammen1;

	}
}

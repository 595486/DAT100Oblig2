package no.hvl.dat100.june;

public class Tabell {

	// a)
	public static void skrivUt(int[] tabell) {// June
		System.out.print("[ ");
		for (int t : tabell) {
			System.out.print(t + " ");
		}
		System.out.print("]\n");
	}

	// b)
	public static String tilStreng(int[] tabell) { // June
		String tab = "[";
		for (int i = 0; i < tabell.length - 1; i++) {
			tab = tab + tabell[i] + ",";
		}
		tab = tab + tabell[tabell.length - 1] + "]";
		return tab;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int t : tabell) {
			sum = sum + t;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean finnes = false;
		int index = 0;
		while (finnes == false && index != tabell.length) { // Med ein gong me finner at tallet eksisterer i tabellen
															// går me vidare
			if (tabell[index] == tall) {
				finnes = true;
			}
			index++;
		}
		return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int pos = -1, index = 0;

		while (pos == -1 && index != tabell.length) { // om me finner at tallet har ein posisjon i tabellen går me
														// vidare (ellers går den gjennom heile tabellen)
			if (tabell[index] == tall) {
				pos = index;
			}
			index++;
		}
		return pos;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] rev = new int[tabell.length];
		for (int i = tabell.length - 1; i >= 0; i--) {
			rev[i] = tabell[Math.abs((tabell.length - 1) - i)];
		}
		return rev;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean sort = true;
		int index = 0;
		while (sort == true && index != tabell.length - 1) { // dersom uttrykket blir usann er det ikkje vits å gå
																// gjennom resten
			if (tabell[index] <= tabell[index + 1]) {
				index++;
			} else {
				sort = false;
			}
		}
		return sort;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) { // korleis vil dei ha dette sortert? skal eg berre
																	// legge tabell2 bak tabell 1 eller skal eg
																	// integrere verdiane? (Dette vil sjølvsagt ha
																	// forskjellege løysingar)
		int lengde = tabell1.length + tabell2.length, index = 0;
		int[] sammen1 = new int[lengde], sammen2 = new int[lengde];
		/* Alt 1 */
		for (int t : tabell1) {
			sammen1[index] = t;
			index++;
		}
		for (int t : tabell2) {
			sammen1[index] = t;
			index++;
		}
		/* Alt 2 */
		index = 0;
		for (int i = 0; i < lengde; i++) {
			if (tabell1.length == tabell2.length) {
				if (i % 2 == 0) {
					sammen2[index] = tabell1[i / 2];
				} else {
					sammen2[index] = tabell2[i / 2];
				}
				index++;
			}//Dette fungerer berre om begge tabellene er same lengde 

		}

		return sammen1;
	}
}

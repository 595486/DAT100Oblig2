package no.hvl.dat100.june;

public class Matrise {
	// a)
	public static void skrivUt(int[][] matrise) { // June
		/*Denne metoden tar inn ein matrise og skriv den ut i konsoll vinduet på formatet:
		 * [ [<tall> .. <tall>] .. [<tall> .. <tall>] ]
		 * 
		 * MERK! Den vil skrive det på same linja som forrige utskrift om den ikkje er skrive ut med println
		 */
		System.out.print("[ ");
		for (int tab[] : matrise) {
			System.out.print("[ ");
			for (int t : tab) {
				System.out.print(t + " ");
			}
			System.out.print("]");
		}
		System.out.print(" ]\n");
	}

	// b)
	public static String tilStreng(int[][] matrise) { // June
		/* Denne metoden returnerer ein String av ein matrise (innverdi) på formatet:
		 * <tall> .. <tall>\n ..\n <tall> .. <tall>\n
		 */
		String mat = "";
		for (int tab[] : matrise) {
			for (int t : tab) {
				mat = (mat + t + " ");
			}
			mat = (mat + "\n");
		}
		return mat;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) { //June
		/* Denne metoden oppretter ein ny matrise, der alle tallene frå ei matrise(innverdi) 
		 * er multipisert med eit tall(innverdi) for så å gi den nye matrisa.
		 */
		int[][] nyMat = new int[matrise.length][]; // Opprette matrise, med plass til alle tabellane
		for (int i = 0; i < matrise.length; i++) { // Kode for å plasere tabeller i matrise
			for (int j = 0; j < matrise[i].length; j++) {
				int[] tab = new int[matrise[i].length]; // Oppretter tabell som skal plasseres
				for (int t = 0; t < matrise[i].length; t++) { // Plasserer verdiar frå tabellene i matrisa til den nye
																// tabellen
					tab[t] = matrise[i][t] * tall; // Skalerer verdien i tabellen
					nyMat[i] = tab; // Setter tabellen inn i matrisen
				}
				}
				
		}
		return nyMat;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) { //June
		/* Denne metoden sjekker om to matriser er like og returnerer ein sannheitsverdi 
		 */
		boolean lik = true;
		if (a.length != b.length) {// Sjekker at matrisene har same lengde, og returnerer false dersom nei.
			lik = false;
		} else {
			for (int i = 0; i < a.length; i++) { // Sjekker at matrisene linker til same tabeller, og sjekker om tabell
													// verdiane er like dersom nei.
				if (a[i] != b[i]) {
					if (a[i].length != b[i].length) { // Sjekker at tabellene har same lengde, og returnerer false
														// dersom nei.
						lik = false;
					} else { // Sjekker om tabellverdiane er dei same, og returnerer false dersom nei.
						for (int j = 0; j < a[i].length; j++) {
							if (a[i][j] != b[i][j]) {
								lik = false;
							}
						}
					}
				}
			}
		}
		return lik;
	}

	// e)
	public static int[][] speile(int[][] matrise) {//June
		/* Denne metoden returnerer ein speilvendt matrise av inn matrisa.
		 * 
		 * MERK! Matrisa må vere kvadratisk. 
		 * Alt 2 tar alle rektangulære matriser, men er ikkje implimentert til å gi ein returverdi
		 */
		
		/*ALT 1 (Kvadratisk matrise)*/
		int lengde = matrise.length; 
		int[][] speil = new int[lengde][lengde]; // Opprette ny matrise
		for (int i = 0; i < lengde; i++) { // Ytre matrise
			for (int j = 0; j < lengde; j++) { // Indre tabell

				
					speil[i][j] = matrise[j][i];
				}
			}
		
		/*ALT 2 (Rektangulær matrise)*/
		int l = matrise.length, b = matrise[0].length; 
		int[][] speil2 = new int[b][l]; // Opprette ny matrise, der lengde/bredde er speilvendt
		for (int i = 0; i < b; i++) { // Ytre matrise
			for (int j = 0; j < l; j++) { // Indre tabell
				int[] tab = new int[l]; // Oppretter tabell som skal plasseres
				for (int t = 0; t < l; t++) { // plassering av tall
					tab[t] = matrise[j][t];
				}
				speil2[i] = tab; // plasserer tabellen i matrisa
			}
		}
		
		return speil;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) { //June
		/*
		 * Denne metoden tar inn ein matrise a og ein matrise b og multipliserer dei
		 * saman til ein ny matrise ab.
		 * 
		 * MERK!! enten antall kolloner i a og rekker i b, 
		 * eller rekker i a og kolloner i b må vere like
		 * Resultat matrisen blir skrive ut som om første alternativ er sant.
		 */
		int kolloner, rekker, felles;
		if (a.length != b[0].length) { //Dette gjør at så lenge ein av dei motsatte sidene til matrisene a og b er like kan metoden utføres
			kolloner = a.length;
			rekker = b[0].length;
			felles = b.length;
		}else {
			kolloner = b.length;
			rekker = a[0].length;
			felles = a.length;			
		}
		int[][] ab = new int[kolloner][rekker]; // Oppretter tabell
		for (int m = 0; m < kolloner; m++) { // Ytre matrise
			for (int p = 0; p < rekker; p++) { // Indre tabell
				int sum = 0;
				for (int n = 0; n < felles; n++) { // plassering av verdier
					sum = sum + a[m][n] * b[n][p]; // Sjølve multiplikasjonen
					
				}
				ab[m][p] = sum;
			}
		}
		return ab;
	}
}

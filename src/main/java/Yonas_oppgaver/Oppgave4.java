package Yonas_oppgaver;

public class Oppgave4 {
	
	public static void main(String[] args) { 
		
		int [] tab = {42, 67, 89};
		int [] tab2 = {14, 5, 10};

		
		// a) skrivUt(tab);
		
		// b) String svar = tilStreng(tab);
		//    System.out.println(svar);
		
		// c) int resultat = summer(tab);
		//    System.out.println(resultat);
		
		// d) System.out.println(finnesTall(tab, 8));
		
		// e) System.out.println(posisjonTall(tab, 42));
		
		// f) int[] reversert = reverser(tab);
        //    for (int i = 0; i < reversert.length; i++) {
        //    System.out.print(reversert[i] + " ");
        //    }
		
		// g) System.out.println(erSortert(tab));
		
		// h) int[] resultat = settSammen(tab, tab2);
		//    for (int i = 0; i < resultat.length; i++) {
	    //    System.out.print(resultat[i] + " ");
	    //    }
		
	
		
		
	}
	
		// a)
		public static void skrivUt(int[] tabell) {
			
			for (int i=0; i<tabell.length; i++) {
				
				System.out.println(tabell[i]);
			}

		}

		// b)
		public static String tilStreng(int[] tabell) {
			String resultat = "[";
			
			for (int i=0; i<tabell.length; i++) {
				resultat += tabell[i];
				
				if (i<tabell.length-1) {
					resultat += ", ";
				}

			}
			resultat += "]";
			return resultat;	
		
		}

		// c)
		public static int summer(int[] tabell) {
			int svar = 0;
			
			for (int i=0; i<tabell.length; i++) {
				svar += tabell[i];
				
			}
			return svar;

			
		}

		// d)
		public static boolean finnesTall(int[] tabell, int tall) {
			
			for (int i=0; i<tabell.length; i++) {
				if (tall == tabell[i]) {
					return true;
				}
				
			}
			return false;

		}

		// e)
		public static int posisjonTall(int[] tabell, int tall) {
			
			for (int i=0; i<tabell.length; i++) {
				if (tall == tabell[i]) {
					return i;
				}
			}
			return -1;

			
		}

		// f)
		public static int[] reverser(int[] tabell) {
			
			int[] tall = new int[tabell.length];

			for (int i=0; i<tabell.length; i++) {
				tall[tabell.length-1-i] = tabell[i]; 
			}
			return tall;
			
				
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
			
			int[] tall = new int[tabell1.length+tabell2.length];
			
			for (int i=0; i<tabell1.length; i++) {
				
				tall[i] = tabell1[i];
			}
			
			for (int i=0; i<tabell2.length; i++) {
				
				tall[i+tabell1.length] = tabell2[i];
			}
			return tall;
						

		}


}

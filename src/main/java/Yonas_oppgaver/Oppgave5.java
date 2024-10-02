
package Yonas_oppgaver;

public class Oppgave5 {
	public static void main(String[] args) { 
		int [][] tab = {
				{42, 67, 89},
				{12, 76, 32}
		};
		
		int [][] tab1 = {
				{42, 67, 89},
				{12, 76, 32}
		};
		
		// a) skrivUt(tab);
		
		// b) String resultat = tilStreng(tab);
		//  	System.out.println(resultat);
		
		// c) int[][] skallert = skaler(2, tab);
		
		//    for (int[] rad : skallert) {
		//		for (int element : rad) {
		//			System.out.print(element+" ");					
		//		}
		//	  }
		
		System.out.println(erLik(tab, tab1));
	
	
	}
		
	
		// a)
		public static void skrivUt(int[][] matrise) {
			for (int[] rad : matrise) {
				for (int tall : rad) {
					System.out.print(tall+" ");
				}
				System.out.println();
			}
								
		}

		// b)
		public static String tilStreng(int[][] matrise) {
			String svar = "";
			for (int[] rad : matrise) {
				for (int tall : rad) {
					svar += tall+" ";
				}
		
			}
			return svar;

			
			
		}

		// c)
		public static int[][] skaler(int tall, int[][] matrise) {
			
			int[][] tabell = new int[matrise.length][matrise[0].length];
			
			for (int i=0; i<matrise.length; i++) {
				for (int j=0; j<matrise[i].length; j++) {
					tabell[i][j] = matrise[i][j]*tall;					
				}
			}
			return tabell;						
		
		}

		// d)
		public static boolean erLik(int[][] a, int[][] b) {
			
			if (a.length != b.length) {
	            return false;
	        }

	        for (int i = 0; i < a.length; i++) {
	            if (a[i].length != b[i].length) {
	                return false;
	            }

	            for (int j = 0; j < a[i].length; j++) {
	                if (a[i][j] != b[i][j]) {
	                    return false;
	                }
	            }
	        }
	        return true;
			
		}
		
		// e)
		public static int[][] speile(int[][] matrise) {

			// TODO

			throw new UnsupportedOperationException("Metoden speile ikke implementert");
		
		}

		// f)
		public static int[][] multipliser(int[][] a, int[][] b) {

			// TODO
			throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
		
		}
		
				

}

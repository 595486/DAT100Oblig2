package no.hvl.dat100.june;

public class Test {

	public static void main(String[] args) {
		int[] t1= {42,67,89};
		int[] t2= {42,67,89,55,72,84};
		int[][]speile = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		String tab = Tabell.tilStreng(t1);
		
		/*Tabell.skrivUt(t1);
		int sum= Tabell.summer(t1);	
		boolean usann = Tabell.finnesTall(t1, 4);
		boolean sann = Tabell.finnesTall(t1, 89);
		int posf = Tabell.posisjonTall(t1, 0);
		int post = Tabell.posisjonTall(t1, 89);
		System.out.println(tab + "\n"+sum+"\n"+usann+"\n"+sann+"\n"+posf+"\n"+post);
		int[] rev = Tabell.reverser(t2);
		Tabell.skrivUt(rev);
		sann = Tabell.erSortert(t1);
		usann = Tabell.erSortert(t2);
		System.out.print(sann+"\n"+usann);
		int[]sammen=Tabell.settSammen(t1, rev);
		Tabell.skrivUt(sammen);*/
		int[][] matrise = new int[3][4];
		int[][] obs = {
				{4,7,9,0},
				{4,8,8,9,3},
				{-1,7,-2}	
				};
		Matrise.skrivUt(obs);
		/*String mat = Matrise.tilStreng(obs);
		int[][] abs =Matrise.skaler(3, obs);
		System.out.println(mat);
		Matrise.skrivUt(abs);
		System.out.println(Matrise.erLik(abs, obs)+" "+Matrise.erLik(abs, abs));*/
		int[][] speilet=Matrise.speile(speile);
		Matrise.skrivUt(speilet);
	}
}
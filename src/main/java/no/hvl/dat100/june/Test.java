package no.hvl.dat100.june;

public class Test {

	public static void main(String[] args) {
		int[] t1= {42,67,89};
		int[] t2= {42,67,89,55,72,84};
		
		String tab = Tabell.tilStreng(t1);
		
		Tabell.skrivUt(t1);
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
		Tabell.skrivUt(sammen);
	}

}

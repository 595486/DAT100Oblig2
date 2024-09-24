package no.hvl.dat100.june;

import no.hvl.dat100.tabeller.Tabeller;

public class Test {

	public static void main(String[] args) {
		int[] t1= {42,67,89};
		
		String tab = Tabeller.tilStreng(t1);
		System.out.println(tab);
		Tabeller.skrivUt(t1);
	}

}

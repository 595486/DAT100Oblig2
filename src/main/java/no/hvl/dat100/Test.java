package no.hvl.dat100;

import no.hvl.dat100.tabeller.Tabeller;

public class Test {

	public static void main(String[] args) {
		int[] t1= {42,67,89};
		Tabeller.skrivUt(t1);
		String tab = Tabeller.tilStreng(t1);
		System.out.println(tab);
	}

}

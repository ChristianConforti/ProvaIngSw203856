package Conforti.JUnitProvaIntermedia203856;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyListUtil {

	public List<Integer> lista;
	
	public MyListUtil() {
		lista = new ArrayList<Integer>(); 
	}
	
	public List<Integer> ordina(int scelta) {
		System.out.println("0 ordina la lista in modo decrescente, 1 in modo crescente!");
		if(scelta == 0) {
			System.out.println("Scelta 0: odine decrescente");
			Collections.sort(lista);
			Collections.reverse(lista);
			return lista;
		}
		else if (scelta == 1) {
			System.out.println("Scelta 1: odine crescente");
			Collections.sort(lista);
			return lista;
		}
		else {
			throw new IllegalArgumentException("Scelta non valida!");
		}
	}
	
}

package Array;

import org.junit.Test;

public class ArrayTeste {
	
	public int arranjo [] = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
	

	public int menor(int a []) {
		int minimo;
		for(int i = 1; i < a.length - 1; i++) {
			if (a[i] < a[0]) {
				minimo = a[i];
				a[0] = a[i];
				a[i] = minimo;
			}
		}
		
		return a[0];
		
		
	}
	
	public int maior(int a[]) {
		int maximo;
		for (int i = 1; i < a.length - 1; i++) {
			if (a[i] > a[0]) {
				maximo = a[i];
				a[i] = a[0];
				a[0] = maximo;
			}
		}
		
		return a[0];
		
	}
	
	public int soma(int a []) {
		int somatoria = 0;
		for (int i = 0; i < a.length; i+=2) {
			somatoria = somatoria + a[i] + a[i+1];
		}
		
		return somatoria;
	}
	
	public int repeticao(int a) {
		int count = 0;
		for (int i = 0; i < arranjo.length - 1; i++) {
			if (arranjo[i] == a) {
				count += 1;
			}
		}
		return count;
	}
	
	System.out.print(menor(arranjo));
	System.out.print(arranjo.maior());
	System.out.print(arranjo.soma());
	System.out.print(arranjo.repeticao(720));

	
	
}
package entites;

import java.util.Arrays;
import java.util.Random;

public class Colections {

	public int[] a = new int[15];
	public int[] b = new int[15];
	public int[] c = new int[15];
	public int[] d = new int[15];


	public Colections() {
		
	}

	public void RandomGenerate() {
		for(int i=0 ; i<15 ; i++){
			Random random = new Random();
			a[i] = random.nextInt(200); 
		}

		for(int i=0 ; i<15 ; i++){
			Random random = new Random();
			b[i] = random.nextInt(200); 
		}}

	public int totalPares(int[] a) {
		int total = 0;
		for(int i = 0; i<a.length; i++) {
			if(a[i]%2 == 0) {
				total += 1;
			}
		}

		return total;
	}

	public int maiorValor(int[] a) {
		int maior = Integer.MIN_VALUE;
		int indiceMaior = -1;
		for (int i = 0; i < a.length; i++) {
		    if (a[i] > maior) {
		        maior = a[i];
		        indiceMaior = i;
		    }
		}
		return maior;
	}

	public int totalIguais(int[] a, int[] b) {
		int iguais = 0;
		for(int i = 0; i<a.length; i++) {
			if(a[i] == b[i]) {
				iguais += 1;
			}
		}
		return iguais;
	}

	public int multiplicaArrays(int[] a, int[] b) {
		int c = 0;
		int d  = 0;
		int e = 0;
		for(int i = 0; i<a.length; i++) {
			c += a[i];
			d += b[i];
		}
		
		return c*d;
		
	}


	public int somaArrays(int[] a, int[] b) {
		int c = 0;
		for(int i = 0; i<a.length; i++) {
			c += a[i];
			c += b[i];
		}
		return c;
	}


	

	public void mostraDados(int[] a) {
			System.out.println(Arrays.toString(a));
	}

	public Double mediaArrays(int[] a, int[] b) {
		Double total = 0.0;

		for(int i = 0; i<a.length; i++) {
			total += a[i];
			total += b[i];
		}
		return total/30;
	}

	public int buscaArray(int[] a, int b){
		int busca = 0;

		for(int i = 0; i<a.length; i++) {
			if(a[i] == b) {busca = i;}
			else {busca = -1;}
		}
		return busca;
	}

	public void busca(int a) {
		Boolean pertence = false;
		for(int i = 0; i<this.a.length; i++) {
			if(a == this.a[i]  || a == this.b[i] || a == this.c[i] || a == this.d[i] ) {
				pertence = true;
			}
		}
			
		if(pertence == true) {
			System.out.println("Pertence");
		}
			else{
				System.out.println("Nao pertence");
		}
	
}























}










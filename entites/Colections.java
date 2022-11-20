package entites;

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
			a[i] = random.nextInt(); 
		}

		for(int i=0 ; i<15 ; i++){
			Random random = new Random();
			b[i] = random.nextInt(); 
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
		int maior = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > maior) {
				maior = a[i];
				maior = i;
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

	public void multiplicaArrays(int[] a, int[] b) {
		int[] c = new int[15];
		for(int i = 0; i<a.length; i++) {
			c[i] = a[i] * b[i];
		}

		for(int i = 0; i<a.length; i++) {
			System.out.print(c[i]);
		}
	}

	

	public void somaArrays(int[] a, int[] b) {
		int[] c = new int[15];
		for(int i = 0; i<a.length; i++) {
			c[i] = a[i] + b[i];
		}
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i]);
		}
	}

	

	public void mostraDados(int[] a) {
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i]);
		}
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










package main;


import entites.Colections;

public class Program {
	public static void main(String[] args) {
		Colections cl = new Colections();
		
		cl.RandomGenerate();
		
		System.out.println("Total pares: " + cl.totalPares(cl.a)); 
		System.out.println("Maior valor: " + cl.maiorValor(cl.a)); 
		System.out.println("Total iguais: " + cl.totalIguais(cl.a, cl.b)); 
		System.out.println("Multiplicar valores: " + cl.multiplicaArrays(cl.a, cl.b));
		System.out.println("Soma Arrays: " + cl.somaArrays(cl.a,cl.b));
		cl.mostraDados(cl.a);
		System.out.println("Busca: " + cl.buscaArray(cl.a, 5));
		cl.busca(5);
		
		
		
		
		
		
		
	}

}

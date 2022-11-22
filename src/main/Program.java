package main;

import java.util.Arrays;
import java.util.Random;

public class Program {
	public static void main(String[] args){
		

		
		int[] a = new int[7];
		int[] b = new int[7];
		
		Random random = new Random();
		for(int i=0 ; i<7 ; i++){
			a[i] = random.nextInt(0, 100); 
			b[i] = random.nextInt(0, 100); 
		}
		
		System.out.println(Arrays.toString(uniao(a, b)));
		
	}
	
	public static int[] uniao(int[]a, int[]b) {
		int[] c = new int[14];
		int count = 0;
		for(int i = 0; i<7; i++) {
			c[i] = a[i];
		}
		
		for(int i = 8; i<c.length; i++) {
			c[i] = b[count];
			count ++;
		}
		return c;
	}
	
}

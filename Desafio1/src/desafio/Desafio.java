package desafio;

import java.util.Scanner;
public class Desafio {

	 public static void main(String[] args) {
		 
		 Scanner teclado = new Scanner(System.in);
			int n = teclado.nextInt();
			int m = n;
			
		
			while(n>0) {
				String s = "";
				int qtdEspacos = n-1;
				for(int i=0;i<qtdEspacos; i++) {
					s += " ";
				}
				for(int j=0; j<(m-qtdEspacos); j++){
					s += "*";
				}
				System.out.println(s);
				n--;
			}
		
	 }
} 
	 
	
	


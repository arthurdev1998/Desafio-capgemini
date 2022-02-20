package desafio;

import java.util.Scanner;
public class Desafio {

	 public static void main(String[] args) {
		 
		 System.out.println("digite o tamanho da escada : ");
		 Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
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
	 
	
	


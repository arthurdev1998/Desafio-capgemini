package desafio2;

import java.util.Scanner;
public class Desafio2_Capgemini {

	public static void main(String[] args) {
	
		   String senha;

	        System.out.println("digite sua senha");

	        Scanner scan = new Scanner(System.in);

	        senha = scan.nextLine();

	        int qtdcaracter;
	        int qtd;
	        

	        String codigo1 = "^(?:(?=.*[0-9]).*)$";
	        String codigo2 = "^(?:(?=.*[A-Z]).*)$";
	        String codigo3 = "^(?:(?=.*[a-z]).*)$";
	        String codigo4 = "^(?:(?=.*[!@#$%^&*()-+]).*)$";

	        if (senha.matches(codigo1)) {

	        } else {
	            System.out.println("Sua senha precisa de pelo menos um número");
	            
	        }
	        if (senha.matches(codigo2)) {

	        } else {
	            System.out.println("Sua senha precisa de pelo menos uma letra Maiuscula");
	        }
	        if (senha.matches(codigo3)) {

	        } else {
	            System.out.println("Sua senha precisa de pelo menos uma letra minuscula");
	        }

	         if (senha.matches(codigo4)) {

	        } else {
	            System.out.println("Sua senha precisa de pelo menos um caracter especial");
	        }
	        
	         if(senha.length()<6){
	        
	             int Qtd = 6 - senha.length();
	             
	             System.out.printf("sua senha precisa de no mínimo mais %d caracteres : ",Qtd );
	        
	         }
	         
	    }

	}

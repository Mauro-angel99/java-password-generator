package org.generation.italy.security;

import java.util.Scanner;


public class PasswordGenerator {

	
	/*Ciao Ragazzi e Ragazze,
esercizio di oggi è un (insicurissimo) Password Generator
nome del repo: java-password-generator
Create un nuovo progetto java chiamato java-password-generator
Aggiungete un package org.generation.italy.security
Aggiungete una classe PasswordGenerator che contiene un metodo main
Il programma deve fare quanto segue:
salvare in opportune variabili il nome, cognome, colore preferito e data di nascita di un utente suddivisa in giorno, mese e anno in numero
generare (e stampare a video) una password  concatenando nome, cognome, colore preferito e somma di giorno, mese e anno di nascita, separate dal carattere -
Esempio: ho un utente che si chiama Pinco Pallo, nato il 12/05/1994, il cui colore preferito è il magenta
La sua password sarà Pinco-Pallo-magenta-2011
Buon lavoro :faccia_leggermente_sorridente:
*/
	
	  public static void main(String[] args) {
		  
		  Scanner sc = new Scanner(System.in);
	        
		    System.out.println("Name:");
	        String name = sc.nextLine();
	        
	        System.out.println("Cognome:");
	        String lastName = sc.nextLine();
	       
	        
	        System.out.println("colore:");
	        String color = sc.nextLine();
	      
	        
	        
	        System.out.println("giorno:");
	        int day = sc.nextInt();
	      
	        
	        System.out.println("mese:");
	        int mounth = sc.nextInt();
	   
	        
	        System.out.println("anno:");
	        int year = sc.nextInt();
	        
	        int number = day + mounth + year;
	    
	        String pwd = name + "-" + lastName + "-" + color + "-" + number;
	        System.out.println(pwd);
	      }

}


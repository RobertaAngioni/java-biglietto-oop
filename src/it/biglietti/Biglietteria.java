package it.biglietti;

import java.util.Scanner;

public class Biglietteria {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int eta;
		int km;
		
//		Biglietto biglietto1 = new Biglietto();
		
		try {
		do {
		 
		   System.out.print("Inserisci la tua età: ");
		   eta = scan.nextInt();
		
		 
		}while(eta < 0 || eta > 112);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		do {
			System.out.print("Inserisci il numero di km: ");
			 km = scan.nextInt();
			}while(km < 0);
		
		
		
		
//		
//		try {
//		   Biglietto biglietto = new Biglietto(eta, km);
//		   System.out.println(biglietto.calcolaPrezzo());
//		}catch (Exception e) {
//			System.out.println(e);
//		}
//		

			
		
		
		
		scan.close();
		
	}
}

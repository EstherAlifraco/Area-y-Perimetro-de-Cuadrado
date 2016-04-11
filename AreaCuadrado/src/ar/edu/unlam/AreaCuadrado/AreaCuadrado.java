package ar.edu.unlam.AreaCuadrado;

import java.util.Scanner; 

public class AreaCuadrado {
	
	 static int area(int base,int altura){
		 
		 return (base*altura);
		
		
		}
	 
	 static int perimetro(int lado1, int lado2){
		 
		 return (lado1*2 + lado2*2);
	 }
	 
	 public static void main(String args[]){
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Escribe la base: ");
	      int base = sc.nextInt();
	      System.out.println("Escribe la altura: ");
	      int altura = sc.nextInt();	

	      System.out.println("Area: "+area(base,altura));
	      System.out.println("Perimetro: "+perimetro(base,altura));
	   }

}

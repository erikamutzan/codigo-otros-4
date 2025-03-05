
//se probo en eclipse y el package com.generation; funciona al no estar comentado
//se probo en visual studio code y al comentar el package permite correrlo en la terminal y tambien funciona


//package com.generation; 

import java.util.Scanner;

public class Ejercicio4 { //se corrigio de Codigo 4 a Ejercicio4

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // se agrego entre parentesis el System.in
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    Scanner s2 = new Scanner(System.in); // se agrego entre parentesis el System.in
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); // se coloco el 2
	    String j2 = s2.nextLine(); //se agrego el s2
	    

	    if (j1.equals (j2))  {  //se borro el parentesis, no se ocupa ==
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2.equals("tijeras")) { // se agrego equals
	            g = 1;
	          }
	          break; // se agrego el break
	        case "papel":
	          if (j2.equals ("piedra")) { //se agrego equals
	            g = 1;
	          } // se agrego la llave del bloque del codigo
	          break; //se agrego el break
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default:
	      }
	      System.out.println("Gana el jugador " + g);
	    }

	}

} // se agrego la ultima llave del codigo

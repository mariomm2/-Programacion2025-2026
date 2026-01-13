package bol1;

import java.util.Scanner;

public class Ej10 {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int num = 0;
	        int contador = 0;
	        int sumaImpares = 0;
	        int contImpares = 0;
	        int mayorPar = -1;

	        while (num >= 0) {
	            System.out.print("Introduce un num: ");
	            num = scan.nextInt();

	            if (num >= 0) {
	                contador++;
	                if (num % 2 == 0) {
	                    if (num > mayorPar) {
	                        mayorPar = num;
	                    }
	                } else {
	                    sumaImpares = sumaImpares + num;
	                    contImpares++;
	                }}}
	        System.out.println("Total: " + contador);

	        if (contImpares > 0) {
	            System.out.println("Media impares: " + (sumaImpares/contImpares));
	        }
	        System.out.println("Mayor par: " + mayorPar);
	      }}


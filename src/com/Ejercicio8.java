package com;

import java.math.BigInteger;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Generamos los array a partir de los números que ingresa el usuario
		int[] arrayMain = new int[10];
		int[] arrayOrder = new int[10];
		Scanner in = new Scanner(System.in);
	    System.out.println("Vas a ingresar 10 numeros ");

	    for (int i = 0; i < 10; i++) {
	      System.out.println("Ingresa un numero: ");
	      arrayMain[i] = in.nextInt();
	    }
	    System.out.println("Array Original (el de entrada)");
	    printArrya(arrayMain);
	    int countPrime = 0;
	    //Empieza desde el final del arreglo
	    int countNonPrime = arrayMain.length - 1; 
	    for (int num : arrayMain) {
	      if (isPrime(num)) {
	    	//Agrega a los primos
	        arrayOrder[countPrime++] = num; 
	      } else {
	    	//Agrega a los no primos 
	        arrayOrder[countNonPrime--] = num; 
	      }
	    }

	    System.out.println("Array Ordenado Primos Primero");
	    printArrya(arrayOrder);
	    in.close();
	  }
		
	  public static boolean isPrime(int num) {
	    BigInteger numBig = new BigInteger("" + num);
	    return numBig.isProbablePrime(50);
	  }

	  static void printArrya(int[] num) {
	    for (int i = 0; i < 10; i++) {
	      System.out.println(i + " - " + num[i]);
	    }
	  }
}
/*
 Crear un programa en Java que realice lo siguiente:
Debe solicitar al usuario 10 números por consola y almacenarlos en un array.
Debe pasar los números que sean primos a las primeras posiciones, desplazando los demás números al final, de tal forma que no se pierda ningún número.
Debe mostrar por consola el array original, mostrando el índice seguido del valor de la posición.
Debe mostrar por consola el array que contiene los números primos al principio, mostrando el índice seguido del valor de la posición. El orden de los números no importa, siempre y cuando los números primos vayan al principio del array.
Prueba tu programa con las siguientes entradas para asegurarte que funcione correctamente:
1, 2, 3, 4, 5, 6, 7, 8, 9, 10.
Array original mostrando la posición del array más el valor.
0 - 1
1 - 2
2 - 3
3 - 4
4 - 5
5 - 6
6 - 7
7 - 8
8 - 9
9 - 10
Array con los números primos en las primeras posiciones, mostrando la posición del array más el valor.
0 - 2
1 - 3
2 - 5
3 - 7
4 - 1
5 - 4
6 - 6
7 - 8
8 - 9
9 - 10
Entradas: 
Salidas:
Pruébalo con las combinaciones de números que se te ocurran.
 * */
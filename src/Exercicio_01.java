/*
 * Escreva um algoritmo que armazene o valor 10 em uma vari�vel A e o valor 20 em uma vari�vel B.
   A seguir (utilizando apenas atribui��es entre vari�veis) troque os seus conte�dos fazendo com que o
   valor que est� em A passe para B e vice-versa. Ao final, escrever os valores que ficaram armazenados
   nas vari�veis. 
 * 
 */


public class Exercicio_01 {

	public static void main(String[] args) {
	
		int a;
		int b;	
		
		a = 10;
		b = 20;
		
		int bAux = b;
		
		
		b = a; //a = 10 
		a = bAux; // a=20
		
		System.out.println("Variav�l a:  " + a);
		System.out.println("Variavel b:  " + b);
		
		

	}

}

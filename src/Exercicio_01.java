/*
 * Escreva um algoritmo que armazene o valor 10 em uma variável A e o valor 20 em uma variável B.
   A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o
   valor que está em A passe para B e vice-versa. Ao final, escrever os valores que ficaram armazenados
   nas variáveis. 
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
		
		System.out.println("Variavél a:  " + a);
		System.out.println("Variavel b:  " + b);
		
		

	}

}

import javax.swing.JOptionPane;

/*
 * Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.
 * 
 */
public class Exercicio_11 {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		
		int antecessor  = numero -1;
		
		JOptionPane.showMessageDialog(null,  "O Antecessor do Numero é : " + antecessor);		
				
		

	}

}

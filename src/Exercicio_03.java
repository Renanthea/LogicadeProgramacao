import javax.swing.JOptionPane;

/*	Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso
 *	contrário escrever NÃO É MAIOR QUE 10! 
 * 
 */

public class Exercicio_03 {

	public static void main(String[] args) {
		
		int valor ;
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		
		if(valor > 10) {
			JOptionPane.showMessageDialog(null,"é maior que 10");
			
		}else{
			JOptionPane.showMessageDialog(null,"não é maior que 10");
		}
		
			

	}

}

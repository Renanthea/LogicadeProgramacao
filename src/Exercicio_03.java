import javax.swing.JOptionPane;

/*	Ler um valor e escrever a mensagem � MAIOR QUE 10! se o valor lido for maior que 10, caso
 *	contr�rio escrever N�O � MAIOR QUE 10! 
 * 
 */

public class Exercicio_03 {

	public static void main(String[] args) {
		
		int valor ;
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		
		if(valor > 10) {
			JOptionPane.showMessageDialog(null,"� maior que 10");
			
		}else{
			JOptionPane.showMessageDialog(null,"n�o � maior que 10");
		}
		
			

	}

}

import javax.swing.JOptionPane;

/*
 * Escreva um algoritmo para ler o sal�rio mensal atual de um funcion�rio e o percentual de reajuste.
 * Calcular e escrever o valor do novo sal�rio.  * 
 * 
 */
public class Exercicio_13 {

	public static void main(String[] args) {
		
		double salarioAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite seu Sal�rio"));
		double percentualReajuste = Double.parseDouble(JOptionPane.showInputDialog(" Digite o Percentual de Reajuste"));
		
		double SalarioFinal = salarioAtual +  (salarioAtual*(percentualReajuste/100));
		
		JOptionPane.showMessageDialog(null, "O Sal�rio com o Reajuste �  " + SalarioFinal);		
		

	}

}

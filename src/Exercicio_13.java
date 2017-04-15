import javax.swing.JOptionPane;

/*
 * Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
 * Calcular e escrever o valor do novo salário.  * 
 * 
 */
public class Exercicio_13 {

	public static void main(String[] args) {
		
		double salarioAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite seu Salário"));
		double percentualReajuste = Double.parseDouble(JOptionPane.showInputDialog(" Digite o Percentual de Reajuste"));
		
		double SalarioFinal = salarioAtual +  (salarioAtual*(percentualReajuste/100));
		
		JOptionPane.showMessageDialog(null, "O Salário com o Reajuste é  " + SalarioFinal);		
		

	}

}

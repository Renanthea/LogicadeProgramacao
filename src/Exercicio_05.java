import javax.swing.JOptionPane;

/*As ma��s custam R$ 1,30 cada,  se forem compradas menos de uma d�zia, e R$ 1,00 se forem
compradas pelo menos 12. Escreva um programa que leia o n�mero de ma��s compradas, calcule e
escreva o custo total da compra.
*/


public class Exercicio_05 {

	public static void main(String[] args) {
		
		
		
int qtdeMacas ;

qtdeMacas = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de ma�as compradas "));

double totalCompra = 0 ;
double valorUnitario = 0;
		
		
		
		if(qtdeMacas < 12) {
			valorUnitario = 1.30;//JOptionPane.showMessageDialog(null,"Paga 1,00 por cadaa ");
			
		}else{
			valorUnitario = 1.00;//JOptionPane.showMessageDialog(null,"Paga 1,30 por cada");
		}
		totalCompra = qtdeMacas*valorUnitario;
			
		JOptionPane.showMessageDialog(null,"Valor Total de Compra:  " + totalCompra);		
		
	}
	
		

}

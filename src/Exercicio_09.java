import javax.swing.JOptionPane;

/*
 *Ler dois valores (considere que n�o ser�o lidos valores iguais) e escrev�-los em ordem crescente. 
 * 
 */
 


public class Exercicio_09 {

	public static void main(String[] args) {
	
		double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
		double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo  n�mero"));
		
		if(valor1==valor2){
			
			JOptionPane.showMessageDialog(null, "Valores s�o iguais");
						
		}
		else if (valor1>valor2) {
			JOptionPane.showMessageDialog(null, "\n Valor1: " + valor1 + "\n valor2: " + valor2);
			
			
		}else {
			JOptionPane.showMessageDialog(null, "\nValor2: " + valor2 + "\nValor1: " + valor1);
					
			
		}	
		
		

	}

}

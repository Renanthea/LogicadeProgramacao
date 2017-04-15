import javax.swing.JOptionPane;

/*
 *Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente. 
 * 
 */
 


public class Exercicio_09 {

	public static void main(String[] args) {
	
		double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
		double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo  número"));
		
		if(valor1==valor2){
			
			JOptionPane.showMessageDialog(null, "Valores são iguais");
						
		}
		else if (valor1>valor2) {
			JOptionPane.showMessageDialog(null, "\n Valor1: " + valor1 + "\n valor2: " + valor2);
			
			
		}else {
			JOptionPane.showMessageDialog(null, "\nValor2: " + valor2 + "\nValor1: " + valor1);
					
			
		}	
		
		

	}

}

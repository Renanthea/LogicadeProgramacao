import javax.swing.JOptionPane;

/*
 * Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.
 */

public class Exercicio_08 {

	public static void main(String[] args) {
	
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		
		if(valor1==valor2){
			
			JOptionPane.showMessageDialog(null, "Valores são iguais");
			
		}
		
		if (valor1>valor2) {
			JOptionPane.showMessageDialog(null, "o maior valor é " + valor1);
			
		}else if(valor2 > valor1){
			JOptionPane.showMessageDialog(null, "o maior valor é " + valor2);
			
		}	
		
		

	}

}

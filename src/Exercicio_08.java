import javax.swing.JOptionPane;

/*
 * Ler dois valores (considere que n�o ser�o lidos valores iguais) e escrever o maior deles.
 */

public class Exercicio_08 {

	public static void main(String[] args) {
	
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		
		if(valor1==valor2){
			
			JOptionPane.showMessageDialog(null, "Valores s�o iguais");
			
		}
		
		if (valor1>valor2) {
			JOptionPane.showMessageDialog(null, "o maior valor � " + valor1);
			
		}else if(valor2 > valor1){
			JOptionPane.showMessageDialog(null, "o maior valor � " + valor2);
			
		}	
		
		

	}

}

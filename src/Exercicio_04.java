import javax.swing.JOptionPane;

//Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).

public class Exercicio_04 {

	public static void main(String[] args) {
		
int valor ;
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		
		if(valor >= 0) {
			JOptionPane.showMessageDialog(null,"é positivo");
			
		}else{
			JOptionPane.showMessageDialog(null,"é negativo");
		}
		
	}

}

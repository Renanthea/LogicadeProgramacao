import javax.swing.JOptionPane;

//Ler um valor e escrever se � positivo ou negativo (considere o valor zero como positivo).

public class Exercicio_04 {

	public static void main(String[] args) {
		
int valor ;
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		
		if(valor >= 0) {
			JOptionPane.showMessageDialog(null,"� positivo");
			
		}else{
			JOptionPane.showMessageDialog(null,"� negativo");
		}
		
	}

}

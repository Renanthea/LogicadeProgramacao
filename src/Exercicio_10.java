import javax.swing.JOptionPane;

/*
 * Escreva um algoritmo para ler as dimens�es de um ret�ngulo (base e altura), 
 * calcular e escrever a �rea do ret�ngulo.
 *  
 */

public class Exercicio_10 {

	public static void main(String[] args) {
		
		double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base ")) ;
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
		
		double areaRetangulo = base * altura;
		
		JOptionPane.showMessageDialog(null, " A Area do Retangulo � : " + areaRetangulo );
		
			
		

	}

}

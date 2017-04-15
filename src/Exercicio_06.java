import javax.swing.JOptionPane;

/*
 * Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
 * uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
 * aluno é aprovado). Escrever também a média calculada.
 *   
 */
public class Exercicio_06 {

	public static void main(String[] args) {
		
		double nota1;
		double nota2;
		
		nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua primeira nota"));
		nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua segunda nota"));
		
		double media = (nota1+nota2) / 2;
		
		JOptionPane.showMessageDialog(null,"A media das notas é :" +media);		
		
		if(media>=6 ) {
			JOptionPane.showMessageDialog(null,"Aluno Aprovado");
			
		}else{
			JOptionPane.showMessageDialog(null,"Anuno não Aprovado");
		}		
		

	}

}

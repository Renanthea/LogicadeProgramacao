import javax.swing.JOptionPane;

/*
* 	Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
*   poder� ou n�o votar este ano (n�o � necess�rio considerar o m�s em que a pessoa nasceu).
*/
public class Exercicio_07 {

	public static void main(String[] args) {	
	
		
		int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano Atual"));
		
		int AnoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu ano de Nascimento "));
		
		
		int idade =  anoAtual - AnoNasc;
		
		if  (idade >= 18 ) {
			
			JOptionPane.showMessageDialog(null, "\nSua idade � : " + idade + "\n Pode votar");
			
		}else{
			
			
			JOptionPane.showMessageDialog(null,"\nSua idade � : " + idade + "\n N�o pode votar");
		}
		
		
		

	}

}

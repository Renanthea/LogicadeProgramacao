import javax.swing.JOptionPane;

/*	Escreva um algoritmo para ler o n�mero total de eleitores de um munic�pio, o n�mero de votos
*	brancos, nulos e v�lidos. Calcular e escrever o percentual que cada um representa em rela��o ao total
*	de eleitores.
*/
public class Exercicio_12 {

	public static void main(String[] args) {
		
	int totalVotos = Integer.parseInt(JOptionPane.showInputDialog("Digite o Total de Votos"));
	int votosBrancos = Integer.parseInt(JOptionPane.showInputDialog("Digite o Total de Votos Brancos"));
	int votosNulos = Integer.parseInt(JOptionPane.showInputDialog("Digite o Total de Votos Nulos  "));
	int votosValidos = Integer.parseInt(JOptionPane.showInputDialog("Digite o Total de Votos Validos "));

	double percentualVotosBrancos = (votosBrancos *100) / totalVotos;
	double percentualVotosNulos = (votosNulos *100) / totalVotos;
	double percentualVotosValidos = (votosValidos *100) / totalVotos;
	
	JOptionPane.showMessageDialog(null, "\nO Percentual de Votos Brancos foi : " + percentualVotosBrancos +  "%" +
										"\nO Percentual de Votos Nulos foi   : " + percentualVotosNulos +  "%" + 
										"\nO Percentual de Votos V�lidos foi : " + percentualVotosValidos +  "%" );				
		
	}

}

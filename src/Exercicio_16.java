import javax.swing.JOptionPane;

/*	Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
 *	correspondente em graus Celsius (baseado na f�rmula abaixo):
 *	 				 C        F- 32
 *				    -------= -----------
 *	 				 5           9
    Observa��o: Para testar se a sua resposta est� correta saiba que 100�C = 212F 
 * 
 * 
 */
public class Exercicio_16 {

	public static void main(String[] args) {
		
		int temperaturaEmFahrenheit = Integer.parseInt(JOptionPane.showInputDialog("Digite a Temperatura "));
		
		int tempCelsius = (temperaturaEmFahrenheit - 32) *5 / 9;
		
		JOptionPane.showMessageDialog(null, "A temperatura em Celsius � : " +  tempCelsius);
		

	}

}

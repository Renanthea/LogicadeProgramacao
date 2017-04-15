import javax.swing.JOptionPane;

/*
 * 	Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
 *	dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
 */


public class Exercicio_02 {

	public static void main(String[] args) {
		
		int ano;
		int dia;
		int mes;
		
		ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano"));
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o Dia"));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o Mês"));
		
		int diasTotal=0;
		
		int diasTotaisAnos = ano * 365;
		int diasTotaisMeses = mes *30 ;
		diasTotal = diasTotaisAnos + diasTotaisMeses+ dia;
		
		JOptionPane.showMessageDialog(null , "A Quantidade de Dias são : " + diasTotal);		
		
		

	}

}

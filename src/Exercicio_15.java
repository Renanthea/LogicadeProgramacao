import javax.swing.JOptionPane;

/*
 * Uma revendedora de carros usados paga a seus funcion�rios vendedores um sal�rio fixo por m�s,
 * mais uma comiss�o tamb�m fixa para cada carro vendido e mais 5% do valor das vendas por ele
 * efetuadas. Escrever um algoritmo que leia o n�mero de carros por ele vendidos, o valor total de suas
 * vendas, o sal�rio fixo e o valor que ele recebe por carro vendido. Calcule e escreva o sal�rio final do
 * vendedor.  
 * 
 */
public class Exercicio_15 {

	public static void main(String[] args) {
		
		int percentualGanhoValorVenda = 5;
		
		
		int TotalCarrosVendidos = Integer.parseInt(JOptionPane.showInputDialog(
										"Digite a quantidade de Carros Vendidos"));
		
		double valorTotaldasVendas = Double.parseDouble(JOptionPane.showInputDialog(
										"Digite  o valor Total de Vendas"));
		
		double salarioFixo = Double.parseDouble(JOptionPane.showInputDialog(
										"Digite seu sal�rio fixo "));		
		
		double valorPagoCarroVendido = Double.parseDouble(JOptionPane.showInputDialog(
										"Digite o valor pago por carro vendido"));
		
		double salarioFinal = salarioFixo + (
						TotalCarrosVendidos * valorPagoCarroVendido) + ((
						valorTotaldasVendas * percentualGanhoValorVenda) /100 );
		
		
		
		
		
		JOptionPane.showMessageDialog(null, "O Sal�rio do Funcion�rio � :  R$ " + salarioFinal);
		
		
		
		//double custoPercentualDistribuidor = (valorCustoFabrica * percentualDistribuidor) /100; 
		
		
		
		
		
				
		
		
		
		

	}

}

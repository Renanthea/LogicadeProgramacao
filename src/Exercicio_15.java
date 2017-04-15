import javax.swing.JOptionPane;

/*
 * Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
 * mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
 * efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
 * vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
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
										"Digite seu salário fixo "));		
		
		double valorPagoCarroVendido = Double.parseDouble(JOptionPane.showInputDialog(
										"Digite o valor pago por carro vendido"));
		
		double salarioFinal = salarioFixo + (
						TotalCarrosVendidos * valorPagoCarroVendido) + ((
						valorTotaldasVendas * percentualGanhoValorVenda) /100 );
		
		
		
		
		
		JOptionPane.showMessageDialog(null, "O Salário do Funcionário é :  R$ " + salarioFinal);
		
		
		
		//double custoPercentualDistribuidor = (valorCustoFabrica * percentualDistribuidor) /100; 
		
		
		
		
		
				
		
		
		
		

	}

}

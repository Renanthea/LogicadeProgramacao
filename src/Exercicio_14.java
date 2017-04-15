import javax.swing.JOptionPane;

/*
 * 	O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
 *	distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
 *	seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
 *	calcular e escrever o custo final ao consumidor.  
 * 
 */


public class Exercicio_14 {

	public static void main(String[] args) {
		
		int percentualDistribuidor = 28;
		int percentualImposto = 45;
		
		double valorCustoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do carro"));
		
		double custoPercentualDistribuidor = (valorCustoFabrica * percentualDistribuidor) /100; 
		double custoPercentualImposto =  (valorCustoFabrica * percentualImposto) /100; 
		
		double valorTotalConsumidor = valorCustoFabrica + custoPercentualDistribuidor + custoPercentualImposto;
		
		JOptionPane.showMessageDialog(null,"O Valor de compra para o Consumidor Comprar o Carro é :  " + valorTotalConsumidor);	
			

	}

}

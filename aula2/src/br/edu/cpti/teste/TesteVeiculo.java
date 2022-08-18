package br.edu.cpti.teste;

import br.edu.cpti.model.Caminhao;
import br.edu.cpti.model.VeiculoPasseio;

public class TesteVeiculo {
	public static void main(String[] args) {
		Caminhao c1 = new Caminhao();
		
		c1.setPlaca("K-2455");
		c1.setCargaMaxima(1245.5);
		c1.setCor("Verde");
		c1.setValor(300.000);
		System.out.println("IPVA CAMINHAO " + c1.calcularIPVA());
		
		VeiculoPasseio v1 = new VeiculoPasseio();
		v1.setPlaca("Lorem-2344");
		v1.setPlaca("K-2455");
		v1.setCor("Verde");
		v1.setValor(500.000);
		System.out.println("IPVA VEICULO PASSEIO " + c1.calcularIPVA());
		
	}

}

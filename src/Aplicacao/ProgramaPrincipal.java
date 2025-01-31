package Aplicacao;

import Entidades.Cliente;
import Entidades.Pedido;
import Entidades.Produto;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Cliente c1 = new Cliente ("haylla", "6546494954", "65654654654", "Rua A");
		Produto p1 = new Produto ("arroz", "tio lauterio", "tipo 1", 15.90);
		Pedido pedido = new Pedido ("27.05.1999", 10, c1, p1);

		pedido.ExibirPedido();
		
		
	}

}

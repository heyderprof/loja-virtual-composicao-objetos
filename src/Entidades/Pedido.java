package Entidades;

public class Pedido {

	private String data;
	private int quantidade;
	
	private Cliente cliente;
	private Produto produto;
	
	
	public Pedido() {
	}

	public Pedido(String data, int quantidade, Cliente cliente, Produto produto) {

		this.data = data;
		this.quantidade = quantidade;
		this.cliente = cliente;
		this.produto = produto;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public double CalcularPreco() {
		return quantidade * produto.getPreco() ;
		
	}
	
	public void ExibirPedido() {
		System.out.println("*** Resumo do Pedido ***");
		System.out.println("data: " + data);
		System.out.println(cliente);
		System.out.println(produto);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("\nValor total: " + String.format("%.2f",CalcularPreco()));
	}
	
	
	
}

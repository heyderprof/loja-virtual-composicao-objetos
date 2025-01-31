package Entidades;

public class Produto {

	private String nome;
	private String marca;
	private String modelo;
	private double preco;
	
	
	public Produto() {
	}
	public Produto(String nome, String marca, String modelo, double preco) {

		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String toString() {
		return  "\n*** Dados do Produto ***\n" + 
				"Produto: " + nome + "\n" +
				"Marca: " + marca + "\n" +
				"Modelo: " + modelo + "\n" +
				"Preço: R$ " + String.format("%.2f", preco);
	}
	
	
}

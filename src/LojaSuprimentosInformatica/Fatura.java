package LojaSuprimentosInformatica;

public class Fatura {
	
	private String numero;
	private String descricao;
	private int quantidade;
	private double preco;
	
	public Fatura(String numero, String descricao, int quantidade, double preco) {
		this.numero = numero;
		this.descricao = descricao;
		this.quantidade = (quantidade > 0) ? quantidade : 0;
		this.preco = (preco > 0.0) ? preco : 0.0;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = (quantidade > 0) ? quantidade : 0;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = (preco > 0.0) ? preco : 0.0;
	}
	
	public double total () {
		return quantidade * preco;
	}

	@Override
	public String toString() {
		return "Fatura [Número=" + numero + ", Descrição=" + descricao + ", Quantidade=" + quantidade + ", Preço="
				+ String.format("%.2f", preco) + ", Total=" +  String.format("%.2f", total()) + "]";
	}

}

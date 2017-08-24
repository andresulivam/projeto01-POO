package br.com.cotemig.entidades;

public class Produto {
	private String nome;
	private ItemNotaFiscal itemNotaFiscal;
	
	public Produto(ItemNotaFiscal itemNotaFiscal) {
		super();
		this.itemNotaFiscal = itemNotaFiscal;
	}

	public Produto(String nome, ItemNotaFiscal itemNotaFiscal) {
		super();
		this.nome = nome;
		this.itemNotaFiscal = itemNotaFiscal;
	}

	public Produto(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ItemNotaFiscal getItemNotaFiscal() {
		return itemNotaFiscal;
	}

	public void setItemNotaFiscal(ItemNotaFiscal itemNotaFiscal) {
		this.itemNotaFiscal = itemNotaFiscal;
	}
	
}

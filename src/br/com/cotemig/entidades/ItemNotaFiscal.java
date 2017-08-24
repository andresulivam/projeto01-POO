package br.com.cotemig.entidades;
/**
 * 
 * @author curso01
 *
 */
public class ItemNotaFiscal {
	
	private Integer quantidade;
	private Double valorUnitario;
	private Produto produto;
		
	public ItemNotaFiscal() {
		super();
	}
	
	/**
	 * Construtor
	 * @param produto
	 */
	public ItemNotaFiscal(Produto produto) {
		super();
		this.produto = produto;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	/**
	 * @return valor total do item X quantidade
	 */
	public double calcularValorTotal(){
		if( quantidade != null && valorUnitario != null){
			return quantidade * valorUnitario;
		}
		return 0;
	}
}

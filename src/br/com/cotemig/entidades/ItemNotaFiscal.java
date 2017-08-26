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
	private NotaFiscal notaFiscal;
		
	public ItemNotaFiscal() {
		super();
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
	
	public NotaFiscal getNotaFiscal() {
		return notaFiscal;
	}

	public void setNotaFiscal(NotaFiscal notaFiscal) {
		this.notaFiscal = notaFiscal;
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

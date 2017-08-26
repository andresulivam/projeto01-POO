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

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemNotaFiscal other = (ItemNotaFiscal) obj;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		if (quantidade == null) {
			if (other.quantidade != null)
				return false;
		} else if (!quantidade.equals(other.quantidade))
			return false;
		if (valorUnitario == null) {
			if (other.valorUnitario != null)
				return false;
		} else if (!valorUnitario.equals(other.valorUnitario))
			return false;
		return true;
	}
	
	
}

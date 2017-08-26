package br.com.cotemig.entidades;

/**
 * @author andresulivam
 */
public class PovoadorItemNotaFiscal {
	static int cont = 0;
	
	/**
	 * @author andresulivam
	 */
	static ItemNotaFiscal povoarItemNotaFiscal(Integer quantidade, NotaFiscal notaFiscal, Double valorUnitario) {
		
		ItemNotaFiscal d = new ItemNotaFiscal();
		d.setQuantidade(quantidade);
		d.setValorUnitario(valorUnitario);
		d.setProduto(PovoadorProduto.povoarProduto(d));
		d.setNotaFiscal(notaFiscal);
		
		return d;
	}
}

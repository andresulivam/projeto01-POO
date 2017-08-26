package br.com.cotemig.entidades;

import java.util.Random;

/**
 * @author andresulivam
 */
public class PovoadorItemNotaFiscal {
	static int cont = 0;
	
	/**
	 * @author andresulivam
	 */
	static ItemNotaFiscal povoarItemNotaFiscal(Integer quantidade, NotaFiscal notaFiscal) {
		Random r = new Random();
		
		ItemNotaFiscal d = new ItemNotaFiscal();
		d.setQuantidade(quantidade);
		d.setValorUnitario(20 + r.nextDouble()* 20);
		d.setProduto(PovoadorProduto.povoarProduto(d));
		d.setNotaFiscal(notaFiscal);
		
		return d;
	}
}

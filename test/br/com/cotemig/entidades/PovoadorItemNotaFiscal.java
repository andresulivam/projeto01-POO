package br.com.cotemig.entidades;

import java.util.Random;

public class PovoadorItemNotaFiscal {
	static int cont = 0;
	
	/**
	 * @author 51700140
	 * @param quantidade
	 * @return
	 */
	static ItemNotaFiscal povoarItemNotaFiscal(Integer quantidade) {
		Random r = new Random();
		
		ItemNotaFiscal d = new ItemNotaFiscal();
		d.setQuantidade(quantidade);
		d.setValorUnitario(20 + r.nextDouble()* 20);
		d.setProduto(PovoadorProduto.povoarProduto(d));
		
		return d;
	}
}

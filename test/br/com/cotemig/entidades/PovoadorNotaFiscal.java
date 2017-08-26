/**
 * 
 */
package br.com.cotemig.entidades;

import java.util.Calendar;

/**
 * @author andresulivam
 *
 */
public class PovoadorNotaFiscal {
	
	/**
	 * @author andresulivam
	 */
	static NotaFiscal povoarNotaFiscal(Cliente cliente, int quantidadeItensNotaFiscal) {
		
		NotaFiscal d = new NotaFiscal(cliente);
		d.setDataEmissao(Calendar.getInstance());
		
		/* Adicionando elementos a nota fiscal */
		for(int i = 0; i < quantidadeItensNotaFiscal; i++){
			d.adicionarItemNaNota(PovoadorItemNotaFiscal.povoarItemNotaFiscal(1, d, 30d));
		}
		
		return d;
	}
}

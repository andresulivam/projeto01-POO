/**
 * 
 */
package br.com.cotemig.entidades;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

/**
 * @author andresulivam
 *
 */
public class TesteNotaFiscal {

	@Test
	public void testarCalcularValorTotal() {
		// setup
		Cliente cliente = new Cliente("Cliente 1", Calendar.getInstance());
		NotaFiscal notaFiscal = PovoadorNotaFiscal.povoarNotaFiscal(cliente, 2);

		// execução
		double valorTotal = notaFiscal.calcularValorTotal();

		// assert
		assertEquals(60, valorTotal, 0);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Test
	public void testarEquals() {
		//setup
		Cliente cliente = new Cliente("Cliente 1", Calendar.getInstance());
		NotaFiscal notaFiscal1 = PovoadorNotaFiscal.povoarNotaFiscal(cliente, 2);
		NotaFiscal notaFiscal2 = PovoadorNotaFiscal.povoarNotaFiscal(cliente, 2);
		
		Calendar c = Calendar.getInstance();
		notaFiscal1.setDataEmissao(c);
		notaFiscal2.setDataEmissao(c);
		
		//assert
		assertEquals(notaFiscal1, notaFiscal2);
		
	}

}

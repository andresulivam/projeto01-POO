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
public class TesteItemNotaFiscal {

	@Test
	public void testarCalcularValorTotal() {
		// setup
		Cliente cliente = new Cliente("Cliente 1", Calendar.getInstance());
		NotaFiscal notaFiscal = new NotaFiscal(cliente);
		ItemNotaFiscal itemNotaFiscal = PovoadorItemNotaFiscal.povoarItemNotaFiscal(3, notaFiscal, 20d);
		
		// execuçãoo
		double valorTotal = itemNotaFiscal.calcularValorTotal();

		// assert
		assertEquals(60, valorTotal, 0);
	}

}

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

}

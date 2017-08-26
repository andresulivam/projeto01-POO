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
	

	@Test
	public void testarCalcularValorTotal2() {
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
	
	/**
	 * {@inheritDoc}
	 */
	@Test
	public void testarEquals2() {
		//setup
		Cliente cliente = new Cliente("Cliente 1", Calendar.getInstance());
		Cliente cliente2 = new Cliente("Cliente 1", Calendar.getInstance());
		
		NotaFiscal notaFiscal1 = PovoadorNotaFiscal.povoarNotaFiscal(cliente, 2);
		NotaFiscal notaFiscal2 = PovoadorNotaFiscal.povoarNotaFiscal(cliente2, 2);
		
		Calendar c = Calendar.getInstance();
		notaFiscal1.setDataEmissao(c);
		notaFiscal2.setDataEmissao(c);
		
		//assert
		assertNotEquals(notaFiscal1, notaFiscal2);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Test
	public void testarEquals3() {
		//setup
		Cliente cliente = new Cliente("Cliente 1", Calendar.getInstance());
		
		NotaFiscal notaFiscal1 = PovoadorNotaFiscal.povoarNotaFiscal(cliente, 2);
	
		Calendar c = Calendar.getInstance();
		notaFiscal1.setDataEmissao(c);
		
		//assert
		assertNotEquals(notaFiscal1, notaFiscal1);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Test
	public void testarEquals4() {
		//setup
		Cliente cliente = new Cliente("Cliente 1", Calendar.getInstance());
		
		NotaFiscal notaFiscal1 = PovoadorNotaFiscal.povoarNotaFiscal(cliente, 2);
	
		Calendar c = Calendar.getInstance();
		notaFiscal1.setDataEmissao(c);
		
		//assert
		assertNotEquals(notaFiscal1, null);
	}

	/**
	 * {@inheritDoc}
	 */
	@Test
	public void testarEquals5() {
		//setup
		Cliente cliente = new Cliente("Cliente 1", Calendar.getInstance());
		
		NotaFiscal notaFiscal1 = PovoadorNotaFiscal.povoarNotaFiscal(cliente, 2);
	
		Calendar c = Calendar.getInstance();
		notaFiscal1.setDataEmissao(c);
		
		//assert
		assertNotEquals(notaFiscal1, c);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Test
	public void testarEquals6() {
		//setup
		Cliente cliente = new Cliente("Cliente 1", Calendar.getInstance());
		NotaFiscal notaFiscal1 = PovoadorNotaFiscal.povoarNotaFiscal(null, 2);
		NotaFiscal notaFiscal2 = PovoadorNotaFiscal.povoarNotaFiscal(cliente, 2);
		
		Calendar c = Calendar.getInstance();
		notaFiscal1.setDataEmissao(c);
		notaFiscal2.setDataEmissao(c);
		
		//assert
		assertNotEquals(notaFiscal1, notaFiscal2);	
	}

	/**
	 * {@inheritDoc}
	 */
	@Test
	public void testarEquals7() {
		//setup
		NotaFiscal notaFiscal1 = PovoadorNotaFiscal.povoarNotaFiscal(null, 2);
		NotaFiscal notaFiscal2 = PovoadorNotaFiscal.povoarNotaFiscal(null, 2);
		
		Calendar c = Calendar.getInstance();
		notaFiscal1.setDataEmissao(c);
		notaFiscal2.setDataEmissao(c);
		
		//assert
		assertNotEquals(notaFiscal1, notaFiscal2);	
	}

	/**
	 * {@inheritDoc}
	 */
	@Test
	public void testarEquals8() {
		//setup
		NotaFiscal notaFiscal1 = PovoadorNotaFiscal.povoarNotaFiscal(null, 2);
		NotaFiscal notaFiscal2 = PovoadorNotaFiscal.povoarNotaFiscal(null, 2);
		
		Calendar c = Calendar.getInstance();
		notaFiscal1.setDataEmissao(null);
		notaFiscal2.setDataEmissao(c);
		
		//assert
		assertNotEquals(notaFiscal1, notaFiscal2);	
	}

	/**
	 * {@inheritDoc}
	 */
	@Test
	public void testarEquals9() {
		//setup
		NotaFiscal notaFiscal1 = PovoadorNotaFiscal.povoarNotaFiscal(null, 2);
		NotaFiscal notaFiscal2 = PovoadorNotaFiscal.povoarNotaFiscal(null, 2);
		
		notaFiscal1.setDataEmissao(null);
		notaFiscal2.setDataEmissao(null);
		
		//assert
		assertNotEquals(notaFiscal1, notaFiscal2);	
	}

	/**
	 * {@inheritDoc}
	 */
	@Test
	public void testarEquals10() {
		//setup
		Calendar c = Calendar.getInstance();
		NotaFiscal notaFiscal1 = PovoadorNotaFiscal.povoarNotaFiscal(null, 2);
		NotaFiscal notaFiscal2 = PovoadorNotaFiscal.povoarNotaFiscal(null, 2);
		
		Calendar c2 = Calendar.getInstance();
		notaFiscal1.setDataEmissao(c);
		notaFiscal2.setDataEmissao(c2);
		
		//assert
		assertNotEquals(notaFiscal1, notaFiscal2);	
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Test
	public void testarEquals11() {
		//setup
		Cliente cliente = new Cliente("Cliente 1", Calendar.getInstance());
		NotaFiscal notaFiscal1 = PovoadorNotaFiscal.povoarNotaFiscal(cliente, 2);
		NotaFiscal notaFiscal2 = PovoadorNotaFiscal.povoarNotaFiscal(cliente, 2);
		
		Calendar c = Calendar.getInstance();
		notaFiscal1.setDataEmissao(c);
		notaFiscal2.setDataEmissao(c);
		
		notaFiscal1.setItensNotaFiscal(null);
		
		//assert
		assertNotEquals(notaFiscal1, notaFiscal2);	
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Test
	public void testarEquals12() {
		//setup
		Cliente cliente = new Cliente("Cliente 1", Calendar.getInstance());
		NotaFiscal notaFiscal1 = PovoadorNotaFiscal.povoarNotaFiscal(cliente, 2);
		NotaFiscal notaFiscal2 = PovoadorNotaFiscal.povoarNotaFiscal(cliente, 2);
		
		Calendar c = Calendar.getInstance();
		notaFiscal1.setDataEmissao(c);
		notaFiscal2.setDataEmissao(null);
		
		//assert
		assertNotEquals(notaFiscal1, notaFiscal2);	
	}

	/**
	 * {@inheritDoc}
	 */
	@Test
	public void testarEquals13() {
		//setup
		Cliente cliente = new Cliente("Cliente 1", Calendar.getInstance());
		NotaFiscal notaFiscal1 = PovoadorNotaFiscal.povoarNotaFiscal(cliente, 2);
		NotaFiscal notaFiscal2 = PovoadorNotaFiscal.povoarNotaFiscal(cliente, 2);
		
		Calendar c = Calendar.getInstance();
		notaFiscal1.setDataEmissao(null);
		notaFiscal2.setDataEmissao(null);
		
		//assert
		assertNotEquals(notaFiscal1, notaFiscal2);	
	}

	/**
	 * {@inheritDoc}
	 */
	@Test
	public void testarEquals14() {
		//setup
		Cliente cliente = new Cliente("Cliente 1", Calendar.getInstance());
		NotaFiscal notaFiscal1 = PovoadorNotaFiscal.povoarNotaFiscal(cliente, 2);
		NotaFiscal notaFiscal2 = PovoadorNotaFiscal.povoarNotaFiscal(cliente, 2);
		
		notaFiscal1.setItensNotaFiscal(null);
		notaFiscal2.setItensNotaFiscal(null);
		//assert
		assertEquals(notaFiscal1, notaFiscal2);	
	}

	/**
	 * {@inheritDoc}
	 */
	@Test
	public void testarEquals15() {
		//setup
		Cliente cliente = new Cliente("Cliente 1", Calendar.getInstance());
		NotaFiscal notaFiscal1 = PovoadorNotaFiscal.povoarNotaFiscal(cliente, 2);
		NotaFiscal notaFiscal2 = PovoadorNotaFiscal.povoarNotaFiscal(cliente, 2);
		
		notaFiscal1.getItensNotaFiscal().get(0).setProduto(null);
		
		//assert
		assertNotEquals(notaFiscal1, notaFiscal2);	
	}


}

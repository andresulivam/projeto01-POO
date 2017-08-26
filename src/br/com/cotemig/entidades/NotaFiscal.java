package br.com.cotemig.entidades;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * 
 * @author curso01
 *
 */
public class NotaFiscal {
	
	private Calendar dataEmissao;
	private ArrayList<ItemNotaFiscal> itensNotaFiscal;
	private Cliente cliente;

	/**
	 * Construtor
	 * @param cliente
	 */
	public NotaFiscal(Cliente cliente) {
		super();
		itensNotaFiscal = new ArrayList<ItemNotaFiscal>();
		this.cliente = cliente;
	}
	
	public Calendar getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return Retorna o valor total de itens da nota
	 */
	public Double calcularValorTotal() {
		Double result = 0d;
		for(int i = 0; i < itensNotaFiscal.size(); i++){
			result += itensNotaFiscal.get(i).calcularValorTotal();
		}
		return result;
	}
	
	/**
	 * Adiciona itens a lista
	 * @param item
	 */
	public void adicionarItemNaNota(ItemNotaFiscal item){
		if(item != null){
			itensNotaFiscal.add(item);
		}
	}

	/**
	 * Retorna o tamanho da lista
	 * @return
	 */
	public int getTamanhoLista(){
		return itensNotaFiscal.size();
	}

}

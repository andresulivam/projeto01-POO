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
	 * @return the itensNotaFiscal
	 */
	public ArrayList<ItemNotaFiscal> getItensNotaFiscal() {
		return itensNotaFiscal;
	}

	/**
	 * @param itensNotaFiscal the itensNotaFiscal to set
	 */
	public void setItensNotaFiscal(ArrayList<ItemNotaFiscal> itensNotaFiscal) {
		this.itensNotaFiscal = itensNotaFiscal;
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
		NotaFiscal other = (NotaFiscal) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (dataEmissao == null) {
			if (other.dataEmissao != null)
				return false;
		} else if (!dataEmissao.equals(other.dataEmissao))
			return false;
		if (itensNotaFiscal == null) {
			if (other.itensNotaFiscal != null)
				return false;
		} else if (!itensNotaFiscal.equals(other.itensNotaFiscal))
			return false;
		return true;
	}
	

}

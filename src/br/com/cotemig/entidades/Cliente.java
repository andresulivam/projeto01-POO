package br.com.cotemig.entidades;

import java.util.ArrayList;
/**
 * 
 * @author curso01
 *
 */
import java.util.Calendar;

public class Cliente {
	private String nome;
	private Calendar dataNascimento;
	private ArrayList<NotaFiscal> notasFiscais;
	
	public Cliente(String nome, Calendar dataNascimento) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		notasFiscais = new ArrayList<NotaFiscal>();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public ArrayList<NotaFiscal> getNotasFiscais() {
		return notasFiscais;
	}
	public void setNotasFiscais(ArrayList<NotaFiscal> notasFiscais) {
		this.notasFiscais = notasFiscais;
	}
	
	
}

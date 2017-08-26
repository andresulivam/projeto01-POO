package br.com.cotemig.entidades;

import java.util.Calendar;

public class PovoadorCliente {
	static Integer contador = 1;
	
	public static Cliente povoarCliente() {
		
		String nome = "Nome "+contador;
		Cliente cliente = new Cliente(nome, Calendar.getInstance());
		contador++;
		return cliente;
		
	}
}

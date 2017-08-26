package br.com.cotemig.entidades;

/**
 * @author andresulivam
 */
public class PovoadorProduto {
	static Integer contador = 1;
	
	/**
	 * @author andresulivam
	 */
	public static Produto povoarProduto(ItemNotaFiscal itemNotaFiscal){
		Produto produto = new Produto(contador.toString(), itemNotaFiscal);
		contador++;
		return produto;	
	}

}

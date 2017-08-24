package br.com.cotemig.entidades;

/**
 * @author curso01
 *
 */
public class PovoadorProduto {
	static Integer contador = 1;
	
	/**
	 * Retorna 1 produto
	 * @return
	 */
	public static Produto povoarProduto(ItemNotaFiscal itemNotaFiscal){
		Produto produto = new Produto(contador.toString());
		produto.setItemNotaFiscal(itemNotaFiscal);
		contador++;
		return produto;
	}

}

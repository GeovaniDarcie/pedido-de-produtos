package br.pucpcaldas.pedidos.dominio;

/** 
 * Um objeto classe <code>ItemDoPedido</code> representa as informações de um
 * item associado a um objeto <code>Pedido</code>.
 * 
 * @author Geovani Darcie
 * @Version 1.0
 * @see Pedido
*/

public class ItemDoPedido {
	private Produto produto;
	private double quantidade;

    /**
     * construtor da classe.
     * 
     * @param produto o produto assocciado ao item.
     * @param quantidade a quantidade de produtos do item.
    */
	public ItemDoPedido(Produto produto, double quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

    /**
     * Calcula o custo total do item que é igual ao preço do produto
     * multipliado pela quantidade comprada.
     * 
     * @return
    */
	public double calculaCusto() {
		return this.produto.getPreco() * this.quantidade;
	}

	@Override
	public String toString() {
		return String.format("ItemDoPedido : produto=%s, quantidade=%.2f",
				this.produto, this.quantidade);
	}
}

package Logica;

import java.util.ArrayList;
import java.util.List;

import Model.ListaProduto;
import Model.Produto;

public class LogicaListaProduto {

	private List<ListaProduto> listaProdutos = new ArrayList<ListaProduto>();
	
	public List<ListaProduto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<ListaProduto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

	public void adicionaListaProduto(ListaProduto lista) {
		listaProdutos.add(lista);
		
	}

	public void removeListaProduto(ListaProduto lista) {
		getListaProdutos().remove(lista);
	}

	public void alteraQuantidadeProduto(Produto produto, int qtde) {
		for (int i = 0; i < getListaProdutos().size(); i++){
			if (produto.equals(getListaProdutos().get(i))){
				getListaProdutos().get(i).setQuantidade(qtde);
			}
		}
	}

}

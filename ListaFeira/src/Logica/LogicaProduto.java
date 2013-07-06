package Logica;

import java.util.ArrayList;
import java.util.List;

import Model.Produto;

public class LogicaProduto {

private List<Produto> listaProdutos;
	
	public List<Produto> getListaProdutos() {
		if (listaProdutos == null){
			listaProdutos = new ArrayList<Produto>();
		}
		return listaProdutos;
	}
	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	public void adicionaProduto(Produto produto) {
		getListaProdutos().add(produto);
	}
	
	public void removeProduto(Produto produto) {
		getListaProdutos().remove(produto);
	}

}

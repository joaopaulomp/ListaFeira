package Facade;

import java.util.List;

import Logica.LogicaListaProduto;
import Logica.LogicaProduto;
import Model.ListaProduto;
import Model.Produto;

public class Fachada {

	private LogicaProduto logicaProduto = new LogicaProduto();
	private LogicaListaProduto logicaListaProduto = new LogicaListaProduto();
	
	public void novoProduto(Produto produto) {
		logicaProduto.adicionaProduto(produto);
	}

	public List<Produto> getProdutos() {
		return logicaProduto.getListaProdutos();
	}

	public void removeProduto(Produto produto) {
		logicaProduto.removeProduto(produto);
		
	}

	public void novoListaProduto(ListaProduto ListaProduto) {
		logicaListaProduto.adicionaListaProduto(ListaProduto);
		
	}
	
	public List<ListaProduto> getListaProdutos(){
		return logicaListaProduto.getListaProdutos();
	}

	public void removeListaProduto(ListaProduto ListaProduto) {
		logicaListaProduto.removeListaProduto(ListaProduto);
	}

	public void alteraQtdeProduto(Produto produto, int qtde) {
		logicaListaProduto.alteraQuantidadeProduto(produto, qtde);
	}


}

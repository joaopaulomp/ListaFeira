package Teste;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import Facade.Fachada;
import Model.ListaProduto;
import Model.Produto;


public class ListaProdutoTeste {
	
	private ListaProduto lista;
	private Produto produto;
	private Fachada fachada;
	
	@Before
	public void inicializa(){
		lista = new ListaProduto();
		produto = new Produto();
		fachada = new Fachada();
	}
	
	@Test
	public void novoListaProduto(){
		criaNovoListaProduto();
		
		fachada.novoListaProduto(lista);
		
		Assert.assertEquals(1, fachada.getProdutos().size());
	}
	
	@Test
	public void removeListaProduto(){
		criaNovoListaProduto();
		
		fachada.novoListaProduto(lista);
		fachada.removeListaProduto(lista);
		
		Assert.assertEquals(0, fachada.getProdutos().size());
	}
	
	@Test
	public void alteraQtdeProduto(){
		criaNovoListaProduto();
		fachada.novoListaProduto(lista);
		
		fachada.alteraQtdeProduto(produto, 10);
		Assert.assertEquals(10, fachada.getListaProdutos().get(0).getQuantidade());
	}

	private void criaNovoListaProduto() {
		produto.setNome("Sneakers");
		produto.setTipo("Chocolate");
		
		lista.setProduto(produto);
		lista.setQuantidade(2);
	}


}

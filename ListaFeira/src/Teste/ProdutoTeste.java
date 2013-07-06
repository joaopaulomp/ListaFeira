package Teste;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import Facade.Fachada;
import Model.Produto;


public class ProdutoTeste {

	private Produto produto;
	private Fachada fachada;
	
	@Before
	public void inicializa(){
		produto = new Produto();
		fachada = new Fachada();
	}
	
	@Test
	public void novoProduto(){
		cadastrarNovoProduto();
		
		Assert.assertEquals(1, fachada.getProdutos().size());
		Assert.assertEquals("Teste", fachada.getProdutos().get(0).getNome());
		Assert.assertEquals("Limpeza", fachada.getProdutos().get(0).getTipo());
	}
	
	public void removeProduto(){
		cadastrarNovoProduto();
		fachada.removeProduto(produto);
		Assert.assertEquals(0, fachada.getProdutos().size());
	}

	private void cadastrarNovoProduto() {
		produto.setNome("Teste");
		produto.setTipo("Limpeza");
		
		fachada.novoProduto(produto);
	}
}

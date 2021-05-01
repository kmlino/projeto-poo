package br.edu.facthus.poo.service;

import java.util.ArrayList;

import br.edu.facthus.poo.model.Produto;

public class ProdutosService {
	
	private static ArrayList<Produto> produtos = 
			new ArrayList<>();
	
	public static void cadastra(Produto produto) {
		// Ex. 04a - Inserir um produto na lista
		produtos.add(produto);
	}
	
	public static Produto pesquisa(Integer id) {
		// Ex. 04b - Pesquisar produtos na lista
		// Se não houver produto com o id informado, retorna null
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getId().equals(id)) {
				return produtos.get(i);
			}
		}
		return null;
	}
	

} 

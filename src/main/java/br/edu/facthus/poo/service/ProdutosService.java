package br.edu.facthus.poo.service;

import java.util.ArrayList;

import br.edu.facthus.poo.model.Produto;

public class ProdutosService {
	
	private static ArrayList<Produto> produtos = 
			new ArrayList<>();
	
	public static void cadastra(Produto produto) {
		produtos.add(produto);
	}
	
	public static Produto pesquisa(Integer id) {
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getId().equals(id)) {
				return produtos.get(i);
			}
		}
		return null;
	}
	
	public static void atualiza(Produto produto) {
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getId().equals(produto.getId())) {
				produtos.get(i).setQuantidade(produto.getQuantidade());
				return;
			}
		}
	}

} 
